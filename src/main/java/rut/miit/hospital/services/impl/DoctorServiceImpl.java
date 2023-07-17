package rut.miit.hospital.services.impl;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import rut.miit.hospital.dtos.ContactDto;
import rut.miit.hospital.dtos.DoctorDetailsDto;
import rut.miit.hospital.dtos.DoctorDto;
import rut.miit.hospital.models.Doctor;
import rut.miit.hospital.repositories.DoctorRepository;
import rut.miit.hospital.services.DoctorService;

import java.math.BigDecimal;
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
    public List<DoctorDto> getAllDoctors() {
        return doctorRepository.findAll().stream().map(p -> modelMapper.map(p, DoctorDto.class)).collect(Collectors.toList());
    }

    @Override
    public DoctorDetailsDto updateSpecialization(Integer doctorId, String specialization) {
        Doctor newDoctor = doctorRepository.findById(doctorId).orElseThrow();
        newDoctor.setSpecialization(specialization);
        doctorRepository.save(newDoctor);
        return modelMapper.map(newDoctor, DoctorDetailsDto.class);
    }

    @Override
    public DoctorDetailsDto updateSalary(Integer doctorId, BigDecimal salary) {
        Doctor newDoctor = doctorRepository.findById(doctorId).orElseThrow();
        newDoctor.setSalary(salary);
        doctorRepository.save(newDoctor);
        return modelMapper.map(newDoctor, DoctorDetailsDto.class);
    }

    @Override
    public void deleteDoctor(Integer doctorId) {
        doctorRepository.deleteById(doctorId);
    }

    @Override
    public DoctorDetailsDto getDoctorById(Integer doctorId) {
        return modelMapper.map(doctorRepository.findById(doctorId).orElseThrow(), DoctorDetailsDto.class);
    }
}
