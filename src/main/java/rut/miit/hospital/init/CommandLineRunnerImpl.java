package rut.miit.hospital.init;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import rut.miit.hospital.dtos.*;
import rut.miit.hospital.services.*;

import java.io.IOException;
import java.math.BigDecimal;
import java.sql.Date;

@Component
public class CommandLineRunnerImpl implements CommandLineRunner {

    private PersonService personService;//вопрос насчет интерфейса
    private ContactService contactService;
    private DoctorService doctorService;
    private PatientService patientService;
    private VisitService visitService;

    public CommandLineRunnerImpl(PersonService personService, ContactService contactService, DoctorService doctorService, PatientService patientService, VisitService visitService) {
        this.personService = personService;
        this.contactService = contactService;
        this.doctorService = doctorService;
        this.patientService = patientService;
        this.visitService = visitService;
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

        //doctorService.addNewDoctor(new DoctorDto(0,pdDoctor,"123",new BigDecimal(1000),"pediatrician"));
        //patientService.addNewPatient(new PatientDto(0,pdPatient,"ABC123"));


        visitService.addNewVisit(new VisitDto("amnesia",new Date(2023,01,02),"нарушения ориентации",new DoctorDetailsDto(0,pdDoctor,"123",new BigDecimal(1000),"pediatrician"),new PatientDto(0,pdPatient,"ABC123")));


        PatientDto patientDto = patientService.findPatientById(1);

        visitService.findVisitsByPatient(patientDto).stream().forEach(System.out::println);



    }

}
