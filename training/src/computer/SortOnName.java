package computer;

import java.util.Comparator;

public class SortOnName implements Comparator<Product> {

    public int compare(Product a, Product b) {
        return a.getNaam().compareTo(b.getNaam());
    }
}
