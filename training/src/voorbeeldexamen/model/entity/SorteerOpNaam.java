package voorbeeldexamen.model.entity;

import java.util.Comparator;

public class SorteerOpNaam implements Comparator<Product> {
    @Override
    public int compare(Product o1, Product o2) {
        return o1.getNaam().compareTo(o2.getNaam());
    }
}
