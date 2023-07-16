package rut.miit.hospital.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import rut.miit.hospital.models.Doctor;

import java.util.Optional;

@Repository
public interface DoctorRepository extends JpaRepository<Doctor,Integer > {
        @Query("select c.address, c.phone from Doctor d " +
                "join d.person p " +
                "join p.contact c " +
                "where d.id = :doctorId")
        Optional<Object[]> findContactDetailsByDoctorId(@Param("doctorId") Integer doctorId);

}
