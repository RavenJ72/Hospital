package rut.miit.hospital.dtos;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import rut.miit.hospital.models.VisitKey;
import java.sql.Date;
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class VisitDto {
    public VisitKeyDto visitKey;
    public String diagnosis;
    public Date visitDate;
    public String symptoms;

}
