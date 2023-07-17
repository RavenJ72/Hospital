package rut.miit.hospital.services;

import rut.miit.hospital.dtos.ContactDto;
import rut.miit.hospital.dtos.PatientDto;
import java.util.List;

public interface PatientService<ID>{
    ContactDto findContactByPatientId(Integer patientId);

    PatientDto addNewPatient(PatientDto patientDto);

    List<PatientDto> getAllPatients();

    PatientDto findPatientById(ID id);
}
