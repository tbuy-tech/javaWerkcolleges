package oefening1;

public class KookBoek extends NonFictie implements Hardcover {
    public KookBoek(String titel) {
        super(titel);
    }

    @Override
    public int compareTo(Boek o) {
        return super.compareTo(o);
    }

    @Override
    public double geefMeerPrijs() {
        return 0;
    }
}
