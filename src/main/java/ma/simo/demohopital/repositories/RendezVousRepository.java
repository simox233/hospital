package ma.simo.demohopital.repositories;

import ma.simo.demohopital.entities.Patient;
import ma.simo.demohopital.entities.RendezVous;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RendezVousRepository extends JpaRepository<RendezVous,Long> {
}
