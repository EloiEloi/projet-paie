package dev.projetpaie.service;

import dev.projetpaie.dto.EntrepriseDto;
import dev.projetpaie.entities.Entreprise;
import dev.projetpaie.repository.EntrepriseRepository;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class EntrepriseService {

    private EntrepriseRepository entrepriseRepository;

    public List<EntrepriseDto> recupererListeEntreprisesDto() {
        List<Entreprise> listEntreprises = entrepriseRepository.findAll();
        List<EntrepriseDto> listEntreprisesDto = new ArrayList<>();

        for (Entreprise entr : listEntreprises) {
            listEntreprisesDto.add(new EntrepriseDto(entr));
        }

        return listEntreprisesDto;
    }
}