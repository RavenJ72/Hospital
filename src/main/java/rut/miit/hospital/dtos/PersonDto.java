package rut.miit.hospital.dtos;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import rut.miit.hospital.models.Contact;

import java.sql.Date;
@AllArgsConstructor
@Getter
@Setter
public class PersonDto {
    public Integer id;
    public String firstName;
    public String lastName;
    public String sex;
    public Date dateOfBirth;
    public ContactDto contact;
}
