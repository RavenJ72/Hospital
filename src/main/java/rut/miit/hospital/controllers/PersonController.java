package rut.miit.hospital.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import rut.miit.hospital.dtos.DoctorDetailsDto;
import rut.miit.hospital.dtos.DoctorDto;
import rut.miit.hospital.dtos.PersonDto;
import rut.miit.hospital.repositories.PersonRepository;
import rut.miit.hospital.services.PersonService;
import rut.miit.hospital.services.impl.PersonServiceImpl;

@RestController
@RequestMapping("/person")
public class PersonController {
    @Autowired
    private PersonService personService;

    @GetMapping("/getAll")
    Iterable<PersonDto> getAll(){
        return personService.getAllPersons();
    }

    @GetMapping("/{id}")
    PersonDto getPersonById(@PathVariable Integer id){
        return personService.getPersonById(id);
    }
    @PostMapping("/addNew")
    PersonDto newPerson(@RequestBody PersonDto personDto){
        return personService.addNewPerson(personDto);
    }
    @DeleteMapping("/deleteById/{id}")
    void deletePersonById(@PathVariable Integer id){personService.getPersonById(id);}

    @PutMapping("/updateLastName/{id}/{LastName}")
    PersonDto updateLastName(@PathVariable Integer id,@PathVariable String lastName){
        return personService.updateLastName(id,lastName);
    }





}
