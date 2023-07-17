package rut.miit.hospital.services;

import rut.miit.hospital.dtos.ContactDto;
import rut.miit.hospital.dtos.PatientDetailsDto;
import rut.miit.hospital.dtos.PatientDto;
import java.util.List;

public interface PatientService<ID>{
    PatientDetailsDto addNewPatient(PatientDetailsDto PatientDetailsDto);
    PatientDetailsDto updateInsuranceNumber(ID patientId, String insuranceNumber);
    void deletePatient(ID patientId);
    PatientDetailsDto getPatientById(ID patientId);
    List<PatientDto> getAllPatients();
    ContactDto findContactByPatientId(ID patientId);
}
