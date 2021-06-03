package Dierentuin;

public class Gans extends Vogel{

    public Gans(String naam, double lengte, String huidType) {
        super(naam, lengte, huidType);
    }

    @Override
    public void maakGeluid() {
        System.out.println("HOOONK");
    }

    @Override
    public void ikVlieg() {
        System.out.println("flap flap");
    }
}
