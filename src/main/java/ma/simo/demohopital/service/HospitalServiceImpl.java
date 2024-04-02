package ma.simo.demohopital.service;

import jakarta.transaction.Transactional;
import ma.simo.demohopital.entities.Consultation;
import ma.simo.demohopital.entities.Medecin;
import ma.simo.demohopital.entities.Patient;
import ma.simo.demohopital.entities.RendezVous;
import ma.simo.demohopital.repositories.ConsultationRepository;
import ma.simo.demohopital.repositories.MedecinRepository;
import ma.simo.demohopital.repositories.PatientRepository;
import ma.simo.demohopital.repositories.RendezVousRepository;
import org.springframework.stereotype.Service;

@Service
@Transactional

public class HospitalServiceImpl implements IHospitalService {
    private PatientRepository patientRepository;
    private MedecinRepository medecinRepository;
    private RendezVousRepository rendezVousRepository;
    private ConsultationRepository consultationRepository;

    public HospitalServiceImpl(PatientRepository patientRepository, MedecinRepository medecinRepository, RendezVousRepository rendezVousRepository, ConsultationRepository consultationRepository) {
        this.patientRepository = patientRepository;
        this.medecinRepository = medecinRepository;
        this.rendezVousRepository = rendezVousRepository;
        this.consultationRepository = consultationRepository;
    }

    @Override
    public Patient savePatient(Patient patient) {
        return patientRepository.save(patient);
    }

    @Override
    public Medecin saveMedecin(Medecin medecin) {

        return medecinRepository.save(medecin);
    }

    @Override
    public RendezVous saveRDV(RendezVous rendezVous) {

        return rendezVousRepository.save(rendezVous);
    }

    @Override
    public Consultation saveConsultation(Consultation consultation) {

        return consultationRepository.save(consultation);
    }
}
