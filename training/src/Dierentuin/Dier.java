package Dierentuin;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Date;

public abstract class Dier implements Geluid, Comparable<Dier> {
    private  String naam;
    private String type;
    private int code;
    private Date geboorteDatum = null;
    private static int aantalDieren = 0;

    public Dier(String naam) {
        this.naam = naam;
        this.type = this.getClass().getSimpleName();
        this.code = hashCode();
        aantalDieren++;
    }

    public Date getGeboorteDatum() {
        return geboorteDatum;
    }

    public void setGeboorteDatum(Date geboorteDatum) {
        this.geboorteDatum = geboorteDatum;
    }

    @Override
    public String toString() {
        return "Dier{" +
                "naam='" + naam + '\'' +
                ", type='" + type + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Dier dier = (Dier) o;

        if (!naam.equals(dier.naam)) return false;
        return type.equals(dier.type);
    }

    @Override
    public int hashCode() {
        int result = naam.hashCode();
        result = 31 * result + type.hashCode();
        return result;
    }

    @Override
    public abstract void maakGeluid();

    @Override
    public int compareTo(Dier o) {
        if (o == null) {
            return 1;
        }
        if (this.naam == null) {
            if (o.naam != null) {
                return -1;
            } else {
                return 0;
            }
        } else {
            return this.naam.compareTo(o.naam);
        }
    }
}
