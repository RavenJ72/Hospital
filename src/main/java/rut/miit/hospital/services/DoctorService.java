package rut.miit.hospital.services;

import rut.miit.hospital.dtos.ContactDto;
import rut.miit.hospital.dtos.DoctorDetailsDto;
import java.util.List;

public interface DoctorService<ID>{
    ContactDto findContactByDoctorId(ID doctorId);

    DoctorDetailsDto addNewDoctor(DoctorDetailsDto doctorDetailsDto);

    List<DoctorDetailsDto> getAllDoctors();

    DoctorDetailsDto findDoctorById(ID id);
}
