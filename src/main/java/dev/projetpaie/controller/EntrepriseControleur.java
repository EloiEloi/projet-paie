package dev.projetpaie.controller;

import dev.projetpaie.dto.EntrepriseDto;
import dev.projetpaie.service.EntrepriseService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class EntrepriseControleur {

    private static final Logger LOGGER = LoggerFactory.getLogger(EntrepriseControleur.class);

    private EntrepriseService entrepriseService;

    @RequestMapping(path = "/entreprises", method = RequestMethod.GET)
    public ResponseEntity<List<EntrepriseDto>> listeEntreprises() {
        LOGGER.info("appel de listeEntreprises()");
        return ResponseEntity.status(200).contentType(MediaType.APPLICATION_JSON)
                .body(entrepriseService.recupererListeEntreprisesDto());
    }
}