package voorbeeldexamen.model.entity;

import java.util.HashSet;
import java.util.Set;

public abstract class Spel extends Product {

    private String beschrijving;
    private Set<String> tags;
    public Spel(String naam, float prijs, String beschrijving) {
        super(naam, prijs);
        this.beschrijving = beschrijving;
        this.tags = new HashSet<>();
    }

    public Spel(int id, String naam, float prijs, String beschrijving) {
        super(id, naam, prijs);
        this.beschrijving = beschrijving;
        this.tags = new HashSet<>();
    }

    public String getBeschrijving() {
        return beschrijving;
    }

    public Set<String> getTags() {
        return tags;
    }
}
