package videotheek;

import java.util.ArrayList;

public class VideotheekSingleton {
    private static VideotheekSingleton instance;
    private ArrayList<Klant> klanten;

    private VideotheekSingleton() {
        this.klanten  = new ArrayList<>();
    }

    public void add(Klant k) {

        klanten.add(k);
    }

    public static VideotheekSingleton getInstance() {
        if (instance == null) {
            instance = new  VideotheekSingleton();
        }
        return instance;
    }

    public ArrayList<Klant> getKlanten() {
        return klanten;
    }
}
