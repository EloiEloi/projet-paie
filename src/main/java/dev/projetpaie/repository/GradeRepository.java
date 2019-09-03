package dev.projetpaie.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import dev.projetpaie.entities.Grade;

public interface GradeRepository extends JpaRepository<Grade, String> {
    Grade findByCode(String code);

}