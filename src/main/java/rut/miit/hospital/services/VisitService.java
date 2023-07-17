package rut.miit.hospital.services;

import rut.miit.hospital.dtos.DoctorDetailsDto;
import rut.miit.hospital.dtos.DoctorDto;
import rut.miit.hospital.dtos.PatientDto;
import rut.miit.hospital.dtos.VisitDto;
import java.sql.Date;
import java.util.List;

public interface VisitService<ID>{
    List<VisitDto> findVisitsByPatientId(ID patientId);

    List<VisitDto> findVisitsByDoctorId(ID doctorId);

    List<VisitDto> findVisitsByDateAndDoctorId(Date startDate, Date endDate, ID id);

    void deleteVisit(ID doctorId, ID patientId, Date visitDate);

    VisitDto addNewVisit(VisitDto visitDto);

    VisitDto updateVisit(ID doctorId, ID patientId, Date visitDate, VisitDto visitDto);

    List<VisitDto> getAllVisits();
}
