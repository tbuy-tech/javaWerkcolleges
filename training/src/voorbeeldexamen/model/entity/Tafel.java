package voorbeeldexamen.model.entity;

import java.io.BufferedOutputStream;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDate;
import java.util.Map;
import java.util.TreeMap;
import java.util.TreeSet;

public class Tafel {

    //Buiten dit id hebben tafels ook een naam en een bestelling. Elke bestelling is een lijst van Producten
    //die automatisch gesorteerd is op id en gekoppeld wordt aan een aantal (Integer). Zorg ervoor dat
    //sorteren op id de natuurlijke manier van ordenen is voor alle Producten.

    private final int id;
    private int aantalTafels = 0;
    private String naam;
    private TreeMap<Product,Integer> bestellingen;

    public Tafel(String naam) {
        this.id = aantalTafels;
        this.naam = naam;
        this.bestellingen = new TreeMap<>();
        aantalTafels++;
    }

    public void voegProductToe(Product p) throws VervallenException {
        if (p instanceof Voedsel && ((Voedsel) p).getHoudbaarheidsDatum().isBefore(LocalDate.now())) {
            throw new VervallenException("Dit product is vervallen");
        }
        if (bestellingen.containsKey(p)) {
            int value = bestellingen.get(p);
            value++;
            bestellingen.put(p, value);
        } else {
            bestellingen.put(p, 1);
        }

    }

    public int getId() {
        return id;
    }

    public int getAantalTafels() {
        return aantalTafels;
    }

    public String getNaam() {
        return naam;
    }

    public TreeMap<Product, Integer> getBestellingen() {
        return bestellingen;
    }

    public TreeSet<Product> geefProductenOpNaam() {
        TreeSet<Product> bestellingenOpNaam = new TreeSet<>(new SorteerOpNaam());
        bestellingenOpNaam.addAll(bestellingen.keySet());

        return bestellingenOpNaam;
    }

    public void bewaar() {
        Thread thread1 = new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    FileWriter writer = new FileWriter("training/files/" + getNaam() + ".txt");
                    BufferedWriter buffWrite = new BufferedWriter(writer);
                    float totaalPrijs =0;

                    for (Map.Entry<Product, Integer> entry: bestellingen.entrySet()) {
                            totaalPrijs += entry.getValue() * entry.getKey().getPrijs();
                            buffWrite.write( "<" + entry.getKey().getClass() + "><" + entry.getKey().getNaam() + "><" + entry.getKey().getPrijs() + ">€ :<" + entry.getValue() + ">" );
                            buffWrite.newLine();
                    }
                    buffWrite.write("Eindtotaal: " + totaalPrijs);

                    buffWrite.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        });

    }

    public String bestellingToString() {
        String st = "";
        float totaalPrijs =0;

        for (Map.Entry<Product, Integer> entry: bestellingen.entrySet()) {
            st += "<" + entry.getKey().getClass().getSimpleName() + "><" + entry.getKey().getNaam() + "><" + entry.getKey().getPrijs() + ">€ :<" + entry.getValue() + ">" ;
            st += "\r\n";
            totaalPrijs += entry.getValue() * entry.getKey().getPrijs();
        }
        st += "Eindtotaal: " + totaalPrijs;
        return st;
    }
}
