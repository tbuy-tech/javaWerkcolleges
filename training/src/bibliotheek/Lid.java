package bibliotheek;

import java.util.ArrayList;

public class Lid {
    private  int id;
    private String naam;
    private String wachtwoord;


    public Lid(String naam, String wachtwoord) {
        this.naam = naam;
        this.id = hashCode();
        this.wachtwoord = wachtwoord;
    }

    public int getId() {
        return id;
    }

    public String getNaam() {
        return naam;
    }

    public String getWachtwoord() {
        return wachtwoord;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Lid lid = (Lid) o;

        if (id != lid.id) return false;
        return naam.equals(lid.naam);

    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + naam.hashCode();
        return result;
    }
}
