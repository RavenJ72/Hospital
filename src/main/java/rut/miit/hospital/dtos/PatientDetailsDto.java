package rut.miit.hospital.dtos;

import lombok.*;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
public class PatientDetailsDto {

    public Integer id;
    public PersonDto personDto;
    public String insuranceNumber;
}
