package rut.miit.hospital.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import rut.miit.hospital.dtos.PersonDto;
import rut.miit.hospital.dtos.VisitDto;
import rut.miit.hospital.services.VisitService;

import java.sql.Date;


@RestController
@RequestMapping("/visit")
public class VisitController {

    @Autowired
    private VisitService visitService;

    @GetMapping("/getAll")
    Iterable<VisitDto> getAll(){
        return visitService.getAllVisits();
    }

    @GetMapping("/patient/{id}")
    Iterable<VisitDto> getVisitByPatientId(@PathVariable Integer id){
        return visitService.findVisitsByPatientId(id);
    }

    @GetMapping("/doctor/{id}")
    Iterable<VisitDto> getVisitByDoctorId(@PathVariable Integer id){
        return visitService.findVisitsByDoctorId(id);
    }

    @GetMapping("/getAllByDate/{date}")
    Iterable<VisitDto> getAllVisitsByDate(@PathVariable String date){
        return visitService.getAllVisitsByDate(Date.valueOf(date));
    }

    @GetMapping("/getAllByInterval/{dateStart}/{dateEnd}/{id}")
    Iterable<VisitDto> getAllVisitsByDateIntervalAndDoctorId(@PathVariable Date dateStart,@PathVariable Date dateEnd,@PathVariable Integer id){
        return visitService.findVisitsByDateIntervalAndDoctorId(dateStart,dateEnd,id);
    }


    @PostMapping("/addNew")
    VisitDto newVisit(@RequestBody VisitDto visitDto){
        return visitService.addNewVisit(visitDto);
    }
    @DeleteMapping("/deleteVisit/{doctorId}/{patientId}/{date}")
    void deleteVisitById(@PathVariable Integer doctorId,@PathVariable Integer patientId,@PathVariable Date date){
        visitService.deleteVisit(doctorId,patientId,date);
    }


    @GetMapping("/findVisit/{patientId}/{doctorId}/{date}")
    VisitDto getVisit(@PathVariable Integer patientId,@PathVariable Integer doctorId,@PathVariable Date date){
        return visitService.findVisit(patientId,doctorId,date);
    }

    @PutMapping("/updateDiagnosis/{patientId}/{doctorId}/{date}/{diagnosis}")
    VisitDto updateVisitDiagnosis(@PathVariable Integer patientId,@PathVariable Integer doctorId,@PathVariable Date date,@PathVariable String diagnosis){
        return visitService.updateVisitDiagnosis(patientId,doctorId,date,diagnosis);
    }






}
