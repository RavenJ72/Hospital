package rut.miit.hospital.services.impl;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import rut.miit.hospital.dtos.VisitDto;
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
    public List<VisitDto> findVisitsByPatientId(Integer patientId) {
        return visitRepository.findVisitsByPatientIdOrderByVisitDateAsc(patientId)
                .stream().map(visit -> modelMapper.map(visit, VisitDto.class))
                .collect(Collectors.toList());
    }

    @Override
    public List<VisitDto> findVisitsByDoctorId(Integer doctorId) {
        return visitRepository.findVisitsByDoctorIdOrderByVisitDateAsc(doctorId)
                .stream().map(visit -> modelMapper.map(visit, VisitDto.class))
                .collect(Collectors.toList());
    }

    @Override
    public List<VisitDto> findVisitsByDateIntervalAndDoctorId(Date startDate, Date endDate, Integer doctorId) {
        return visitRepository.findVisitsByVisitDateBetweenAndDoctorIdOrderByVisitDateAsc(startDate,endDate,doctorId)
                .stream().map(visit -> modelMapper.map(visit, VisitDto.class))
                .collect(Collectors.toList());
    }

    @Override
    public VisitDto findVisit(Integer patientId, Integer doctorId, Date visitDate) {
        return modelMapper
                .map(visitRepository.findVisitByPatientIdAndDoctorIdAndVisitDate(patientId,doctorId,visitDate),
                        VisitDto.class);
    }

    @Override
    public void deleteVisit(Integer doctorId, Integer patientId, Date visitDate) {
        visitRepository.deleteVisitByDoctorIdAndPatientIdAndVisitDate(doctorId, patientId, visitDate);
    }

    @Override
    public VisitDto updateVisitDiagnosis(Integer patientId, Integer doctorId, Date visitDate, String diagnosis) {
        Visit newVisit = modelMapper.map(findVisit(patientId, doctorId, visitDate), Visit.class);
        newVisit.setDiagnosis(diagnosis);
        visitRepository.save(newVisit);
        return modelMapper.map(newVisit, VisitDto.class);
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

    @Override
    public List<VisitDto> getAllVisitsByDate(Date date) {
        return visitRepository.findAllByVisitDate(date).stream().map(e -> modelMapper.map(e,VisitDto.class)).collect(Collectors.toList());
    }
}

