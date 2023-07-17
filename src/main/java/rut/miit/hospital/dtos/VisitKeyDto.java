package rut.miit.hospital.dtos;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class VisitKeyDto {
    public Integer doctorId;
    public Integer patientId;
}
