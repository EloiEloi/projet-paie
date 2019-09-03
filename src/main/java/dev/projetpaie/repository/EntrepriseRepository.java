package dev.projetpaie.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import dev.projetpaie.entities.Entreprise;

public interface EntrepriseRepository extends JpaRepository<Entreprise, Integer> {

    Entreprise findByCode(String codeEntreprise);

}