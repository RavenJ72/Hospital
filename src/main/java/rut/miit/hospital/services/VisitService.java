package rut.miit.hospital.services;

import rut.miit.hospital.dtos.*;
import rut.miit.hospital.models.Visit;

import java.sql.Date;
import java.util.List;

public interface VisitService<ID>{
    List<VisitOutPutDto> findVisitsByPatientId(ID patientId);

    List<VisitOutPutDto> findVisitsByDoctorId(ID doctorId);

    List<VisitOutPutDto> findVisitsByDateIntervalAndDoctorId(Date startDate, Date endDate, ID doctorId);

    VisitDto findVisit(Integer patientId, Integer doctorId, Date visitDate);

    void deleteVisit(ID doctorId, ID patientId, Date visitDate);

    VisitDto addNewVisit(VisitDto visitDto);

    VisitDto updateVisitDiagnosis(ID patientId, ID doctorId, Date visitDate, String diagnosis);

    List<VisitOutPutDto> getAllVisits();

    List<VisitOutPutDto> getAllVisitsByDate(Date date);

}

