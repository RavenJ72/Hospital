package rut.miit.hospital.services.impl;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import rut.miit.hospital.dtos.ContactDto;
import rut.miit.hospital.dtos.DoctorDto;
import rut.miit.hospital.dtos.PersonDto;
import rut.miit.hospital.models.Doctor;
import rut.miit.hospital.repositories.DoctorRepository;
import rut.miit.hospital.services.DoctorService;

import java.util.List;
import java.util.Optional;
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
    public DoctorDto addNewDoctor(DoctorDto doctorDto) {
        return modelMapper.map(doctorRepository.save(modelMapper.map(doctorDto,Doctor.class)),DoctorDto.class);
    }

    @Override
    public List<DoctorDto> getAllDoctors() {
        return doctorRepository.findAll().stream().map(p -> modelMapper.map(p, DoctorDto.class)).collect(Collectors.toList());
    }

    @Override
    public DoctorDto findDoctorById(Integer doctorId) {
        return modelMapper.map(doctorRepository.findById(doctorId).orElseThrow(),DoctorDto.class);
    }
}
