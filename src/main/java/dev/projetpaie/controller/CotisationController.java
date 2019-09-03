package dev.projetpaie.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import dev.projetpaie.dto.CotisationDto;
import dev.projetpaie.service.CotisationService;

@RestController
@RequestMapping(value = "/cotisations")
public class CotisationController {

    @Autowired
    private CotisationService cotisationService;

    @GetMapping
    public ResponseEntity<List<CotisationDto>> listerCotisations() {
        return null;
        // return new ResponseEntity<>(cotisationService.recupererListeCotisationsDto(),
        // HttpStatus.OK);
    }

}