package oefening1;

import java.util.HashSet;
import java.util.Set;

public class Business extends Passagier {

    private Set<Waardebon> bonnen = new HashSet<>();
    public Business(String naam) {
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
