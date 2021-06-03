package Dierentuin;

public class Vleermuis extends Zoogdier implements KanVliegen{


    public Vleermuis(String naam, double lengte, String huidType) {
        super(naam, lengte, huidType);
    }

    @Override
    public void maakGeluid() {
        System.out.println("Sonar sounds");
    }

    @Override
    public void ikVlieg() {
        System.out.println("flap flap");
    }
}
