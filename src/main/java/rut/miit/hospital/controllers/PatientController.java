package rut.miit.hospital.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.*;
import rut.miit.hospital.dtos.*;
import rut.miit.hospital.services.PatientService;

@Repository
@RequestMapping("/patient")
public class PatientController {

    @Autowired
    private PatientService patientService;

    @GetMapping("/getAll")
    Iterable<PatientDto> getAll(){
        return patientService.getAllPatients();
    }

    @GetMapping("/{id}")
    PatientDetailsDto getPatientById(@PathVariable Integer id){
        return patientService.getPatientById(id);
    }

    @GetMapping("/getContact/{id}")
    ContactDto getContactByPatientId(@PathVariable Integer id){
        return patientService.findContactByPatientId(id);
    }


    @PostMapping("/addNew")
    PatientDetailsDto newPatient(@RequestBody PatientDetailsDto patientDetailsDto){
        return patientService.addNewPatient(patientDetailsDto);
    }
    @DeleteMapping("/deleteById/{id}")
    void deletePatientById(@PathVariable Integer id){
        patientService.deletePatient(id);
    }

    @PutMapping("/updateInsuranceNumber/{id}/{insuranceNumber}")
    PatientDetailsDto updateInsuranceNumber(@PathVariable Integer id,@PathVariable String insuranceNumber){
        return patientService.updateInsuranceNumber(id,insuranceNumber);
    }



}
