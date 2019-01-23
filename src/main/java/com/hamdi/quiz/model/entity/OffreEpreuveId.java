
package com.hamdi.quiz.model.entity;
import java.io.Serializable;
public class OffreEpreuveId implements Serializable {
    private static final long serialVersionUID = 1L;
    private int offre;
    private int epreuve;

    public static long getSerialVersionUID() {
        return serialVersionUID;
    }

    public int getOffre() {
        return offre;
    }

    public int getEpreuve() {
        return epreuve;
    }

    public void setOffre(int offre) {
        this.offre = offre;
    }

    public void setEpreuve(int epreuve) {
        this.epreuve = epreuve;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof OffreEpreuveId)) return false;

        OffreEpreuveId that = (OffreEpreuveId) o;

        if (getOffre() != that.getOffre()) return false;
        return getEpreuve() == that.getEpreuve();
    }

    @Override
    public int hashCode() {
        int result = getOffre();
        result = 31 * result + getEpreuve();
        return result;
    }
}

