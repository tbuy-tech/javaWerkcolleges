package oefening1;

import java.util.Date;

public abstract class Dier {
    private String naam;
    private Date geboorteDatum = new Date();
    private int code;
    private static int aantalDieren = 0;

    public Dier(String naam, Date geboorteDatum) {
        this.naam = naam;
        this.geboorteDatum = geboorteDatum;
        this.code = ++aantalDieren;
    }

    public Dier() {

    }

    public String getNaam() {
        return naam;
    }

    public Date getGeboorteDatum() {
        return geboorteDatum;
    }

    public int getCode() {
        return code;
    }

    public static int getAantalDieren() {
        return aantalDieren;
    }

    @Override
    public String toString() {
        return "Dier{" +
                "naam='" + naam + '\'' +
                ", geboorteDatum=" + geboorteDatum +
                ", code=" + code +
                ", type=" +getClass().getSimpleName() +
                '}';
    }
    public abstract String maakGeluid();
}
