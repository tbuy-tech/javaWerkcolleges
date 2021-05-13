package oefening1;

import java.io.*;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Klant {
    private String naam;
    private Winkelmand winkelmand;
    private static List<Klant> klantenLijst = new ArrayList<>();

    public Klant(String naam) {
        this.naam = naam;
        this.winkelmand = new Winkelmand();
        klantenLijst.add(this);
    }

    @Override
    public String toString() {
        return "Klant{" +
                "naam='" + naam + '\'' +
                ", winkelmand=" + winkelmand.toString() +
                '}';
    }

    public static List<Klant> getKlantenLijst() {
        return klantenLijst;
    }

    public void bewaar() {

        File file = new File(new String("KlantenBestand.txt"));
        try {
            FileOutputStream path = new FileOutputStream(file);
            PrintStream output = new PrintStream(path);
            Iterator<Klant> iter = klantenLijst.iterator();
            while (iter.hasNext()) {
                Klant a = iter.next();
                output.println(a.toString());
            }
            output.close();

        }catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        catch (IOException e) {
            System.out.println("IOException");
        }
    }

    public Winkelmand getWinkelmand() {
        return winkelmand;
    }
}
