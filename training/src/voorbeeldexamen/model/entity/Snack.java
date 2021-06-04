package voorbeeldexamen.model.entity;

import java.time.LocalDate;

public class Snack extends Voedsel {
    public Snack(String naam, float prijs, LocalDate houdbaarheidsDatum) {
        super(naam, prijs, houdbaarheidsDatum);
    }
}
