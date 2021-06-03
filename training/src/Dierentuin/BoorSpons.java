package Dierentuin;

public class BoorSpons extends Spons {

    public BoorSpons(String naam, String Kleur) {
        super(naam, Kleur);
    }

    @Override
    public void maakGeluid() {
        System.out.println("blub blub");
    }

    @Override
    public void tijdOnderWater() {
        System.out.println("Ik leef continu onder water");
    }
}
