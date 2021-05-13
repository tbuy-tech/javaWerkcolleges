package WC3.oef1;

public class Huisdier extends Dier {
    private int registratienr;
    private String naam;

    public Huisdier() {
        super();
        this.registratienr = 0000;
        this.naam = "Unknown";
    }
    public Huisdier(double gewicht, int leeftijd, int poten, int registratienr, String naam) {
        super(gewicht, leeftijd, poten);
        this.registratienr = registratienr;
        this.naam = naam;
    }

    @Override
    public String toString() {
        return "Huisdier{" +
                super.toString() +
                "registratienr=" + registratienr +
                ", naam='" + naam + '\'' +
                '}';
    }
}
