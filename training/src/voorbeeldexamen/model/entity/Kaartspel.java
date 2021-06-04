package voorbeeldexamen.model.entity;

public class Kaartspel extends Spel implements SpecialeContainer {


    private enum type {
        FULL, BOOSTER, SINGLE
    };

    public Kaartspel(String naam, float prijs, String beschrijving, String type) {
        super(naam, prijs, beschrijving);
    }

    @Override
    public void geefContainerlevel() {

    }
}
