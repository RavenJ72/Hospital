package rut.miit.hospital.services;

import rut.miit.hospital.models.Person;
import java.util.List;

public interface PersonService<ID>{
    Person addNewPerson(Person person);

    List<Person> getAllPersons();
}
