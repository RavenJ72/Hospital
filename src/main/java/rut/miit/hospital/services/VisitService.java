package rut.miit.hospital.services;

import rut.miit.hospital.models.Visit;
import java.util.List;

public interface VisitService<ID>{
    Visit addNewVisit(Visit visit);

    List<Visit> getAllVisits();
}
