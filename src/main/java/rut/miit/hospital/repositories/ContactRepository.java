package rut.miit.hospital.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import rut.miit.hospital.models.Contact;

@Repository
public interface ContactRepository extends JpaRepository<Contact, Integer> {
}
