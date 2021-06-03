package Dierentuin;

public class Zalm extends Vis {

    public Zalm(String naam, double lengte, String huidType, int aantalVinnen) {
        super(naam, lengte, huidType, aantalVinnen);
    }

    @Override
    public void maakGeluid() {
        System.out.println("blub ik ben een vis");
    }

    @Override
    public void tijdOnderWater() {
        System.out.println("Ik leef continu onder water");
    }
}
