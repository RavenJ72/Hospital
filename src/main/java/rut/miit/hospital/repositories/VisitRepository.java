package rut.miit.hospital.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import rut.miit.hospital.models.Doctor;
import rut.miit.hospital.models.Patient;
import rut.miit.hospital.models.Visit;

import java.sql.Date;
import java.util.List;

@Repository
public interface VisitRepository extends JpaRepository<Visit,Integer> {
    List<Visit> findVisitsByPatientOrderByVisitDateAsc(Patient patient);

    List<Visit> findVisitsByVisitDateBetweenAndDoctorOrderByVisitDateAsc(Date startDate, Date endDate, Doctor doctor);
}
