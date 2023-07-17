package rut.miit.hospital.services.impl;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import rut.miit.hospital.dtos.DoctorDetailsDto;
import rut.miit.hospital.dtos.PatientDto;
import rut.miit.hospital.dtos.VisitDto;
import rut.miit.hospital.models.Doctor;
import rut.miit.hospital.models.Patient;
import rut.miit.hospital.models.Visit;
import rut.miit.hospital.repositories.VisitRepository;
import rut.miit.hospital.services.VisitService;

import java.sql.Date;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class VisitServiceImpl implements VisitService<Integer>{

    @Autowired
    private ModelMapper modelMapper;
    @Autowired
    private VisitRepository visitRepository;

    @Override
    public List<VisitDto> findVisitsByPatient(PatientDto patientDto) {
        return visitRepository.findVisitsByPatientOrderByVisitDateAsc(modelMapper.map(patientDto, Patient.class))
                        .stream().map(e -> modelMapper.map(e, VisitDto.class)).collect(Collectors.toList());
    }

    @Override
    public List<VisitDto> findVisitsByDateAndDoctor(Date startDate, Date endDate, DoctorDetailsDto doctorDetailsDto) {
        return visitRepository.findVisitsByVisitDateBetweenAndDoctorOrderByVisitDateAsc(startDate,endDate,modelMapper.map(doctorDetailsDto, Doctor.class))
                .stream().map(e -> modelMapper.map(e,VisitDto.class))
                .collect(Collectors.toList());
    }

    @Override
    public VisitDto addNewVisit(VisitDto visitDto) {
        return modelMapper.map(visitRepository.save(modelMapper.map(visitDto, Visit.class)), VisitDto.class);
    }

    @Override
    public List<VisitDto> getAllVisits() {
        return visitRepository.findAll().stream().map(p -> modelMapper.map(p,VisitDto.class))
                .collect(Collectors.toList());

    }
}
