package oefening1;

public class Economy extends Passagier {
    public Economy(String naam) {
        super(naam);
    }

    @Override
    public void geefSpecifiekeInfo() {
        super.geefSpecifiekeInfo();
    }

    @Override
    public String toString() {
        return super.toString() + "| Klasse: " + getClass().getSimpleName() + "| ";
    }
}
