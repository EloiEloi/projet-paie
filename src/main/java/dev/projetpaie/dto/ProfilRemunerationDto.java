package dev.projetpaie.dto;

public class ProfilRemunerationDto {

    private String code;

    public ProfilRemunerationDto() {
        super();
    }

    /**
     * @param code
     */

    public ProfilRemunerationDto(String code) {
        this.code = code;
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

}