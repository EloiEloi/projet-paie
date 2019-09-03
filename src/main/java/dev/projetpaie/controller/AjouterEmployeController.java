package dev.projetpaie.controller;

import org.springframework.web.bind.annotation.RestController;

import dev.projetpaie.exception.EmployeNonTrouveException;
import dev.projetpaie.service.RemunerationEmployeService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@RestController
@RequestMapping(value = "/remuneration_employe")
public class AjouterEmployeController {

    @Autowired
    private RemunerationEmployeService remunerationEmployeService;

    @PostMapping
    public void ajouterEmploye(@RequestParam String matricule, @RequestParam String entreprise,
            @RequestParam String profil, @RequestParam String grade) {
        // return new remunerationEmployeService.;
    }

    @ExceptionHandler(EmployeNonTrouveException.class)
    public ResponseEntity<String> handleConflict(EmployeNonTrouveException exception) {
        HttpHeaders responseHeaders = new HttpHeaders();
        responseHeaders.set("MyResponseHeader", "MyValue");
        String bodyOfResponse = exception.getMessage();
        return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(bodyOfResponse);
    }

}