package rut.miit.hospital.dtos;

import lombok.AllArgsConstructor;
import lombok.Getter;
import rut.miit.hospital.models.Contact;

import java.sql.Date;
@AllArgsConstructor
@Getter
public class PersonDto {
    private Integer id;
    private String firstName;
    private String lastName;
    private String sex;
    private Date dateOfBirth;
    private Contact contact;

    protected PersonDto() {
    }

    private void setId(Integer id) {
        this.id = id;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    private void setDateOfBirth(Date dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public void setContact(Contact contact) {
        this.contact = contact;
    }
}
