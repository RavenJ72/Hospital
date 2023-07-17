package rut.miit.hospital.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import rut.miit.hospital.models.Contact;
import rut.miit.hospital.models.Doctor;


@Repository
public interface DoctorRepository extends JpaRepository<Doctor,Integer > {
        @Query("select d.person.contact from Doctor d where d.id = :doctorId")
        Contact findContactByDoctorId(@Param("doctorId") Integer doctorId);
}

