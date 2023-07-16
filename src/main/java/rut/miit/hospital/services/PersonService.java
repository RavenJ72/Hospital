package rut.miit.hospital.services;

import rut.miit.hospital.dtos.PersonDto;
import rut.miit.hospital.models.Person;
import java.util.List;

public interface PersonService<ID>{
    PersonDto addNewPerson(PersonDto personDto);

    List<PersonDto> getAllPersons();
}
