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

    // @PostMapping
    // public ResponseEntity<List<EntrepriseDto>> listerEntreprises() {
    // return new ResponseEntity<>(entrepriseService.recupererListeEntreprisesDto(),
    // HttpStatus.OK);
    // }

    // @PostMapping
    // public ResponseEntity<Post> create(@PathVariable String username,
    // @RequestBody Post post)
    // throws ContentNotAllowedException {
    // List<ObjectError> contentNotAllowedErrors =
    // ContentUtils.getContentErrorsFrom(post);

    // if (!contentNotAllowedErrors.isEmpty()) {
    // throw ContentNotAllowedException.createWith(contentNotAllowedErrors);
    // }

    // // More logic on Post

    // return new ResponseEntity<>(HttpStatus.CREATED);
    // }

    // @ExceptionHandler(ContentNotAllowedException.class)
    // public ResponseEntity<ApiError>
    // handleContentNotAllowedException(ContentNotAllowedException cnae) {
    // List<String> errorMessages = cnae.getErrors()
    // .stream()
    // .map(contentError -> contentError.getObjectName() + " " +
    // contentError.getDefaultMessage())
    // .collect(Collectors.toList());

    // return new ResponseEntity<>(new ApiError(errorMessages),
    // HttpStatus.BAD_REQUEST);
    // }

    // TODO Get sur remuneration employe ( @GetMapping(params = "matricules")
    // @GetMapping
    // public List<RemunerationEmployeDto> findRemunerationEmploye() {
    // return remunerationEmployeService.;
    // }
}