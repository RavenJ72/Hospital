package rut.miit.hospital.dtos;

import lombok.AllArgsConstructor;
import lombok.Getter;
import rut.miit.hospital.models.VisitKey;
import java.sql.Date;
@AllArgsConstructor
@Getter
public class VisitDto {
    private VisitKey visitKey;
    private String diagnosis;
    private Date visitDate;
    private String symptoms;

    protected VisitDto(){

    }

    private void setId(VisitKey visitKey) {
        this.visitKey = visitKey;
    }

    private void setDiagnosis(String diagnosis) {
        this.diagnosis = diagnosis;
    }

    private void setVisitDate(Date visitDate) {
        this.visitDate = visitDate;
    }

    private void setSymptoms(String symptoms) {
        this.symptoms = symptoms;
    }
}
