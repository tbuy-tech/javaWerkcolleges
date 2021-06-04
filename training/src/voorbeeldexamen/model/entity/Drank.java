package voorbeeldexamen.model.entity;

import java.time.LocalDate;

public class Drank extends Voedsel implements SpecialeContainer {
    public Drank(String naam, float prijs, LocalDate houdbaarheidsDatum) {
        super(naam, prijs, houdbaarheidsDatum);
    }

    @Override
    public void geefContainerlevel() {

    }
}
