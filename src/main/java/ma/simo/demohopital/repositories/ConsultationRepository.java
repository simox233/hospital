package ma.simo.demohopital.repositories;

import ma.simo.demohopital.entities.Consultation;
import ma.simo.demohopital.entities.Patient;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ConsultationRepository extends JpaRepository<Consultation,Long> {
}
