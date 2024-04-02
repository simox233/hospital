package ma.simo.demohopital.service;

import ma.simo.demohopital.entities.Consultation;
import ma.simo.demohopital.entities.Medecin;
import ma.simo.demohopital.entities.Patient;
import ma.simo.demohopital.entities.RendezVous;

public interface IHospitalService {
    Patient savePatient(Patient patient);
    Medecin  saveMedecin(Medecin medecin);
    RendezVous saveRDV(RendezVous rendezVous);
    Consultation saveConsultation(Consultation consultation);
}
