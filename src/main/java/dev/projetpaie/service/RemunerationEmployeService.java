package dev.projetpaie.service;

import javax.validation.Validator;

import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import dev.projetpaie.dto.AjouterEmployeDto;
import dev.projetpaie.entities.Collegue;
import dev.projetpaie.entities.RemunerationEmploye;
import dev.projetpaie.exception.MatriculeNonTrouveException;
import dev.projetpaie.exception.RemunerationEmployeException;
import dev.projetpaie.repository.RemunerationEmployeRepository;

@Service
public class RemunerationEmployeService {

    private RemunerationEmployeRepository remunerationEmployeRepository;
    private EntrepriseService entrepriseService;
    private GradeService gradeService;
    private ProfilRemunerationService profilRemunerationService;
    private Validator validator;

    private String urlApiCollegue = "https://eloi-collegues-api.herokuapp.com/collegues";

    private RestTemplate rt = new RestTemplate();

    public RemunerationEmployeService(RemunerationEmployeRepository remunerationEmployeRepository,
            EntrepriseService entrepriseService, GradeService gradeService,
            ProfilRemunerationService profilRemunerationService, Validator validator) {
        this.remunerationEmployeRepository = remunerationEmployeRepository;
        this.entrepriseService = entrepriseService;
        this.gradeService = gradeService;
        this.profilRemunerationService = profilRemunerationService;
        this.validator = validator;
    }

    public RemunerationEmploye ajouterEmploye(AjouterEmployeDto ajoutEmployeDto)
            throws MatriculeNonTrouveException, RemunerationEmployeException {

        RemunerationEmploye remunerationEmploye = new RemunerationEmploye();

        Collegue collegue = rt.getForObject(urlApiCollegue + "/collegues/" + ajoutEmployeDto.getMatricule(),
                Collegue.class, 1);

        if (collegue != null) {
            remunerationEmploye.setMatricule(collegue.getMatricule());
            remunerationEmploye
                    .setEntreprise(entrepriseService.recupererEntrepriseParCode(ajoutEmployeDto.getCodeEntreprise()));
            remunerationEmploye.setGrade(gradeService.recupererGradeParCode(ajoutEmployeDto.getCodeGrade()));
            remunerationEmploye.setProfilRemuneration(
                    profilRemunerationService.recupererProfilRemunerationParCode(ajoutEmployeDto.getCodeProfil()));

            if (validator.validate(remunerationEmploye).isEmpty()) {
                return remunerationEmployeRepository.save(remunerationEmploye);
            } else {
                throw new RemunerationEmployeException("Donnee(s) non valide(s)");
            }
        } else {
            throw new MatriculeNonTrouveException("Matricule inexistant");
        }

    }

}