/*
 * Copyright (c) 2018. Lorem ipsum dolor sit amet, consectetur adipiscing elit.
 * Morbi non lorem porttitor neque feugiat blandit. Ut vitae ipsum eget quam lacinia accumsan.
 * Etiam sed turpis ac ipsum condimentum fringilla. Maecenas magna.
 * Proin dapibus sapien vel ante. Aliquam erat volutpat. Pellentesque sagittis ligula eget metus.
 * Vestibulum commodo. Ut rhoncus gravida arcu.
 */

package com.hamdi.quiz.model.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.util.List;

@Entity
@Table(name = "EPREUVE")
public class Epreuve {

    @Id
    @Column(name = "IDEPREUVE")
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "user_seq")
    @SequenceGenerator(name = "user_seq", sequenceName = "user_seq", allocationSize = 1)
    private Long id;


    @Column(name = "CODEEPREUVE", length = 50)
    @NotNull
    @Size(min = 4, max = 50)
    private String codeepreuve;

    @Column(name = "LABELEPREUVE", length = 200)
    @NotNull
    @Size(min = 4, max = 200)
    private String labelepreuve;


    @OneToMany(mappedBy = "epreuve")
    @JsonIgnore
    private List<OffreEpreuve> offres;

    public Long getId() {
        return id;
    }

    public String getCodeepreuve() {
        return codeepreuve;
    }

    public String getLabelepreuve() {
        return labelepreuve;
    }

    public List<OffreEpreuve> getOffres() {
        return offres;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setCodeepreuve(String codeepreuve) {
        this.codeepreuve = codeepreuve;
    }

    public void setLabelepreuve(String labelepreuve) {
        this.labelepreuve = labelepreuve;
    }

    public void setOffres(List<OffreEpreuve> offres) {
        this.offres = offres;
    }

}
