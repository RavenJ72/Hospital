package rut.miit.hospital.init;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import rut.miit.hospital.dtos.ContactDto;
import rut.miit.hospital.dtos.PersonDto;
import rut.miit.hospital.services.ContactService;
import rut.miit.hospital.services.PersonService;
import rut.miit.hospital.services.impl.ContactServiceImpl;
import rut.miit.hospital.services.impl.PersonServiceImpl;

import java.io.IOException;
import java.sql.Date;

@Component
public class CommandLineRunnerImpl implements CommandLineRunner {

    private PersonService personService;//вопрос насчет интерфейса
    private ContactService contactService;

    public CommandLineRunnerImpl(PersonService personService, ContactService contactService) {
        this.personService = personService;
        this.contactService = contactService;
    }




    @Override
    public void run(String... args) throws Exception {
        seedData();




    }

    private void seedData() throws IOException {
        ContactDto cd = contactService.addNewContact(new ContactDto(0,"+8925","Где-то в крутом месте"));

        personService.addNewPerson(new PersonDto(0,"Антон","Иванов","m",new Date(1980,05,15),cd));
    }

}
