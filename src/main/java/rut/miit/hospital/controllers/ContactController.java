package rut.miit.hospital.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import rut.miit.hospital.dtos.ContactDto;
import rut.miit.hospital.services.ContactService;

@RestController
@RequestMapping("/contact")
public class ContactController {

    @Autowired
    private ContactService contactService;

    @GetMapping("/")
    Iterable<ContactDto> getAll(){
        return contactService.getAllContacts();
    }

    @GetMapping("/{id}")
    ContactDto getContactById(@PathVariable Integer id){
        return contactService.getContactById(id);
    }

    @PostMapping("/addNew")
    ContactDto newContact(@RequestBody ContactDto contactDto){
        return contactService.addNewContact(contactDto);
    }

    @DeleteMapping("/deleteById/{id}")
    void deleteContactById(@RequestParam Integer id){
        contactService.deleteContact(id);
    }

    @PutMapping("/updateAddress/{id}/{address}")
    ContactDto updateAddressById(@RequestParam Integer id,@RequestParam String address){
        return contactService.updateAddress(id,address);
    }

    @PutMapping("/updatePhone/{id}/{phone}")
    ContactDto updatePhoneById(@RequestParam Integer id,@RequestParam String phone){
        return contactService.updatePhone(id,phone);
    }











}
