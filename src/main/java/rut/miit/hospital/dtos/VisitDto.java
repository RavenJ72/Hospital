package rut.miit.hospital.dtos;

import lombok.*;
import java.sql.Date;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
public class VisitDto {
    public Integer id;
    public String diagnosis;
    public Date visitDate;
    public String symptoms;

    public DoctorDetailsDto doctor;

    public PatientDetailsDto patient;
}


