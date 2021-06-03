package luchthaven;

import java.io.*;
import java.util.*;

public class Vlucht {
    private final int idNummer;
    List<String> zitplaatsen;
    private final int aantalZitplaatsen;
    private int aantalInzittenden = 0;
    Map<String, String> zitplaatsGegevens;

    public Vlucht(int aantalZitplaatsen) {
        this.idNummer = hashCode();
        this.zitplaatsen = new ArrayList<>();
        this.aantalZitplaatsen = aantalZitplaatsen;
        maakZitplaatsenAan();
        this.zitplaatsGegevens = new TreeMap<>();
    }

    private void maakZitplaatsenAan() {
        if (aantalZitplaatsen >= 40) {
            int rest = aantalZitplaatsen%4;

            for (int j = 0; j < this.aantalZitplaatsen/4; j++ ){
                zitplaatsen.add((new Zitplaats("A" + Integer.toString(j)).toString()));
            }
            for (int j = 0; j < this.aantalZitplaatsen/4; j++ ){
                zitplaatsen.add((new Zitplaats("B" + Integer.toString(j))).toString());
            }
            for (int j = 0; j < this.aantalZitplaatsen/4; j++ ){
                zitplaatsen.add((new Zitplaats("C" + Integer.toString(j))).toString());
            }
            for (int j = 0; j < this.aantalZitplaatsen/4; j++ ){
                zitplaatsen.add((new Zitplaats("D" + Integer.toString(j))).toString());
            }
            for (int j = 0; j < rest; j++ ){
                zitplaatsen.add((new Zitplaats("F" + Integer.toString(j))).toString());
            }

        }
        if (aantalZitplaatsen < 40) {
            int rest = aantalZitplaatsen%2;
            for (int j = 0; j < this.aantalZitplaatsen/2; j++ ){
                zitplaatsen.add((new Zitplaats("A" + Integer.toString(j))).toString());
            }
            for (int j = 0; j < this.aantalZitplaatsen/2; j++ ){
                zitplaatsen.add((new Zitplaats("B" + Integer.toString(j))).toString());
            }
            for (int j = 0; j < rest; j++ ){
                zitplaatsen.add((new Zitplaats("C" + Integer.toString(j))).toString());
            }
        }
    }

    public void boarding(Passagier p) throws PassagierReedsAanwezig {
        if (!zitplaatsGegevens.containsKey(p.toString())) {

            zitplaatsGegevens.put(p.toString(), zitplaatsen.get(aantalInzittenden));
            System.out.println(p.getNaam() + " toegevoegd.");
            aantalInzittenden++;
        } else {
            throw new PassagierReedsAanwezig();
        }
    }

    public void zoek(Passagier p) throws PassagierNietAanwezig {
        if (zitplaatsGegevens.containsKey(p.toString())) {
            System.out.println("Passagier: " + p.toString() + " is aan boord op plaats " +  zitplaatsGegevens.get(p.toString()));
        } else {
            throw new PassagierNietAanwezig();
        }
    }

    public void save()  {
        try (PrintWriter printWriter = new PrintWriter("training/src/files/" + idNummer + ".csv") ){
            Iterator<String> iter = zitplaatsGegevens.keySet().iterator();
            while (iter.hasNext()){
                String p = iter.next();
                printWriter.println(p + " - " + zitplaatsGegevens.get(p));
            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Vlucht vlucht = (Vlucht) o;

        return idNummer == vlucht.idNummer;
    }

    @Override
    public int hashCode() {
        int result = idNummer;
        result = 31 * result + (zitplaatsen != null ? zitplaatsen.hashCode() : 0);
        result = 31 * result + aantalZitplaatsen;
        result = 31 * result + (zitplaatsGegevens != null ? zitplaatsGegevens.hashCode() : 0);
        return result;
    }
}
