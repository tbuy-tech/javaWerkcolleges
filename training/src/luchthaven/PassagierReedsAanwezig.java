package luchthaven;

public class PassagierReedsAanwezig extends Exception {
    public PassagierReedsAanwezig() {
        super("Deze passagier is reeds aan boord.");
    }
}
