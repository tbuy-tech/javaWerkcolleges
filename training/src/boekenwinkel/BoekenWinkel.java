package boekenwinkel;

import java.util.*;

public class BoekenWinkel {
    private List<Boek> boeken;
    private int aantalBoeken;
    private Set<Klant> klanten;

    public BoekenWinkel() {
        this.boeken = new ArrayList<>();
        this.aantalBoeken = this.boeken.size();
        this.klanten = new TreeSet<>();
    }

    public void add(Boek b){
        boeken.add(b);
    }

    public void remove(Boek b){
        boeken.remove(b);
    }

    public void displayBooks() {
        Iterator<Boek> iter = boeken.iterator();
        while (iter.hasNext()) {
            System.out.println(iter.next().toString());
        }
    }



    public static void main(String[] args)  {
        BoekenWinkel boekenWinkel = new BoekenWinkel();
        Boek lotr = new Fantasy("Lord of the rings");
        Boek orient = new Detective("Murder on the orient express");
        Boek appeltaarten = new KookBoek("Appeltaarten for dummies");
        boekenWinkel.add(lotr);
        boekenWinkel.add(orient);
        boekenWinkel.add(appeltaarten);
        boekenWinkel.displayBooks();
        Klant piet = new Klant("Piet");
        try {
            piet.gooiInMandje(lotr);
            piet.gooiInMandje(orient);
            piet.gooiInMandje(appeltaarten);
        } catch (AlInJeMandje alInJeMandje) {
            alInJeMandje.printStackTrace();
        }

        piet.bewaar();

    }


}


