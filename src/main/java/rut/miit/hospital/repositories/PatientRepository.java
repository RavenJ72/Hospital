package rut.miit.hospital.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import rut.miit.hospital.models.Contact;
import rut.miit.hospital.models.Patient;


@Repository
public interface PatientRepository extends JpaRepository< Patient,Integer> {
        @Query("select p.person.contact from Patient p where p.id = :patientId")
        Contact findContactByPatientId(@Param("patientId") Integer patientId);
}
