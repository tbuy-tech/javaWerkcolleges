package voorbeeldexamen.model.entity;

public class Bordspel extends Spel {

    private int speelduur;


    public Bordspel(String naam, float prijs, String beschrijving, int speelduur) {
        super(naam, prijs, beschrijving);
        this.speelduur = speelduur;
    }

    public Bordspel( int id, String naam, float prijs, String beschrijving, int speelduur) {
        super(id, naam, prijs, beschrijving);
        this.speelduur = speelduur;
    }

    public int getSpeelduur() {
        return speelduur;
    }
}
