package rut.miit.hospital.dtos;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.math.BigDecimal;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class DoctorDetailsDto {
    public Integer id;
    public PersonDto personDto;
    private String licenseNumber;
    private BigDecimal salary;
    public String specialization;
}
