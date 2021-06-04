package voorbeeldexamen.model.entity;

import java.time.LocalDate;

public abstract class Voedsel extends Product {

    private LocalDate houdbaarheidsDatum;

    public Voedsel(String naam, float prijs, LocalDate houdbaarheidsDatum) {
        super(naam, prijs);
        this.houdbaarheidsDatum = houdbaarheidsDatum;
    }

    public LocalDate getHoudbaarheidsDatum() {
        return houdbaarheidsDatum;
    }
}
