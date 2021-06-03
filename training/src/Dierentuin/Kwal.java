package Dierentuin;

public class Kwal extends Holtedier{

    public Kwal(String naam, String Kleur, int diameter) {
        super(naam, Kleur, diameter);
    }

    @Override
    public void maakGeluid() {
        System.out.println("...");
    }

    @Override
    public void tijdOnderWater() {
        System.out.println("Ik leef continu onder water");
    }
}
