package Dierentuin;

public class Kat extends Zoogdier{

    public Kat(String naam, double lengte, String huidType) {
        super(naam, lengte, huidType);
    }

    @Override
    public void maakGeluid() {
        System.out.println("Miauw");
    }
}
