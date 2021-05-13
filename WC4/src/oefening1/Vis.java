package oefening1;

import java.util.Date;

public abstract class Vis extends Gewerveld{

    /**
     * @param naam
     * @param geboorteDatum;
     * @param lengte;
     * @param huidtype;
     */

    private  int AantalVinnen;

    public Vis(){
        super();
    }

    public Vis(String naam, Date geboorteDatum, int lengte, Enum huidtype) {
        super(naam, geboorteDatum, lengte, huidtype);
    }

    public Vis(String naam, Date geboorteDatum, int lengte, Enum huidtype, int AantalVinnen) {
        super(naam, geboorteDatum, lengte, huidtype);
        this.AantalVinnen = AantalVinnen;
    }

    public int getAantalVinnen() {
        return AantalVinnen;
    }

    public void setAantalVinnen(int aantalVinnen) {
        this.AantalVinnen = aantalVinnen;
    }


    public abstract String maakGeluid();
}
