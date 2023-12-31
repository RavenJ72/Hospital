package rut.miit.hospital.models;

import com.fasterxml.jackson.annotation.JsonManagedReference;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;
@Setter
@Getter
@NoArgsConstructor
@Entity
@Table(name = "contacts")
public class Contact {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "contact_id")
    private Integer id;

    @Column(name = "phone",length = 20, nullable = false)
    private String phone;

    @Column(name = "address",length = 100, nullable = false)
    private String address;

    @OneToOne(mappedBy = "contact", targetEntity = Person.class)
    private Person person;

    private void setId(int id) {
        this.id = id;
    }

    private void setPerson(Person person) {
        this.person = person;
    }
}
