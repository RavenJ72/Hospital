package rut.miit.hospital.dtos;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import rut.miit.hospital.models.VisitKey;
import java.sql.Date;

@AllArgsConstructor
@Getter
@Setter
public class VisitDto {
    public VisitKey visitKey;
    public String diagnosis;
    public Date visitDate;
    public String symptoms;

}
