package dev.projetpaie.service;

import dev.projetpaie.dto.EntrepriseDto;
import dev.projetpaie.entities.Entreprise;
import dev.projetpaie.repository.EntrepriseRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class EntrepriseService {

    @Autowired
    private EntrepriseRepository entrepriseRepository;

    public List<EntrepriseDto> recupererListeEntreprisesDto() {
        return entrepriseRepository.findAll().stream().map(er -> new EntrepriseDto(er.getCode(), er.getDenomination()))
                .collect(Collectors.toList());
    }
}