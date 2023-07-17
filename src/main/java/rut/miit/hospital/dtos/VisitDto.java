package rut.miit.hospital.dtos;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import java.sql.Date;
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class VisitDto {

    public String diagnosis;
    public Date visitDate;
    public String symptoms;
    private DoctorDto doctor;
    private PatientDto patient;

}
