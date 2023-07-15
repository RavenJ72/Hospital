package rut.miit.hospital.models;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.io.Serializable;
import java.sql.Date;
import java.util.List;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Table(name = "visits")
public class Visit{
    @EmbeddedId
    private VisitKey id;

    @Column(name = "diagnosis",columnDefinition = "text")
    private String diagnosis;

    @Column(name = "visit_date", nullable = false)
    @Temporal(TemporalType.DATE)
    private Date visitDate;

    @Column(name = "symptoms", columnDefinition = "text")
    private String symptoms;
    @ManyToOne(cascade = CascadeType.ALL)
    @MapsId("doctorId")
    @JoinColumn(name = "doctor_id")
    private Doctor doctor;

    @ManyToOne(cascade = CascadeType.ALL)
    @MapsId("patientId")
    @JoinColumn(name = "patient_id")
    private Patient patient;

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
