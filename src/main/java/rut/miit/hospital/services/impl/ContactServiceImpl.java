package rut.miit.hospital.services.impl;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import rut.miit.hospital.dtos.ContactDto;
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
    public ContactDto addNewContact(ContactDto contactDto) {
        return modelMapper.map(contactRepository.save(modelMapper.map(contactDto, Contact.class)), ContactDto.class);
    }

    @Override
    public List<ContactDto> getAllContacts() {
        return contactRepository.findAll().stream().map((c) -> modelMapper.map(c, ContactDto.class)).collect(Collectors.toList());
    }

    @Override
    public ContactDto updateAddress(Integer contactId, String address) {
        Contact newContact = contactRepository.findById(contactId).orElseThrow();
        newContact.setAddress(address);
        contactRepository.save(newContact);
        return modelMapper.map(newContact, ContactDto.class);
    }

    @Override
    public ContactDto updatePhone(Integer contactId, String phone) {
        Contact newContact = contactRepository.findById(contactId).orElseThrow();
        newContact.setPhone(phone);
        contactRepository.save(newContact);
        return modelMapper.map(newContact, ContactDto.class);
    }

    @Override
    public void deleteContact(Integer contactId) {
        contactRepository.deleteById(contactId);
    }

    @Override
    public ContactDto getContactById(Integer contactId) {
        return modelMapper.map(contactRepository.findById(contactId).orElseThrow(), ContactDto.class);
    }
}
