
package com.hamdi.quiz.model.entity;
import java.io.Serializable;
public class OffreCentreId implements Serializable {
    private static final long serialVersionUID = 1L;
    private int offre;
    private int centre;

    public static long getSerialVersionUID() {
        return serialVersionUID;
    }

    public void setOffre(int offre) {
        this.offre = offre;
    }

    public void setCentre(int centre) {
        this.centre = centre;
    }

    public int getOffre() {
        return offre;

    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof OffreCentreId)) return false;

        OffreCentreId that = (OffreCentreId) o;

        if (getOffre() != that.getOffre()) return false;
        return getCentre() == that.getCentre();
    }

    @Override
    public int hashCode() {
        int result = getOffre();
        result = 31 * result + getCentre();
        return result;
    }

    public int getCentre() {
        return centre;
    }
}

