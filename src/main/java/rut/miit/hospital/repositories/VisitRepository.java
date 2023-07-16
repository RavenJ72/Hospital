package rut.miit.hospital.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import rut.miit.hospital.models.Visit;

@Repository
public interface VisitRepository extends JpaRepository<Visit,Integer> {
}
