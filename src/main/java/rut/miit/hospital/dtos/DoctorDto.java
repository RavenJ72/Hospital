package rut.miit.hospital.dtos;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public class DoctorDto {
    private Integer id;
    private String specialization;

    protected DoctorDto() {
    }


    private void setId(Integer id) {
        this.id = id;
    }


    private void setSpecialization(String specialization) {
        this.specialization = specialization;
    }
}
