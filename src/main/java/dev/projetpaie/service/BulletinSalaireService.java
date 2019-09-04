package dev.projetpaie.service;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import dev.projetpaie.dto.BulletinSalaireDto;
import dev.projetpaie.repository.BulletinSalaireRepository;

@Service
public class BulletinSalaireService {

    @Autowired
    private BulletinSalaireRepository bulletinSalaireRepository;

    public List<BulletinSalaireDto> recuperListeBulletinsSalairesDto() {

        return bulletinSalaireRepository.findAll().stream().map(br -> new BulletinSalaireDto())
                .collect(Collectors.toList());
    };
}