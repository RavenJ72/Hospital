package rut.miit.hospital.services;

import org.springframework.stereotype.Service;
import rut.miit.hospital.dtos.ContactDto;
import java.util.List;

public interface ContactService<ID> {
    ContactDto addNewContact(ContactDto contactDto);
    ContactDto updateAddress(ID contactId, String address);
    ContactDto updatePhone(ID contactId, String phone);
    void deleteContact(ID contactId);
    ContactDto getContactById(ID contactId);
    List<ContactDto> getAllContacts();
}

