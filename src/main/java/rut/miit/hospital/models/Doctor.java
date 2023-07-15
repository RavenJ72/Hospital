package rut.miit.hospital.models;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.math.BigDecimal;

@Entity
@Table(name ="persons")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class Doctor extends Person{

    @Column(name = "salary", columnDefinition = "numeric(10,2)")
    private BigDecimal salary;
    @Column(name="specialization", columnDefinition = "varchar(50)", nullable = false)
    private String specialization;
    @Column(name="licenseNumber", columnDefinition = "varchar(20)", nullable = false)
    private String licenseNumber;

    private void setLicenseNumber(String licenseNumber) {
        this.licenseNumber = licenseNumber;
    }
}
