package oefening1;

import java.util.Date;

public abstract class Ongewerveld extends Dier {

    /**
     * @param naam
     * @param geboorteDatum;
     */
    private Enum Kleur;

    public Ongewerveld(String naam, Date geboorteDatum, Enum kleur) {
        super(naam, geboorteDatum);
        Kleur = kleur;
    }

    public Ongewerveld() {
    }

    public Enum getKleur() {
        return Kleur;
    }

    public void setKleur(Enum kleur) {
        Kleur = kleur;
    }
    public abstract String maakGeluid();
}

