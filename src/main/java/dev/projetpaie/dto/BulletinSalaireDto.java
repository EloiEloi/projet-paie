package dev.projetpaie.dto;

import java.math.BigDecimal;
import java.time.ZonedDateTime;

import dev.projetpaie.entities.Periode;

public class BulletinSalaireDto {

    private ZonedDateTime dateCreation;
    private Periode periode;
    private String matricule;
    private BigDecimal salaireBrut;
    private BigDecimal salaireNetImposable;
    private BigDecimal salaireNetAPayer;

    public BulletinSalaireDto() {
        super();
    }

    public BulletinSalaireDto(ZonedDateTime dateCreation, Periode periode, String matricule, BigDecimal salaireBrut,
            BigDecimal salaireNetImposable, BigDecimal salaireNetAPayer) {
        this.dateCreation = dateCreation;
        this.periode = periode;
        this.matricule = matricule;
        this.salaireBrut = salaireBrut;
        this.salaireNetImposable = salaireNetImposable;
        this.salaireNetAPayer = salaireNetAPayer;
    }

    public ZonedDateTime getDateCreation() {
        return this.dateCreation;
    }

    public void setDateCreation(ZonedDateTime dateCreation) {
        this.dateCreation = dateCreation;
    }

    public Periode getPeriode() {
        return this.periode;
    }

    public void setPeriode(Periode periode) {
        this.periode = periode;
    }

    public String getMatricule() {
        return this.matricule;
    }

    public void setMatricule(String matricule) {
        this.matricule = matricule;
    }

    public BigDecimal getSalaireBrut() {
        return this.salaireBrut;
    }

    public void setSalaireBrut(BigDecimal salaireBrut) {
        this.salaireBrut = salaireBrut;
    }

    public BigDecimal getSalaireNetImposable() {
        return this.salaireNetImposable;
    }

    public void setSalaireNetImposable(BigDecimal salaireNetImposable) {
        this.salaireNetImposable = salaireNetImposable;
    }

    public BigDecimal getSalaireNetAPayer() {
        return this.salaireNetAPayer;
    }

    public void setSalaireNetAPayer(BigDecimal salaireNetAPayer) {
        this.salaireNetAPayer = salaireNetAPayer;
    }

}