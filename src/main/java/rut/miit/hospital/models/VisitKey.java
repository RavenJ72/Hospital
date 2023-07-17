package rut.miit.hospital.models;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.io.Serializable;

@AllArgsConstructor
@Getter
@Embeddable
public class VisitKey implements Serializable {

    @Column(name = "doctor_id")
    private Integer doctorId;

    @Column(name = "patient_id")
    private Integer patientId;

    protected VisitKey() {
    }

    private void setDoctorId(Integer doctorId) {
        this.doctorId = doctorId;
    }

    private void setPatientId(Integer patientId) {
        this.patientId = patientId;
    }

}
