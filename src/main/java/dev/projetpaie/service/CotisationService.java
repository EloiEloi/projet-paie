package dev.projetpaie.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import dev.projetpaie.entities.Cotisation;

@Service
public class CotisationService {

    @Autowired
    private CotisationService cotisationService;

    public List<Cotisation> recupererListeCotisationsDto() {
        return cotisationService.findAll();
    }
}