package dev.projetpaie.dto;

import org.springframework.beans.factory.annotation.Autowired;

import dev.projetpaie.repository.EntrepriseRepository;
import dev.projetpaie.repository.ProfilRemunerationRepository;
import dev.projetpaie.service.GradeService;

public class ReferentielDto {
    // TODO finir referentiel
    @Autowired
    private EntrepriseRepository entrepriseRepository;
    @Autowired
    private GradeService gradeService;
    @Autowired
    private ProfilRemunerationRepository remunerationRepository;
}