package WC3.oef1;

public class Hond extends Huisdier {
    private int stamboomnr;

    public Hond() {
        this.stamboomnr = 0000;
    }

    public Hond(double gewicht, int leeftijd, int poten, int registratienr, String naam, int stamboomnr) {
        super(gewicht, leeftijd, poten, registratienr, naam);
        this.stamboomnr = stamboomnr;
    }

    @Override
    public String toString() {
        return "Hond{" +
                super.toString() +
                "stamboomnr=" + stamboomnr +
                '}';
    }
}
