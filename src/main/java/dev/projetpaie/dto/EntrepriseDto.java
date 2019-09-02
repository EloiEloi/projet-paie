package dev.projetpaie.dto;

public class EntrepriseDto {

    private String code;
    private String denomination;

    public EntrepriseDto() {
        super();
    }

    public EntrepriseDto(String code, String denomination) {
        this.code = code;
        this.denomination = denomination;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getDenomination() {
        return denomination;
    }

    public void setDenomination(String denomination) {
        this.denomination = denomination;
    }
}