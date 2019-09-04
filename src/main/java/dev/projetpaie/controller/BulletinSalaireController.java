package dev.projetpaie.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import dev.projetpaie.service.BulletinSalaireService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@RestController
@RequestMapping(value = "/bulletin_salaire")
public class BulletinSalaireController {

    @Autowired
    private BulletinSalaireService bulletinSalaireService;

    @GetMapping
    public ResponseEntity<List<BulletinSalaireDto>> findRemunerationEmploye() {
        return new ResponseEntity<>(bulletinSalaireService.   (), HttpStatus.OK);
    }

}