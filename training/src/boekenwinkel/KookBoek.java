package boekenwinkel;

public class KookBoek extends NonFictie implements Hardcover{

    public KookBoek(String titel) {
        super(titel);
    }

    @Override
    public int geefMeerPrijs() {
        return 0;
    }
}
