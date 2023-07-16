package rut.miit.hospital.services;

import rut.miit.hospital.models.Patient;
import java.util.List;

public interface PatientService<ID>{
    Patient addNewPatient(Patient patient);

    List<Patient> getAllPatients();
}
