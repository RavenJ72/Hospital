package rut.miit.hospital.services;

import rut.miit.hospital.dtos.ContactDto;
import java.util.List;

public interface ContactService<ID>{
    ContactDto addNewContact(ContactDto contactDto);

    List<ContactDto> getAllContacts();
}
