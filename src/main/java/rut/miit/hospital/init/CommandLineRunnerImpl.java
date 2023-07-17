package rut.miit.hospital.init;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import rut.miit.hospital.dtos.ContactDto;
import rut.miit.hospital.dtos.DoctorDto;
import rut.miit.hospital.dtos.PatientDto;
import rut.miit.hospital.dtos.PersonDto;
import rut.miit.hospital.services.ContactService;
import rut.miit.hospital.services.DoctorService;
import rut.miit.hospital.services.PatientService;
import rut.miit.hospital.services.PersonService;

import java.io.IOException;
import java.math.BigDecimal;
import java.sql.Date;

@Component
public class CommandLineRunnerImpl implements CommandLineRunner {

    private PersonService personService;//вопрос насчет интерфейса
    private ContactService contactService;
    private DoctorService doctorService;
    private PatientService patientService;

    public CommandLineRunnerImpl(PersonService personService, ContactService contactService, DoctorService doctorService, PatientService patientService) {
        this.personService = personService;
        this.contactService = contactService;
        this.doctorService = doctorService;
        this.patientService = patientService;
    }




    @Override
    public void run(String... args) throws Exception {
        seedData();




    }

    private void seedData() throws IOException {
        ContactDto cdDoctor = new ContactDto(0,"+8925","ул.Пушкина 8к3");
        ContactDto cdPatient = new ContactDto(0,"+278112","ул.Дубровка 87к4");

        PersonDto pdDoctor = new PersonDto(0,"Антон","Иванов","m",new Date(1980,05,15),cdDoctor);
        PersonDto pdPatient = new PersonDto(0,"Галина","Сергеевна","w",new Date(1976,01,01),cdPatient);

        doctorService.addNewDoctor(new DoctorDto(0,pdDoctor,"123",new BigDecimal(1000),"pediatrician"));

        patientService.addNewPatient(new PatientDto(0,pdPatient,"ABC123"));






    }

}
