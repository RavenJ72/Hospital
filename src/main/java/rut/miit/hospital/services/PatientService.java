package rut.miit.hospital.services;

import rut.miit.hospital.dtos.ContactDto;
import rut.miit.hospital.dtos.PatientDto;
import java.util.List;

public interface PatientService<ID>{
    PatientDto addNewPatient(PatientDto patientDto);
    PatientDto updateInsuranceNumber(ID patientId, String insuranceNumber);
    void deletePatient(ID patientId);
    PatientDto getPatientById(ID patientId);
    List<PatientDto> getAllPatients();
    ContactDto findContactByPatientId(ID patientId);
}
