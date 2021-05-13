package oefening1;

import java.util.Date;


public abstract class HolteDier extends Ongewerveld{

    /**
     * @param naam
     * @param geboorteDatum;
     * @param kleur;
     */

    private int diam;

    public HolteDier() {
        super();
    }

    public HolteDier(String naam, Date geboorteDatum, Enum kleur, int diam) {
        super(naam, geboorteDatum, kleur);
        this.diam = diam;
    }
    public abstract String maakGeluid();
}

