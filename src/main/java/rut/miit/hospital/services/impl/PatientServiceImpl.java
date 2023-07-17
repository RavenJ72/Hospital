package rut.miit.hospital.services.impl;

import org.springframework.stereotype.Service;
import rut.miit.hospital.dtos.ContactDto;
import rut.miit.hospital.dtos.PatientDto;
import rut.miit.hospital.repositories.PatientRepository;
import rut.miit.hospital.services.PatientService;

import java.util.List;
import java.util.Optional;

@Service
public class PatientServiceImpl implements PatientService<Integer> {


    @Override
    public ContactDto findContactByPatientId(Integer patientId) {
        return null;
    }

    @Override
    public PatientDto addNewPatient(PatientDto patientDto) {
        return null;
    }

    @Override
    public List<PatientDto> getAllPatients() {
        return null;
    }
}
