package rut.miit.hospital.dtos;

import lombok.*;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
public class PatientDto {
    public Integer id;
    public String firstName;
    public String lastName;
    public String insuranceNumber;
}

