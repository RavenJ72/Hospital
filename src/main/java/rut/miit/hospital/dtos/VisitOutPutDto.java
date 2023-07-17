package rut.miit.hospital.dtos;

import lombok.*;

import java.sql.Date;
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
public class VisitOutPutDto {
    public Integer id;
    public String diagnosis;
    public Date visitDate;
    public String symptoms;

    public String firstNameDoctor;
    public String lastNameDoctor;

    public String firstNamePatient;
    public String lastNamePatient;
}
