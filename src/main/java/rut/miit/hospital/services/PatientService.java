package rut.miit.hospital.services;

import org.springframework.stereotype.Service;
import rut.miit.hospital.dtos.PatientDto;
import java.util.List;
import java.util.Optional;

public interface PatientService<ID>{
    Optional<Object[]> findContactByPatientId(Integer patientId);

    PatientDto addNewPatient(PatientDto patientDto);

    List<PatientDto> getAllPatients();
}
