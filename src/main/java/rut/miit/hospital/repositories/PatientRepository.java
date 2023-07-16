package rut.miit.hospital.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import rut.miit.hospital.models.Patient;

public interface PatientRepository extends JpaRepository<Integer, Patient> {
}
