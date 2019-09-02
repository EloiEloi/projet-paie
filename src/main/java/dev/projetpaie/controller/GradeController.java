package dev.projetpaie.controller;

import dev.projetpaie.dto.GradeDto;

import dev.projetpaie.service.GradeService;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GradeController {

    private static final Logger LOGGER = LoggerFactory.getLogger(GradeController.class);

    private GradeService gradeService;

    @RequestMapping(path = "/grades", method = RequestMethod.GET)
    public ResponseEntity<List<GradeDto>> listeGrades() {
        LOGGER.info("appel de listeGrades()");
        return ResponseEntity.status(200).contentType(MediaType.APPLICATION_JSON)
                .body(gradeService.recupererListeGradesDto());
    }

}