package Dierentuin;

import java.util.ArrayList;
import java.util.Iterator;

public class Zoo {
    public static void main(String[] args) {
        ArrayList<Dier> dierenInDeZoo = new ArrayList<>();
        Dier tom = new Dolfijn("Tom", 12,"gladde huid");
        Dier dolfijnPiet = new Dolfijn("Piet", 12,"gladde huid");
        Dier katJan = new Kat("Jan", 30, "Vacht");
        katJan.maakGeluid();
        dierenInDeZoo.add(dolfijnPiet);
        dierenInDeZoo.add(katJan);
        dierenInDeZoo.add(tom);
        dierenInDeZoo.sort(Dier::compareTo);
        Iterator<Dier> iter = dierenInDeZoo.iterator();

        while (iter.hasNext()){
            System.out.println(iter.next().toString());

        }

    }
}
