package rut.miit.hospital.services.impl;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import rut.miit.hospital.dtos.PersonDto;
import rut.miit.hospital.models.Person;
import rut.miit.hospital.repositories.PersonRepository;
import rut.miit.hospital.services.PersonService;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class PersonServiceImpl implements PersonService<Integer> {

    @Autowired
    private PersonRepository personRepository;

    @Autowired
    private ModelMapper modelMapper;


    @Override
    public PersonDto updateLastName(Integer personId, String lastName) {
        Person newPerson = personRepository.findById(personId).orElseThrow();
        newPerson.setLastName(lastName);
        personRepository.save(newPerson);
        return modelMapper.map(newPerson, PersonDto.class);
    }

    @Override
    public void deletePerson(Integer personId) {
        personRepository.deleteById(personId);
    }

    @Override
    public PersonDto getPersonById(Integer personId) {
        return modelMapper.map(personRepository.findById(personId).orElseThrow(), PersonDto.class);
    }

    @Override
    public PersonDto addNewPerson(PersonDto personDto) {
        return modelMapper.map( personRepository.save(modelMapper.map(personDto,Person.class)),PersonDto.class);
    }

    @Override
    public List<PersonDto> getAllPersons() {
        return personRepository.findAll().stream().map(p -> modelMapper.map(p,PersonDto.class)).collect(Collectors.toList());
    }
}
