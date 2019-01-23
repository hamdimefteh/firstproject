package com.hamdi.quiz.model.entity;


import com.fasterxml.jackson.annotation.JsonIgnore;
import com.hamdi.quiz.model.security.User;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.util.List;

@Entity
@Table(name = "CANDIDATURE")
public class Candidature {

    @Id
    @Column(name = "ID")
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "candidature_seq")
    @SequenceGenerator(name = "candidature_seq", sequenceName = "candidature_seq", allocationSize = 1)
    private Long id;

    @Column(name = "ETAT", length = 20)
    @NotNull
    private String etat;


    @Column(name = "RESULTAT", length = 20)
    @Size(min =4, max = 20)
    private String resultat;


    @Column(name = "MOYENNE", length = 20)

    private int moyenne;


    @ManyToOne
    @JoinColumn(name = "offre_id")
    private Offre offre;

    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;

    public Specialite getSpecialite() {
        return specialite;
    }

    public Centre getCentre() {
        return centre;
    }

    public void setSpecialite(Specialite specialite) {
        this.specialite = specialite;
    }

    public void setCentre(Centre centre) {
        this.centre = centre;
    }

    @ManyToOne
    @JoinColumn(name = "specialite_id")
    private Specialite specialite;

    @ManyToOne
    @JoinColumn(name = "centre_id")
    private Centre centre;

    public Long getId() {
        return id;
    }

    public String getEtat() {
        return etat;
    }

    public String getResultat() {
        return resultat;
    }

    public int getMoyenne() {
        return moyenne;
    }

    public Offre getOffre() {
        return offre;
    }

    public User getUser() {
        return user;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setEtat(String etat) {
        this.etat = etat;
    }

    public void setResultat(String resultat) {
        this.resultat = resultat;
    }

    public void setMoyenne(int moyenne) {
        this.moyenne = moyenne;
    }

    public void setOffre(Offre offre) {
        this.offre = offre;
    }

    public void setUser(User user) {
        this.user = user;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Candidature)) return false;

        Candidature that = (Candidature) o;

        return getId() != null ? getId().equals(that.getId()) : that.getId() == null;
    }

    @Override
    public int hashCode() {
        return getId() != null ? getId().hashCode() : 0;
    }
}