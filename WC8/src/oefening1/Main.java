package oefening1;

import oefening1.Product;
import oefening1.Winkelmand;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Winkelmand winkelmand = new Winkelmand();
        winkelmand.getProducten().add(new Product("bal", 5));
        winkelmand.getProducten().add(new Product("pot", 2));
        winkelmand.getProducten().add(new Product("kom", 10));
        winkelmand.getProducten().add(new Product("borstel", 3));
        Winkelmand winkelmand2 = winkelmand;

        winkelmand.geefProductenGesorteerdOpNummer();
        winkelmand2.geefProductenGesorteerdOpNaam();
        winkelmand.bewaar();


    }
}
