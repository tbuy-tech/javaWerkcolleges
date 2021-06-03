package boekenwinkel;

public class AlInJeMandje extends Exception {
    public AlInJeMandje() {
        super("Dit boek bevindt zich reeds in uw mandje.");
    }
}
