package dev.projetpaie.controller;

import org.springframework.web.bind.annotation.RestController;

import dev.projetpaie.dto.AjouterEmployeDto;
import dev.projetpaie.dto.RemunerationEmployeDto;
import dev.projetpaie.exception.EmployeNonTrouveException;
import dev.projetpaie.exception.MatriculeNonTrouveException;
import dev.projetpaie.exception.RemunerationEmployeException;
import dev.projetpaie.service.RemunerationEmployeService;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@RestController
@RequestMapping(value = "/remuneration_employe")
public class RemunerationEmployeController {

    @Autowired
    private RemunerationEmployeService remunerationEmployeService;

    @PostMapping

    public RemunerationEmployeDto ajouterEmploye(@Valid @RequestBody AjouterEmployeDto ajoutEmployeDto)
            throws MatriculeNonTrouveException, RemunerationEmployeException {
        return new RemunerationEmployeDto(remunerationEmployeService.ajouterEmploye(ajoutEmployeDto));
    }

    // TODO Get sur remuneration employe ( @GetMapping(params = "matricules")
    // @GetMapping
    // public List<RemunerationEmployeDto> findRemunerationEmploye() {
    // return remunerationEmployeService.;
    // }
}