package rut.miit.hospital.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import rut.miit.hospital.models.Patient;

import java.util.Optional;

@Repository
public interface PatientRepository extends JpaRepository< Patient,Integer> {
        @Query("select c.address, c.phone from Patient p " +
                "join p.person pr " +
                "join pr.contact c " +
                "where p.id = :patientId")
        Optional<Object[]> findContactDetailsByPatientId(@Param("patientId") Integer patientId);
}
