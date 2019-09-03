package dev.projetpaie.controller;

import dev.projetpaie.dto.EntrepriseDto;
import dev.projetpaie.service.EntrepriseService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/entreprises")
public class EntrepriseControleur {

    @Autowired
    private EntrepriseService entrepriseService;

    @GetMapping
    public ResponseEntity<List<EntrepriseDto>> listerEntreprises() {
        return new ResponseEntity<>(entrepriseService.recupererListeEntreprisesDto(), HttpStatus.OK);
    }

}