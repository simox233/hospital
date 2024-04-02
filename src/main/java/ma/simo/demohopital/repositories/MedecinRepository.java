package ma.simo.demohopital.repositories;

import ma.simo.demohopital.entities.Medecin;
import ma.simo.demohopital.entities.Patient;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MedecinRepository extends JpaRepository<Medecin,Long> {
Medecin findByNom(String nom);
}
