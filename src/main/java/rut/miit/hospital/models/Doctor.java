package rut.miit.hospital.models;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.math.BigDecimal;

@Entity

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Table(name = "doctors")
public class Doctor {
    @Id
    @Column(name = "doctor_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "salary", columnDefinition = "numeric(10,2)", nullable = false)
    private BigDecimal salary;
    @Column(name = "specialization", length = 50, nullable = false)
    private String specialization;
    @Column(name = "license_number", length = 20, nullable = false)
    private String licenseNumber;
    @OneToOne(mappedBy = "doctor")
    private Person person;

    private void setLicenseNumber(String licenseNumber) {
        this.licenseNumber = licenseNumber;
    }
}
