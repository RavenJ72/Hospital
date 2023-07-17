package rut.miit.hospital.services.impl;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import rut.miit.hospital.dtos.ContactDto;
import rut.miit.hospital.dtos.DoctorDetailsDto;
import rut.miit.hospital.models.Doctor;
import rut.miit.hospital.repositories.DoctorRepository;
import rut.miit.hospital.services.DoctorService;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class DoctorServiceImpl implements DoctorService<Integer> {

    @Autowired
    private DoctorRepository doctorRepository;

    @Autowired
    private ModelMapper modelMapper;


    @Override
    public ContactDto findContactByDoctorId(Integer doctorId) {
        return modelMapper.map(doctorRepository.findContactByDoctorId(doctorId),ContactDto.class);
    }

    @Override
    public DoctorDetailsDto addNewDoctor(DoctorDetailsDto doctorDetailsDto) {
        return modelMapper.map(doctorRepository.save(modelMapper.map(doctorDetailsDto,Doctor.class)), DoctorDetailsDto.class);
    }

    @Override
    public List<DoctorDetailsDto> getAllDoctors() {
        return doctorRepository.findAll().stream().map(p -> modelMapper.map(p, DoctorDetailsDto.class)).collect(Collectors.toList());
    }

    @Override
    public DoctorDetailsDto findDoctorById(Integer doctorId) {
        return modelMapper.map(doctorRepository.findById(doctorId).orElseThrow(), DoctorDetailsDto.class);
    }
}
