package dev.projetpaie.dto;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import dev.projetpaie.repository.EntrepriseRepository;
import dev.projetpaie.repository.ProfilRemunerationRepository;
import dev.projetpaie.service.GradeService;
import dev.projetpaie.service.ProfilRemunerationService;

public class ReferentielDto {

    @Autowired
    private List<EntrepriseDto> listeEntrepriseDto;
    @Autowired
    private List<GradeDto> listeGradeDto;
    @Autowired
    private List<ProfilRemunerationDto> listeProfilRemunerationDto;

    public ReferentielDto() {
        super();
    }

    /**
     * @param listeEntrepriseDto
     * @param listeGradeDto
     * @param listeRemunerationDto
     */

    public ReferentielDto(List<EntrepriseDto> listeEntrepriseDto, List<GradeDto> listeGradeDto,
            List<ProfilRemunerationDto> listeProfilRemunerationDto) {
        this.listeEntrepriseDto = listeEntrepriseDto;
        this.listeGradeDto = listeGradeDto;
        this.listeProfilRemunerationDto = listeProfilRemunerationDto;
    }

    /**
     * @return the listeEntrepriseDto
     */
    public List<EntrepriseDto> getListeEntrepriseDto() {
        return listeEntrepriseDto;
    }

    /**
     * @param listeEntrepriseDto the listeEntrepriseDto to set
     */
    public void setListeEntrepriseDto(List<EntrepriseDto> listeEntrepriseDto) {
        this.listeEntrepriseDto = listeEntrepriseDto;
    }

    /**
     * @return the listeGradeDto
     */
    public List<GradeDto> getListeGradeDto() {
        return listeGradeDto;
    }

    /**
     * @param listeGradeDto the listeGradeDto to set
     */
    public void setListeGradeDto(List<GradeDto> listeGradeDto) {
        this.listeGradeDto = listeGradeDto;
    }

    /**
     * @return the listeProfilRemunerationDto
     */
    public List<ProfilRemunerationDto> getListeProfilRemunerationDto() {
        return listeProfilRemunerationDto;
    }

    /**
     * @param listeProfilRemunerationDto the listeProfilRemunerationDto to set
     */
    public void setListeProfilRemunerationDto(List<ProfilRemunerationDto> listeProfilRemunerationDto) {
        this.listeProfilRemunerationDto = listeProfilRemunerationDto;
    }

}