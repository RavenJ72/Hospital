package rut.miit.hospital.services;

import rut.miit.hospital.dtos.DoctorDetailsDto;
import rut.miit.hospital.dtos.DoctorDto;
import rut.miit.hospital.dtos.PatientDto;
import rut.miit.hospital.dtos.VisitDto;
import rut.miit.hospital.models.Visit;

import java.sql.Date;
import java.util.List;

public interface VisitService<ID>{
    List<VisitDto> findVisitsByPatientId(ID patientId);

    List<VisitDto> findVisitsByDoctorId(ID doctorId);

    List<VisitDto> findVisitsByDateIntervalAndDoctorId(Date startDate, Date endDate, ID doctorId);

    VisitDto findVisit(Integer patientId, Integer doctorId, Date visitDate);

    void deleteVisit(ID doctorId, ID patientId, Date visitDate);

    VisitDto addNewVisit(VisitDto visitDto);

    VisitDto updateVisitDiagnosis(ID patientId, ID doctorId, Date visitDate, String diagnosis);

    List<VisitDto> getAllVisits();
}
