package rut.miit.hospital.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import rut.miit.hospital.models.Visit;

public interface VisitRepository extends JpaRepository<Integer, Visit> {
}
