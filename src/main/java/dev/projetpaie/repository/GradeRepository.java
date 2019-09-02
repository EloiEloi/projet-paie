package dev.projetpaie.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import dev.projetpaie.entities.Grade;

public interface GradeRepository extends JpaRepository<Grade, String> {

}