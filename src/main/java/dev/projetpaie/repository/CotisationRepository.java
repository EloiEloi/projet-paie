package dev.projetpaie.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import dev.projetpaie.entities.Cotisation;

public interface CotisationRepository extends JpaRepository<Cotisation, String> {

}