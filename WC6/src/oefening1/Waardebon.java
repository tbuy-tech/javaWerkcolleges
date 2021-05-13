package oefening1;

public class Waardebon {
    private int idNummer;
    private ConsumptieType consumptieType;
    private static int bonAantal = 0;

    public Waardebon(ConsumptieType consumptieType) {
        this.bonAantal++;
        this.idNummer = this.bonAantal;
        this.consumptieType = consumptieType;
    }
}
