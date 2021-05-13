package oefening1;

public class Fantasy extends Fictie implements Hardcover {
    public Fantasy(String titel) {
        super(titel);
    }

    @Override
    public double geefMeerPrijs() {
        return 0;
    }

    @Override
    public int compareTo(Boek o) {

        return super.compareTo(o);
    }
}
