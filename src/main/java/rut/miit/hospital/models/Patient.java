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

    @Column(name="insurance_number",nullable = false, length = 20)
    protected String insuranceNumber;

    private void setInsuranceNumber(String insuranceNumber) {
        this.insuranceNumber = insuranceNumber;

    }
}
