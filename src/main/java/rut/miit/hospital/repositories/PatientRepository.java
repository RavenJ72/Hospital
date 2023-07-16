package rut.miit.hospital.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import rut.miit.hospital.models.Patient;

@Repository
public interface PatientRepository extends JpaRepository< Patient,Integer> {
}
