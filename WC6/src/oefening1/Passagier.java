package oefening1;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;


public abstract class Passagier {
    private String naam;
    private LocalDate opstartDatum;

    public Passagier(String naam ){
        this.naam = naam;
        this.opstartDatum = LocalDate.now();
    }

    public void geefSpecifiekeInfo() {
        System.out.println("Passagier: " + this.naam + ", " + this.opstartDatum);

    }

    @Override
    public String toString() {
        return "Naam='" + naam + "| ";
    }

    public String getNaam() {
        return naam;
    }
}
