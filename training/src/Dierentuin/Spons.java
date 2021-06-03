package Dierentuin;

import java.util.Date;

public abstract class Spons extends Ongewerveld implements OnderWater {


    public Spons(String naam, String Kleur) {
        super(naam, Kleur);
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
