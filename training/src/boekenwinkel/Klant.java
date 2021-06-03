package boekenwinkel;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.time.LocalDate;
import java.util.HashMap;
import java.util.Map;

public class Klant {

    private String naam;
    private Map<String, String> boodschappenMand;

    public Klant(String naam) {
        this.naam = naam;
        this.boodschappenMand = new HashMap<>();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Klant klant = (Klant) o;

        return naam.equals(klant.naam);
    }

    public void gooiInMandje(Boek b) throws AlInJeMandje {
        if (!boodschappenMand.containsKey(b.toString())){
            boodschappenMand.put(b.toString(), LocalDate.now().toString());
        } else {
            throw new AlInJeMandje();
        }

    }
    public void verwijderUitMandje(Boek b) throws BoekNietInMandje {
        if (boodschappenMand.containsKey(b.toString())){
            boodschappenMand.remove(b);
        } else {
            throw new BoekNietInMandje();
        }
    }

    public void bewaar() {
        File file = new File("training/src/files/klant.csv");
        try (PrintWriter output = new PrintWriter(file);){
            output.println(this.toString());
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }

    @Override
    public String toString() {
        return "Klant{" +
                "naam='" + naam + '\'' +
                ", boodschappenMand=" + boodschappenMand +
                '}';
    }
}
