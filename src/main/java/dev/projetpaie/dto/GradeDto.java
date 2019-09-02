package dev.projetpaie.dto;

import java.math.BigDecimal;

import dev.projetpaie.entities.Grade;

public class GradeDto {

    private String code;
    private BigDecimal nbHeuresBase;
    private BigDecimal tauxBase;

    public GradeDto() {
        super();
    }

    public GradeDto(Grade grade) {
        this.code = grade.getCode();
        this.nbHeuresBase = grade.getNbHeuresBase();
        this.tauxBase = grade.getTauxBase();
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public BigDecimal getNbHeuresBase() {
        return nbHeuresBase;
    }

    public void setNbHeuresBase(BigDecimal nbHeuresBase) {
        this.nbHeuresBase = nbHeuresBase;
    }

    public BigDecimal getTauxBase() {
        return tauxBase;
    }

    public void setTauxBase(BigDecimal tauxBase) {
        this.tauxBase = tauxBase;
    }

}