package oefening1;

import java.util.HashSet;
import java.util.Set;

public class VIP extends Passagier {

    private Set<Waardebon> bonnen = new HashSet<>();

    public VIP(String naam) {
        super(naam);
    }

    @Override
    public void geefSpecifiekeInfo() {
        super.geefSpecifiekeInfo();
    }

    @Override
    public String toString() {
        return super.toString() + "Klasse: " + getClass().getSimpleName() +
                "| Bonnen=" + bonnen + "| ";
    }
}
