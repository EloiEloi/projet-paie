package dev.projetpaie.dto;

public class CotisationDto {

    private String code;
    private String libelle;

    public CotisationDto() {
        super();
    }

    /**
     * @param code
     * @param libelle
     */

    public CotisationDto(String code, String libelle) {
        this.code = code;
        this.libelle = libelle;
    }

    /**
     * @return the code
     */
    public String getCode() {
        return code;
    }

    /**
     * @param code the code to set
     */
    public void setCode(String code) {
        this.code = code;
    }

    /**
     * @return the libelle
     */
    public String getLibelle() {
        return libelle;
    }

    /**
     * @param libelle the libelle to set
     */
    public void setLibelle(String libelle) {
        this.libelle = libelle;
    }

}