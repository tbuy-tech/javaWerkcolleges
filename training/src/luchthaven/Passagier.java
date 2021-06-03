package luchthaven;

import java.time.LocalDate;

public abstract class Passagier implements Comparable<Passagier> {
    private String naam;
    private LocalDate opstartDatum;

    public Passagier(String naam) {
        this.naam = naam;
        this.opstartDatum = LocalDate.now();
    }

    public String getNaam() {
        return naam;
    }

    public LocalDate getOpstartDatum() {
        return opstartDatum;
    }

    public abstract void geefSpecifiekeInfo();

    @Override
    public int compareTo(Passagier o) {
        if (o == null) {
            return 1;
        }
        if (this.naam == null){
            if (o.getNaam() == null){
                return 0;
            } else {
                return -1;
            }
        } else {
            return this.naam.compareTo(o.naam);
        }
    }

    @Override
    public String toString() {
        return "Passagier{" +
                "naam='" + naam + '\'' +
                ", Opstartdatum=" + opstartDatum +
                '}';
    }
}
