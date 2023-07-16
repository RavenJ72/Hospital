package rut.miit.hospital.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import rut.miit.hospital.models.Person;

@Repository
public interface PersonRepository extends JpaRepository<Person, Integer> {
}
