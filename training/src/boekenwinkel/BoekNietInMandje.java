package boekenwinkel;

public class BoekNietInMandje extends Exception {
    public BoekNietInMandje() {
        super("Dit boek zit niet in uw mandje.");
    }
}
