package rut.miit.hospital.dtos;

import java.math.BigDecimal;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.math.BigDecimal;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class DoctorDto {
    public Integer id;
    public String personDto;
    private BigDecimal salary;
    public String specialization;
}
