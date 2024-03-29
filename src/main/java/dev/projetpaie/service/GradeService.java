package dev.projetpaie.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import dev.projetpaie.dto.GradeDto;
import dev.projetpaie.entities.Grade;

import dev.projetpaie.repository.GradeRepository;

@Service
public class GradeService {

    @Autowired
    private GradeRepository gradeRepository;

    public List<GradeDto> recupererListeGradesDto() {
        List<Grade> listeGrades = gradeRepository.findAll();
        List<GradeDto> listeGradesDto = new ArrayList<>();

        for (Grade gr : listeGrades) {
            listeGradesDto.add(new GradeDto(gr));
        }

        return listeGradesDto;
    }

    public Grade recupererGradeParCode(String codeGrade) {
        return gradeRepository.findByCode(codeGrade);
    }

}