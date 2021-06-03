package Dierentuin;

import java.util.Date;

public abstract class Gewerveld extends Dier {
    private double lengte;
    private String huidType;

    public Gewerveld(String naam, double lengte, String huidType) {
        super(naam);
        this.lengte = lengte;
        this.huidType = huidType;
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
