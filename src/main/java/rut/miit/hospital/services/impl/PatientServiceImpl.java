package rut.miit.hospital.services.impl;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import rut.miit.hospital.dtos.ContactDto;
import rut.miit.hospital.dtos.PatientDetailsDto;
import rut.miit.hospital.dtos.PatientDto;
import rut.miit.hospital.models.Patient;
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
    public PatientDetailsDto addNewPatient(PatientDetailsDto patientDetailsDto) {
        return modelMapper.map(patientRepository.save(modelMapper.map(patientDetailsDto, Patient.class)), PatientDetailsDto.class);
    }

    @Override
    public List<PatientDto> getAllPatients() {
        return patientRepository.findAll().stream().map(p -> modelMapper.map(p,PatientDto.class)).collect(Collectors.toList());
    }


    @Override
    public PatientDetailsDto updateInsuranceNumber(Integer patientId, String insuranceNumber) {
        Patient newPatient = patientRepository.findById(patientId).orElseThrow();
        newPatient.setInsuranceNumber(insuranceNumber);
        patientRepository.save(newPatient);
        return modelMapper.map(newPatient, PatientDetailsDto.class);
    }

    @Override
    public void deletePatient(Integer patientId) {
        patientRepository.deleteById(patientId);
    }

    @Override
    public PatientDetailsDto getPatientById(Integer patientId) {
        return modelMapper.map(patientRepository.findById(patientId).orElseThrow(), PatientDetailsDto.class);
    }
}
