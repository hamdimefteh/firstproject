
package com.hamdi.quiz.model.entity;


import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.util.List;

@Entity
@Table(name = "CENTRE")
public class Centre {

    @Id
    @Column(name = "ID")
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "user_seq")
    @SequenceGenerator(name = "user_seq", sequenceName = "user_seq", allocationSize = 1)
    private Long id;

    @Column(name = "CODECENTRE", length = 50)
    @NotNull
    @Size(min = 4, max = 50)
    private String codecentre;


    @Column(name = "LIBCENTRE", length = 200)
    @NotNull
    @Size(min = 4, max = 200)
    private String libcentre;


    @Column(name = "CENTREEXAMEN", length = 200)
    @NotNull
    @Size(min = 3, max = 3)
    private String centreexamen;

    @ManyToOne
    @JoinColumn(name="gouvernorat_id")
    private Gouvernorat  gouvernorat;

    @ManyToMany(mappedBy="specialites")
    @JsonIgnore
    private List<Offre> offres;

    public void setOffres(List<Offre> offres) {
        this.offres = offres;
    }



    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCodecentre() {
        return codecentre;
    }

    public void setCodecentre(String codecentre) {
        this.codecentre = codecentre;
    }

    public String getLibcentre() {
        return libcentre;
    }

    public void setLibcentre(String libcentre) {
        this.libcentre = libcentre;
    }

    public String getCentreexamen() {
        return centreexamen;
    }

    public void setCentreexamen(String centreexamen) {
        this.centreexamen = centreexamen;
    }

    public Gouvernorat getGouvernorat() {
        return gouvernorat;
    }

    public void setGouvernorat(Gouvernorat gouvernorat) {
        this.gouvernorat = gouvernorat;
    }

    public List<Offre> getOffres() {
        return offres;
    }


}