package rut.miit.hospital;

import org.modelmapper.ModelMapper;
import org.modelmapper.config.Configuration;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class HospitalApplication {


    @Bean
    public ModelMapper modelMapper(){
        ModelMapper modelMapper = new ModelMapper();

        modelMapper.getConfiguration()
                .setFieldMatchingEnabled(true)
                .setFieldAccessLevel(Configuration.AccessLevel.PRIVATE);

//   Игнорирование свойств не игнорирует, а делает их NULL поэтому из-за nullable = false ловишь ошибку,
//   игн.свойств работает в две строны, даже если добавлять все поля, то в бд все равно придут поля из фильтра со значениями NULL
//        TypeMap<DoctorDto, Doctor> typeMapDoctor = modelMapper.createTypeMap(DoctorDto.class,Doctor.class);
//        typeMapDoctor.addMappings(mapper -> mapper.skip(Doctor::setSalary));
//        typeMapDoctor.addMappings(mapper -> mapper.skip(Doctor::setLicenseNumber));




        return modelMapper;
    }

    public static void main(String[] args) {
        SpringApplication.run(HospitalApplication.class, args);
    }

}
