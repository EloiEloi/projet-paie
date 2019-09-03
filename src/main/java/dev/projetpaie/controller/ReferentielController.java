package dev.projetpaie.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
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

    // TODO finir referentiel
    @GetMapping
    public ResponseEntity<ReferentielDto> listeEntreprisesGradesRemunerations() {
        // return new ReferentielService(new Entrep);
        return null;
    }

}