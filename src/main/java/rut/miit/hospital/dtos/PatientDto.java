package rut.miit.hospital.dtos;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public class PatientDto {
    private Integer id;
    protected String insuranceNumber;

    protected PatientDto() {
    }

    private void setId(Integer id) {
        this.id = id;
    }

    private void setInsuranceNumber(String insuranceNumber) {
        this.insuranceNumber = insuranceNumber;
    }
}
