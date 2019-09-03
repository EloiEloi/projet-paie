package dev.projetpaie.dto;

import javax.validation.constraints.NotBlank;

public class AjouterEmployeDto {

    @NotBlank
    private String matricule;
    @NotBlank
    private String codeEntreprise;
    @NotBlank
    private String codeProfil;
    @NotBlank
    private String codeGrade;

    public AjouterEmployeDto() {
    }

    public AjouterEmployeDto(@NotBlank String matricule, @NotBlank String codeEntreprise, @NotBlank String codeProfil,
            @NotBlank String codeGrade) {
        this.matricule = matricule;
        this.codeEntreprise = codeEntreprise;
        this.codeProfil = codeProfil;
        this.codeGrade = codeGrade;
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
     * @return the codeEntreprise
     */
    public String getCodeEntreprise() {
        return codeEntreprise;
    }

    /**
     * @param codeEntreprise the codeEntreprise to set
     */
    public void setCodeEntreprise(String codeEntreprise) {
        this.codeEntreprise = codeEntreprise;
    }

    /**
     * @return the codeProfil
     */
    public String getCodeProfil() {
        return codeProfil;
    }

    /**
     * @param codeProfil the codeProfil to set
     */
    public void setCodeProfil(String codeProfil) {
        this.codeProfil = codeProfil;
    }

    /**
     * @return the codeGrade
     */
    public String getCodeGrade() {
        return codeGrade;
    }

    /**
     * @param codeGrade the codeGrade to set
     */
    public void setCodeGrade(String codeGrade) {
        this.codeGrade = codeGrade;
    }

}