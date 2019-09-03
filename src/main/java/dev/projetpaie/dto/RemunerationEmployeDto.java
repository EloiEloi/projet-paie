package dev.projetpaie.dto;

import java.time.ZonedDateTime;

import dev.projetpaie.entities.RemunerationEmploye;

public class RemunerationEmployeDto {

    private String matricule;
    private ZonedDateTime dateCreation;
    private String gradeCode;

    public RemunerationEmployeDto() {
        super();
    }

    public RemunerationEmployeDto(RemunerationEmploye remunerationEmploye) {
        this.matricule = remunerationEmploye.getMatricule();
        this.dateCreation = remunerationEmploye.getDateCreation();
        this.gradeCode = remunerationEmploye.getGrade().getCode();
    }

    /**
     * @return the matricule
     */
    public String getMatricule() {
        return matricule;
    }

    /**
     * @param matricule the matricule to set
     */
    public void setMatricule(String matricule) {
        this.matricule = matricule;
    }

    /**
     * @return the dateCreation
     */
    public ZonedDateTime getDateCreation() {
        return dateCreation;
    }

    /**
     * @param dateCreation the dateCreation to set
     */
    public void setDateCreation(ZonedDateTime dateCreation) {
        this.dateCreation = dateCreation;
    }

    /**
     * @return the gradeCode
     */
    public String getGradeCode() {
        return gradeCode;
    }

    /**
     * @param gradeCode the gradeCode to set
     */
    public void setGradeCode(String gradeCode) {
        this.gradeCode = gradeCode;
    }

}