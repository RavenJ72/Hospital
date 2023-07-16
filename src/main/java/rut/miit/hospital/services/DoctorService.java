package rut.miit.hospital.services;

import rut.miit.hospital.models.Doctor;
import java.util.List;

public interface DoctorService<ID>{
    Doctor addNewDoctor(Doctor doctor);

    List<Doctor> getAllDoctors();
}
