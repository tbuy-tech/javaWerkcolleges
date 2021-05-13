package oefening1;

import java.util.ArrayList;
import java.util.List;

public class Winkelmand {
    List<Boek> boeken = new ArrayList<>();

    public boolean verwijderenUitMandje(Boek a) throws BoekNietInMandjeException {
        if (!boeken.contains(a)) {
            throw new BoekNietInMandjeException("Boek is niet in dit mandje");
        } else {
            boeken.remove(a);
            System.out.println("Boek " + a + " is verwijderd.");
        }
        return true;
    }

    public boolean gooiInMandje(Boek a) throws BoekAlInMandjeException {
        if (boeken.contains(a)) {
            throw new BoekAlInMandjeException("Boek is al in dit mandje");
        } else {
            boeken.add(a);
            System.out.println("Boek " + a + " is toegevoegd.");
        }
        return true;
    }

    @Override
    public String toString() {
        return "Winkelmand{" +
                "boeken=" + boeken +
                '}';
    }

    public List<Boek> getBoeken() {
        return boeken;
    }
}
