package boekenwinkel;

public class Fantasy extends Fictie implements Hardcover{
    public Fantasy(String titel) {
        super(titel);
    }

    @Override
    public int geefMeerPrijs() {
        return 0;
    }
}
