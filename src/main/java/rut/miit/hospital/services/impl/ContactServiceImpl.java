package rut.miit.hospital.services.impl;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import rut.miit.hospital.dtos.ContactDto;
import rut.miit.hospital.dtos.PersonDto;
import rut.miit.hospital.models.Contact;
import rut.miit.hospital.repositories.ContactRepository;
import rut.miit.hospital.services.ContactService;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class ContactServiceImpl implements ContactService<Integer> {


    @Autowired
    private ContactRepository contactRepository;
    @Autowired
    private ModelMapper modelMapper;

    @Override
    public ContactDto addNewContact(ContactDto contact) {
        Contact c = modelMapper.map(contact,Contact.class);
        return modelMapper.map(contactRepository.save(c),ContactDto.class);
    }

    @Override
    public List<ContactDto> getAllContacts() {
        return contactRepository.findAll().stream().map((c) -> modelMapper.map(c, ContactDto.class)).collect(Collectors.toList());
    }
}
