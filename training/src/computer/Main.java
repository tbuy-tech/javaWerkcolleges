package computer;

import java.util.Iterator;

public class Main {
    public static void main(String[] args) {
        ComputerWinkel a = new ComputerWinkel();
        Product b = new Product("Harde schijf");
        Product c = new Product("Moederbord");
        Product d = new Product("RAM");
        Product e = new Product("Lenovo laptop");
        a.add(b);
        a.add(c);
        a.add(d);
        a.add(e);

        a.geefProductenGesorteerdOpNaam();
        Iterator<Product> iter = a.producten.iterator();
        while (iter.hasNext()){
            System.out.println(iter.next().toString());
        }
        a.geefProductenGesorteerdOpNummer();
        Iterator<Product> iterr = a.producten.iterator();
        while (iterr.hasNext()){
            System.out.println(iterr.next().toString());
        }

    }
}
