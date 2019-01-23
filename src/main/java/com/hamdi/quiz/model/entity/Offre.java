
package com.hamdi.quiz.model.entity;


import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.util.List;

@Entity
@Table(name = "OFFRE")
public class Offre {

    @Id
    @Column(name = "IDOFFRE")
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "user_seq")
    @SequenceGenerator(name = "user_seq", sequenceName = "user_seq", allocationSize = 1)
    private Long id;


    @Column(name = "LIBOFFRE", length = 200)
    @NotNull
    @Size(min = 4, max = 200)
    private String liboffre;


    @ManyToOne
    @JoinColumn(name = "concours_id")
    private Concours concours;


    @ManyToOne
    @JoinColumn(name = "specialite_id")
    private Specialite specialitebts;

    @ManyToMany
    @JoinTable(name = "OFFRE_BTP", joinColumns = @JoinColumn(name = "IDOFFRE"), inverseJoinColumns =
    @JoinColumn(name = "ID"))
    private List<Specialite> specialites;

    @OneToOne
    @JoinColumn(name = "centre_id")
    private Centre centre;

    @Column(name = "NBPOSTES")
    @NotNull
    private int nbpostes;


    @OneToMany
    @JsonIgnore
    private List<OffreEpreuve> epreuves;

    public Long getId() {
        return id;
    }

    public String getLiboffre() {
        return liboffre;
    }

    public Concours getConcours() {
        return concours;
    }

    public Specialite getSpecialitebts() {
        return specialitebts;
    }

    public List<Specialite> getSpecialites() {
        return specialites;
    }

    public Centre getCentre() {
        return centre;
    }

    public int getNbpostes() {
        return nbpostes;
    }

    public List<OffreEpreuve> getEpreuves() {
        return epreuves;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setLiboffre(String liboffre) {
        this.liboffre = liboffre;
    }

    public void setConcours(Concours concours) {
        this.concours = concours;
    }

    public void setSpecialitebts(Specialite specialitebts) {
        this.specialitebts = specialitebts;
    }

    public void setSpecialites(List<Specialite> specialites) {
        this.specialites = specialites;
    }

    public void setCentre(Centre centre) {
        this.centre = centre;
    }

    public void setNbpostes(int nbpostes) {
        this.nbpostes = nbpostes;
    }

    public void setEpreuves(List<OffreEpreuve> epreuves) {
        this.epreuves = epreuves;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Offre)) return false;

        Offre offre = (Offre) o;

        return getId().equals(offre.getId());
    }

    @Override
    public int hashCode() {
        return getId().hashCode();
    }
}