package rut.miit.hospital.services;

import rut.miit.hospital.models.Contact;
import java.util.List;

public interface ContactService<ID>{
    Contact addNewContact(Contact contact);

    List<Contact> getAllContacts();
}
