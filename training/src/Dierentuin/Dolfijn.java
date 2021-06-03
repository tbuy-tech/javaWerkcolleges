package Dierentuin;

public class Dolfijn extends Zoogdier implements OnderWater{


    public Dolfijn(String naam, double lengte, String huidType) {
        super(naam, lengte, huidType);
    }

    @Override
    public void tijdOnderWater() {
        System.out.println("Ik blijf 20min onder water;");
    }

    @Override
    public void maakGeluid() {
        System.out.println("IIIII");
    }
}
