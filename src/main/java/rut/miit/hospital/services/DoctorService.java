package rut.miit.hospital.services;

import rut.miit.hospital.dtos.ContactDto;
import rut.miit.hospital.dtos.DoctorDto;
import java.util.List;

public interface DoctorService<ID>{
    ContactDto findContactByDoctorId(Integer doctorId);

    DoctorDto addNewDoctor(DoctorDto doctorDto);

    List<DoctorDto> getAllDoctors();
}
