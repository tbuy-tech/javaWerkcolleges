package Dierentuin;

import java.util.Date;

public abstract class Ongewerveld extends Dier {


    private String kleur;

    public Ongewerveld(String naam, String Kleur) {
        super(naam);
        this.kleur = kleur;
    }

    @Override
    public Date getGeboorteDatum() {
        return super.getGeboorteDatum();
    }

    @Override
    public void setGeboorteDatum(Date geboorteDatum) {
        super.setGeboorteDatum(geboorteDatum);
    }


    @Override
    public abstract void maakGeluid();

    @Override
    public String toString() {
        return super.toString();
    }
}
