package rut.miit.hospital.models;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


import java.sql.Date;


@Entity
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Table(name = "visits")
public class Visit{
    @Id
    @Column(name = "visit_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "diagnosis",columnDefinition = "text")
    private String diagnosis;

    @Column(name = "visit_date", nullable = false)
    @Temporal(TemporalType.DATE)
    private Date visitDate;

    @Column(name = "symptoms", columnDefinition = "text")
    private String symptoms;
    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "doctor_id")
    private Doctor doctor;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "patient_id")
    private Patient patient;


    private void setId(Integer id) {
        this.id = id;
    }

    private void setVisitDate(Date visitDate) {
        this.visitDate = visitDate;
    }

    private void setSymptoms(String symptoms) {
        this.symptoms = symptoms;
    }
}
