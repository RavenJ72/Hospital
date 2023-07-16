package rut.miit.hospital.dtos;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public class VisitKeyDto {
    private Integer doctorId;
    private Integer patientId;

    protected VisitKeyDto() {
    }

    private void setDoctorId(Integer doctorId) {
        this.doctorId = doctorId;
    }

    private void setPatientId(Integer patientId) {
        this.patientId = patientId;
    }


}
