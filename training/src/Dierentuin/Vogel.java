package Dierentuin;

public abstract class Vogel extends Gewerveld implements KanVliegen {
    public Vogel(String naam, double lengte, String huidType) {
        super(naam, lengte, huidType);
    }

    @Override
    public abstract void maakGeluid();

    @Override
    public String toString() {
        return super.toString();
    }
}
