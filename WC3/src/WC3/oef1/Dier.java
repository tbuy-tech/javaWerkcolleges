package WC3.oef1;

public class Dier {
    private double gewicht;
    private int leeftijd;
    private int poten;

    public Dier() {
        this.gewicht = 5;
        this.leeftijd = 6;
        this.poten = 4;
    }
    public Dier(double gewicht, int leeftijd, int poten) {
        this.gewicht = gewicht;
        this.leeftijd = leeftijd;
        this.poten = poten;
    }

    @Override
    public String toString() {
        return "Dier{" +
                "gewicht=" + gewicht +
                ", leeftijd=" + leeftijd +
                ", poten=" + poten +
                '}';
    }
}
