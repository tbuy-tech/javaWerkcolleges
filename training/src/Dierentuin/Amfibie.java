package Dierentuin;

import java.util.Date;

public abstract class Amfibie extends Gewerveld {


    public Amfibie(String naam, double lengte, String huidType) {
        super(naam, lengte, huidType);
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
