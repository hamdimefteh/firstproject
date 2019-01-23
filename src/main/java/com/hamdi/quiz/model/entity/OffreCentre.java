
package com.hamdi.quiz.model.entity;


import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.util.List;

@Entity
@Table(name = "OFFRECENTRE")
@IdClass(OffreCentreId.class)
public class OffreCentre {
    @Id
    @ManyToOne
    @JoinColumn(name="offre_id")
    private Offre offre;

    @Id
    @ManyToOne
    @JoinColumn(name="centre_id")
    private Centre centre;

    @Column(name = "NBpostes")
    @NotNull
    private int nbpostes;

    public Centre getCentre() {
        return centre;
    }

    public int getNbpostes() {
        return nbpostes;
    }

    public void setCentre(Centre centre) {
        this.centre = centre;
    }

    public void setNbpostes(int nbpostes) {
        this.nbpostes = nbpostes;
    }
}