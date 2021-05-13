package oefening1;

public class Boorspons extends Spons implements Waterdier{

    @Override
    public String maakGeluid() {
        return "pfffrrrtt";
    }

    @Override
    public void tijdOnderWater() {
        System.out.println("ik kan 5min onder water blijven.");
    }
}
