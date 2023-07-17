package rut.miit.hospital.services.impl;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import rut.miit.hospital.dtos.ContactDto;
import rut.miit.hospital.dtos.PatientDto;
import rut.miit.hospital.dtos.PersonDto;
import rut.miit.hospital.models.Patient;
import rut.miit.hospital.models.Person;
import rut.miit.hospital.repositories.PatientRepository;
import rut.miit.hospital.services.PatientService;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class PatientServiceImpl implements PatientService<Integer> {

    @Autowired
    private PatientRepository patientRepository;

    @Autowired
    private ModelMapper modelMapper;


    @Override
    public ContactDto findContactByPatientId(Integer patientId) {
        return modelMapper.map(patientRepository.findContactByPatientId(patientId), ContactDto.class);
    }

    @Override
    public PatientDto addNewPatient(PatientDto patientDto) {
        return modelMapper.map(patientRepository.save(modelMapper.map(patientDto, Patient.class)), PatientDto.class);
    }

    @Override
    public List<PatientDto> getAllPatients() {
        return patientRepository.findAll().stream().map(p -> modelMapper.map(p,PatientDto.class)).collect(Collectors.toList());
    }

    @Override
    public PatientDto findPatientById(Integer patientId) {
        return modelMapper.map(patientRepository.findById(patientId).orElseThrow(),PatientDto.class);
    }
}
