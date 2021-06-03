package luchthaven;

public class PassagierNietAanwezig extends Exception {
    public PassagierNietAanwezig() {
        super("Deze Passagier is niet aanwezig.");
    }
}
