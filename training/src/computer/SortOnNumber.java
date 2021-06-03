package computer;

import java.util.Comparator;

public class SortOnNumber implements Comparator<Product> {
    @Override
    public int compare(Product o1, Product o2) {
        return o1.getCode() - o2.getCode();
    }
}
