package Dierentuin;

import java.util.Date;

public abstract class Vis extends Gewerveld implements OnderWater {

    private int aantalVinnen;

    public Vis(String naam, double lengte, String huidType, int aantalVinnen) {
        super(naam, lengte, huidType);
        this.aantalVinnen = aantalVinnen;
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
    public abstract void tijdOnderWater();

    @Override
    public String toString() {
        return super.toString();
    }
}
