package rut.miit.hospital.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import rut.miit.hospital.dtos.ContactDto;
import rut.miit.hospital.dtos.DoctorDetailsDto;
import rut.miit.hospital.dtos.DoctorDto;
import rut.miit.hospital.services.DoctorService;

import java.math.BigDecimal;

@RestController
@RequestMapping("/doctor")
public class DoctorController {

    @Autowired
    private DoctorService doctorService;

    @GetMapping("/getAll")
    Iterable<DoctorDto> getAll(){
        return doctorService.getAllDoctors();
    }

    @GetMapping("/{id}")
    DoctorDetailsDto getDoctorById(@PathVariable Integer id){
        return doctorService.getDoctorById(id);
    }
    @PostMapping("/addNew")
    DoctorDetailsDto newDoctor(@RequestBody DoctorDetailsDto doctorDetailsDto){
        return doctorService.addNewDoctor(doctorDetailsDto);
    }

    @DeleteMapping("/deleteById/{id}")
    void deleteDoctorById(@PathVariable Integer id){
        doctorService.deleteDoctor(id);
    }

    @GetMapping("/getContact/{id}")
    ContactDto getContactByDoctorId(@PathVariable Integer id){
        return doctorService.findContactByDoctorId(id);
    }

    @PutMapping("/updateSpecialization/{id}/{specialization}")
    DoctorDetailsDto updateSpecialization(@PathVariable Integer id,@PathVariable String specialization){
        return doctorService.updateSpecialization(id,specialization);
    }

    @PutMapping("/updateSpecialization/{id}/{salary}")
    DoctorDetailsDto updateSalary(@PathVariable Integer id,@PathVariable BigDecimal salary){
        return doctorService.updateSalary(id,salary);
    }






}
