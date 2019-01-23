
package com.hamdi.quiz.model.entity;



import javax.persistence.*;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.util.Date;
import java.util.List;

@Entity
@Table(name = "OFFREEPREUVE-EXAMEN")
@IdClass(OffreEpreuveId.class)
public class OffreEpreuve {
    @Id
    @ManyToOne
    @JoinColumn(name = "offre_id")
    private Offre offre;

    @Id
    @ManyToOne
    @JoinColumn(name = "epreuve_id")
    private Epreuve epreuve;

    @Column(name = "LABELEXAMEN")

    private String labelexamen;

    @Column(name = "DATEEXAMEN")

    private Date dateexamen;

    @Column(name = "HORAIREEXAMEN")

    private String horaireexamen;

    public Offre getOffre() {
        return offre;
    }

    public Epreuve getEpreuve() {
        return epreuve;
    }

    public String getLabelexamen() {
        return labelexamen;
    }

    public Date getDateexamen() {
        return dateexamen;
    }

    public String getHoraireexamen() {
        return horaireexamen;
    }

    public void setOffre(Offre offre) {
        this.offre = offre;
    }

    public void setEpreuve(Epreuve epreuve) {
        this.epreuve = epreuve;
    }

    public void setLabelexamen(String labelexamen) {
        this.labelexamen = labelexamen;
    }

    public void setDateexamen(Date dateexamen) {
        this.dateexamen = dateexamen;
    }

    public void setHoraireexamen(String horaireexamen) {
        this.horaireexamen = horaireexamen;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof OffreEpreuve)) return false;

        OffreEpreuve that = (OffreEpreuve) o;

        if (getOffre() != null ? !getOffre().equals(that.getOffre()) : that.getOffre() != null) return false;
        return getEpreuve() != null ? getEpreuve().equals(that.getEpreuve()) : that.getEpreuve() == null;
    }

    @Override
    public int hashCode() {
        int result = getOffre() != null ? getOffre().hashCode() : 0;
        result = 31 * result + (getEpreuve() != null ? getEpreuve().hashCode() : 0);
        return result;
    }
}