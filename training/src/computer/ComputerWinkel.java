package computer;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ComputerWinkel {

    List<Product> producten;

    public ComputerWinkel() {
        this.producten = new ArrayList<>();
    }

    public  void add(Product p){
        this.producten.add(p);
    }

    public void geefProductenGesorteerdOpNaam() {
        Collections.sort(this.producten, new SortOnName());

    }
    public void geefProductenGesorteerdOpNummer() {
        Collections.sort(this.producten, new SortOnNumber());

    }
}
