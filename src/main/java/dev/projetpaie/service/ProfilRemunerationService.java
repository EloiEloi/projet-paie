package dev.projetpaie.service;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;

import dev.projetpaie.dto.ProfilRemunerationDto;

import dev.projetpaie.repository.ProfilRemunerationRepository;

public class ProfilRemunerationService {

    @Autowired
    private ProfilRemunerationRepository remunerationRepository;

    public List<ProfilRemunerationDto> listerProfilRemuneration() {

        // return listeRemuDto;

        return remunerationRepository.findAll().stream().map(rr -> new ProfilRemunerationDto(rr.getCode()))
                .collect(Collectors.toList());

    }
}