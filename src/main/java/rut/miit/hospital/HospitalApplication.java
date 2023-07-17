package rut.miit.hospital;

import org.modelmapper.ModelMapper;
import org.modelmapper.TypeMap;
import org.modelmapper.config.Configuration;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import rut.miit.hospital.dtos.DoctorDto;
import rut.miit.hospital.dtos.PatientDto;
import rut.miit.hospital.models.Doctor;
import rut.miit.hospital.models.Patient;

@SpringBootApplication
public class HospitalApplication {


    @Bean
    public ModelMapper modelMapper(){
        ModelMapper modelMapper = new ModelMapper();

        modelMapper.getConfiguration()
                .setFieldMatchingEnabled(true)
                .setFieldAccessLevel(Configuration.AccessLevel.PRIVATE);

        TypeMap<Doctor, DoctorDto> typeMapDoctor = modelMapper.createTypeMap(Doctor.class,DoctorDto.class);
        typeMapDoctor.addMappings(m->m.map(src -> src.getPerson().getFirstName(),DoctorDto::setFirstName));
        typeMapDoctor.addMappings(m->m.map(src -> src.getPerson().getLastName(),DoctorDto::setLastName));

        TypeMap<Patient, PatientDto> typeMapPatient = modelMapper.createTypeMap(Patient.class,PatientDto.class);
        typeMapDoctor.addMappings(m->m.map(src -> src.getPerson().getFirstName(),DoctorDto::setFirstName));
        typeMapDoctor.addMappings(m->m.map(src -> src.getPerson().getLastName(),DoctorDto::setLastName));

        return modelMapper;
    }

    public static void main(String[] args) {
        SpringApplication.run(HospitalApplication.class, args);
    }

}
