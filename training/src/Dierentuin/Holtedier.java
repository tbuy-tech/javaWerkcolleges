package Dierentuin;

import java.util.Date;

public abstract class Holtedier extends Ongewerveld implements OnderWater{

    private  int diameter;

    public Holtedier(String naam, String Kleur, int diameter) {
        super(naam, Kleur);
        this.diameter = diameter;
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
