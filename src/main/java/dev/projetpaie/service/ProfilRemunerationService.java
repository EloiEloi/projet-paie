package dev.projetpaie.service;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import dev.projetpaie.dto.ProfilRemunerationDto;
import dev.projetpaie.entities.ProfilRemuneration;
import dev.projetpaie.repository.ProfilRemunerationRepository;

@Service
public class ProfilRemunerationService {

    @Autowired
    private ProfilRemunerationRepository remunerationRepository;

    public List<ProfilRemunerationDto> recupererlisteProfilRemuneration() {

        // return listeRemuDto;

        return remunerationRepository.findAll().stream().map(rr -> new ProfilRemunerationDto(rr.getCode()))
                .collect(Collectors.toList());

    }

    public ProfilRemuneration recupererProfilRemunerationParCode(String codeProfil) {
        return remunerationRepository.findByCode(codeProfil);
    }

}