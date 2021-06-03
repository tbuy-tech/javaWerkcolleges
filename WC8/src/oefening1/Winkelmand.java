package oefening1;

import java.io.*;
import java.util.*;

public class Winkelmand implements Serializable {

    private static final long serialVersionUID = -6646398467440790234L;
    private ArrayList<Product> producten = new ArrayList<>();
    private File file = null;

    public ArrayList<Product> getProducten() {
        return producten;
    }

    public ArrayList<Product> geefProductenGesorteerdOpNummer() {
        Collections.sort(producten);
        return producten;
    }

    public ArrayList<Product> geefProductenGesorteerdOpNaam() {
        Collections.sort(producten, new CompareByName());
        return producten;
    }

    public TreeSet<Product> geefGesorteerdeUniekeProducten() {
        return new TreeSet<Product>(producten);
    }

    public void bewaar() {
        try(ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream("bestandje.bin"))) {
            objectOutputStream.writeObject(this);
        } catch (FileNotFoundException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }
}
