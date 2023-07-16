package rut.miit.hospital.services;

import rut.miit.hospital.dtos.DoctorDto;
import rut.miit.hospital.models.Doctor;
import java.util.List;
import java.util.Optional;

public interface DoctorService<ID>{
    Optional<Object[]> findContactByDoctorId(Integer doctorId);

    DoctorDto addNewDoctor(DoctorDto doctorDto);

    List<DoctorDto> getAllDoctors();
}
