package luchthaven;

public class Economy extends Passagier{
    public Economy(String naam) {
        super(naam);
    }


    @Override
    public void geefSpecifiekeInfo() {
        System.out.println("Naam: " + this.getNaam() + ", Type: " + this.getClass().getSimpleName());
    }
}
