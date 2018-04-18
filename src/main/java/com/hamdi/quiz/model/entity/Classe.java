package com.hamdi.quiz.model.entity;


import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Classe {
    @Id
    private Long id;
    private String Label;
    private String code ;

    public Classe() {

    }

    public Classe(Long id, String label, String code) {
        this.id = id;
        Label = label;
        this.code = code;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getLabel() {
        return Label;
    }

    public void setLabel(String label) {
        Label = label;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Classe)) return false;

        Classe classe = (Classe) o;

        return getId().equals(classe.getId());
    }

    @Override
    public int hashCode() {
        return getId().hashCode();
    }
}
