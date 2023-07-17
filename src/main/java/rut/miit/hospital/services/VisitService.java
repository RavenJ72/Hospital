package rut.miit.hospital.services;

import rut.miit.hospital.dtos.DoctorDetailsDto;
import rut.miit.hospital.dtos.PatientDto;
import rut.miit.hospital.dtos.VisitDto;
import java.sql.Date;
import java.util.List;

public interface VisitService<ID>{
    List<VisitDto> findVisitsByPatient(PatientDto patientDto);

    List<VisitDto> findVisitsByDateAndDoctor(Date startDate, Date endDate, DoctorDetailsDto doctorDetailsDto);

    VisitDto addNewVisit(VisitDto visitDto);

    List<VisitDto> getAllVisits();
}
