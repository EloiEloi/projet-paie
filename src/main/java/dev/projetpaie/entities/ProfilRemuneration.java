package dev.projetpaie.entities;

import java.util.List;

public class ProfilRemuneration {

    private Integer id;
    private String code;
    private List<Cotisation> cotisations;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public List<Cotisation> getCotisations() {
        return cotisations;
    }

    public void setCotisations(List<Cotisation> cotisations) {
        this.cotisations = cotisations;
    }

}
