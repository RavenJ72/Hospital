package rut.miit.hospital.services;

import rut.miit.hospital.dtos.ContactDto;
import rut.miit.hospital.dtos.DoctorDetailsDto;
import rut.miit.hospital.dtos.DoctorDto;

import java.math.BigDecimal;
import java.util.List;

public interface DoctorService<ID> {
    DoctorDetailsDto addNewDoctor(DoctorDetailsDto doctorDetailsDto);
    DoctorDetailsDto updateSpecialization(ID doctorId, String specialization);
    DoctorDetailsDto updateSalary(ID doctorId, BigDecimal salary);
    void deleteDoctor(ID doctorId);
    DoctorDetailsDto getDoctorById(ID doctorId);
    List<DoctorDto> getAllDoctors();
    ContactDto findContactByDoctorId(ID doctorId);
}

