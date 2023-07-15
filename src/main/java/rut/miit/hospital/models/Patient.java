package rut.miit.hospital.models;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Entity
@NoArgsConstructor
@Getter
@AllArgsConstructor
@Table(name = "patients")
public class Patient {
    @Id
    @Column(name = "patient_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "insurance_number", nullable = false, length = 20)
    protected String insuranceNumber;

    @OneToOne(mappedBy = "patient")
    private Person person;

    private void setInsuranceNumber(String insuranceNumber) {
        this.insuranceNumber = insuranceNumber;

    }


}
