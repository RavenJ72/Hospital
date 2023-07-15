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
public class Patient extends Person{

    @Column(name="insurance_number",nullable = false)
    protected String insuranceNumber;

    public void setInsuranceNumber(String insuranceNumber) {
        this.insuranceNumber = insuranceNumber;

    }
}
