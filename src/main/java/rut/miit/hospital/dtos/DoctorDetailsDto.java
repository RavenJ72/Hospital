package rut.miit.hospital.dtos;

import lombok.*;

import java.math.BigDecimal;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
public class DoctorDetailsDto {
    public Integer id;
    public PersonDto personDto;
    public String licenseNumber;
    public BigDecimal salary;
    public String specialization;
}

