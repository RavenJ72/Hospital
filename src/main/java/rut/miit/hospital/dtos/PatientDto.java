package rut.miit.hospital.dtos;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class PatientDto {
    public Integer id;

    public PersonDto personDto;
    public String insuranceNumber;

    @Override
    public String toString() {
        return "PatientDto{" +
                "id=" + id +
                ", personDto=" + personDto +
                ", insuranceNumber='" + insuranceNumber + '\'' +
                '}';
    }
}
