package rut.miit.hospital.dtos;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@AllArgsConstructor
@Getter
@Setter
public class VisitKeyDto {
    public Integer doctorId;
    public Integer patientId;
}
