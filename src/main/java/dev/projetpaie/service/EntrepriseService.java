package dev.projetpaie.service;

import dev.projetpaie.dto.EntrepriseDto;
import dev.projetpaie.entities.Entreprise;
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

        for (Entreprise entr : entreprises) {
            entreprisesDto.add(new EntrepriseDto(entr));
        }

        return entreprisesDto;
    }
}