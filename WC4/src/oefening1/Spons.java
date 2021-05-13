package oefening1;

import java.util.Date;

public abstract class Spons extends Ongewerveld {
    /**
     * @param naam
     * @param geboorteDatum;
     * @param kleur;
     */
    public Spons(String naam, Date geboorteDatum, Enum kleur) {
        super(naam, geboorteDatum, kleur);
    }

    public Spons() {
    }
    public abstract String maakGeluid();
}
