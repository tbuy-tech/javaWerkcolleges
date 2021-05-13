package oefening1;

import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Klant a = new Klant("Thomas");
        Klant b = new Klant("Thom");
        Klant c = new Klant("Thoma");
        Klant d = new Klant("mas");
        Klant e = new Klant("as");
        Boek een = new Fantasy("Harry Potter");
        Boek twee = new Detective("Death in a Corner");
        Boek drie = new Biografie("Winston Churchill's life");
        Boek vier = new KookBoek("koken met look");
        Boek vijf = new KookBoek("koken met look");
        try {
            a.getWinkelmand().gooiInMandje(een);
            a.getWinkelmand().gooiInMandje(twee);
            a.getWinkelmand().gooiInMandje(drie);
            a.getWinkelmand().gooiInMandje(vier);
            a.getWinkelmand().gooiInMandje(vijf);
        } catch (BoekAlInMandjeException boekAlInMandjeException) {
            System.out.println(boekAlInMandjeException.getMessage());
        }
        System.out.println(Klant.getKlantenLijst());
        Collections.sort(a.getWinkelmand().boeken);
        System.out.println("Boeken van Thomas: ");
        for (Boek boek:a.getWinkelmand().boeken) {
            System.out.println(boek.getTitel() + " - " + boek.getIsbn());
        }
        Iterator<Boek> iter = a.getWinkelmand().boeken.iterator();
        while (iter.hasNext()){
            if (iter.next().equals(iter)) {
                System.out.println("same");
            } else {
                System.out.println("Not same");
            }

        }
        a.bewaar();
    }
}
