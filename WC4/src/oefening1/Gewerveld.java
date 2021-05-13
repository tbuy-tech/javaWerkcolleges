package oefening1;

import java.util.Date;

public abstract class Gewerveld extends Dier {

    /**
     * @param naam
     * @param geboorteDatum;
     */
    private int lengte;
    private Enum Huidtype;

    public Gewerveld(String naam, Date geboorteDatum, int lengte, Enum huidtype) {
        super(naam, geboorteDatum);
        this.lengte = lengte;
        Huidtype = huidtype;
    }

    public Gewerveld() {
        super();
    }

    public int getLengte() {
        return lengte;
    }

    public void setLengte(int lengte) {
        this.lengte = lengte;
    }

    public Enum getHuidtype() {
        return Huidtype;
    }

    public void setHuidtype(Enum huidtype) {
        Huidtype = huidtype;
    }
    public abstract String maakGeluid();
}
