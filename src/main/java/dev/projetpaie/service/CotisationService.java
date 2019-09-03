package dev.projetpaie.service;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import dev.projetpaie.dto.CotisationDto;
import dev.projetpaie.repository.CotisationRepository;

@Service
public class CotisationService {

    @Autowired
    private CotisationRepository cotisationRepository;

    public List<CotisationDto> recupererListeCotisationsDto() {

        return cotisationRepository.findAll().stream().map(cr -> new CotisationDto(cr.getCode(), cr.getLibelle()))
                .collect(Collectors.toList());
    }
}