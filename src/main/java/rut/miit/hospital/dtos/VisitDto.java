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
    private DoctorDetailsDto doctor;
    private PatientDto patient;

    @Override
    public String toString() {
        return "VisitDto{" +
                "diagnosis='" + diagnosis + '\'' +
                ", visitDate=" + visitDate +
                ", symptoms='" + symptoms + '\'' +
                ", doctor=" + doctor +
                ", patient=" + patient +
                '}';
    }
}
