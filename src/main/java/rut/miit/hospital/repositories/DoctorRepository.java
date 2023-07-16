package rut.miit.hospital.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import rut.miit.hospital.models.Doctor;

public interface DoctorRepository extends JpaRepository<Integer, Doctor> {
}
