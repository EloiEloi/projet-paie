package dev.projetpaie.controller;

import dev.projetpaie.dto.GradeDto;

import dev.projetpaie.service.GradeService;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/grades")
public class GradeController {

    @Autowired
    private GradeService gradeService;

    @GetMapping
    public ResponseEntity<List<GradeDto>> listeGrades() {
        return ResponseEntity.status(200).contentType(MediaType.APPLICATION_JSON)
                .body(gradeService.recupererListeGradesDto());
    }

}