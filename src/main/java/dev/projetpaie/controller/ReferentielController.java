package dev.projetpaie.controller;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import dev.projetpaie.dto.ReferentielDto;
import dev.projetpaie.service.ReferentielService;

@RestController
@RequestMapping(value = "/referentiel")
public class ReferentielController {

    @Autowired
    private ReferentielService referentielService;

    @GetMapping
    public ReferentielDto findReferenciels() {
        return referentielService.recupererListeEntrepriseDtoEtGradeDtoEtProfilRemunerationDto();
    }

}