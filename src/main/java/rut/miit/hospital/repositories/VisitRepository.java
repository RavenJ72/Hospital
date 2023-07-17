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
    List<Visit> findVisitsByPatientIdOrderByVisitDateAsc(Integer patientId);

    List<Visit> findVisitsByDoctorIdOrderByVisitDateAsc(Integer doctorId);

    void deleteVisitByDoctorIdAndPatientIdAndVisitDate(Integer doctorId, Integer patientId, Date visitDate);

    Visit findVisitByPatientIdAndDoctorIdAndVisitDate(Integer patientId, Integer doctorId, Date visitDate);

    List<Visit> findVisitsByVisitDateBetweenAndDoctorIdOrderByVisitDateAsc(Date startDate, Date endDate, Integer doctorId);
}
