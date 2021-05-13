package oefening1;

import java.io.*;
import java.text.Format;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Vlucht {
    private int passagierAantal = 0;
    private static int aantalVluchten = 0;
    private final int idNummer = aantalVluchten;
    private int maxAantalZitplaatsen;
    private Map<Passagier, Integer> zitplaatsen;

    public Vlucht(int maxAantalZitplaatsen) {
        aantalVluchten++;
        this.maxAantalZitplaatsen = maxAantalZitplaatsen;
        this.zitplaatsen = new HashMap<Passagier, Integer>();
    }

    public void boarding(Passagier a) throws PassagierReedsAanwezigException {
        if (zitplaatsen.containsKey(a)) {

            throw new PassagierReedsAanwezigException("error");
        }
        if (this.passagierAantal <= maxAantalZitplaatsen) {
            this.passagierAantal++;
            zitplaatsen.put(a, this.passagierAantal);
        }
    }
    public boolean save() {
        String filename = this.idNummer + ".csv";

        try {
            File file = new File(filename);
            if (file.createNewFile()) {
                System.out.println("New file: " + filename + " created.");

                FileOutputStream path = new FileOutputStream(filename);
                PrintStream output = new PrintStream(path);
                Iterator<Passagier> iter = zitplaatsen.keySet().iterator();
                while (iter.hasNext()){
                    Passagier p = iter.next();
                    output.println(p);
                }
                output.close();
            }
        } catch (IOException e) {
            e.printStackTrace();
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Vlucht{" +
                "passagierAantal=" + passagierAantal +
                ", idNummer=" + idNummer +
                ", maxAantalZitplaatsen=" + maxAantalZitplaatsen +
                ", zitplaats=" + zitplaatsen.toString() + " }";
    }
}
