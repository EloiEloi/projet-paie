package dev.projetpaie.service;

import dev.projetpaie.controleur.EntrepriseDto;
import dev.projetpaie.entites.Entreprise;
import dev.projetpaie.repository.EntrepriseRepository;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class EntrepriseService {

    private final EntrepriseRepository entrepriseRepository;

    public EntrepriseService(EntrepriseRepository entrepriseRepository) {
        this.entrepriseRepository = entrepriseRepository;
    }

    public List<EntrepriseDto> recupererListeEntreprisesDto() {
        List<Entreprise> entreprises = entrepriseRepository.findAll();
        List<EntrepriseDto> entreprisesDto = new ArrayList<>();

        for (Entreprise e : entreprises) {
            entreprisesDto.add(new EntrepriseDto(e));
        }

        return entreprisesDto;
    }
}