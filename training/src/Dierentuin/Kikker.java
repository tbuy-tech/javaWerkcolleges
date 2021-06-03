package Dierentuin;

public class Kikker extends Amfibie{

    public Kikker(String naam, double lengte, String huidType) {
        super(naam, lengte, huidType);
    }

    @Override
    public void maakGeluid() {
        System.out.println("Kwaaak kwak");
    }
}
