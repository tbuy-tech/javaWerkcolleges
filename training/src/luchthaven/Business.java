package luchthaven;

import java.util.Set;
import java.util.TreeSet;

public class Business extends Passagier{

    Set<Waardebon> waardebonnen;
    public Business(String naam) {
        super(naam);
        waardebonnen = new TreeSet<>();
    }
    public void addWaardebon(Waardebon waardebon) {
        if (!waardebonnen.contains(waardebon)) {
            waardebonnen.add(waardebon);

        }
    }


    @Override
    public void geefSpecifiekeInfo() {
        System.out.println("Naam: " + this.getNaam() + ", Type: " + this.getClass().getSimpleName());
    }
}
