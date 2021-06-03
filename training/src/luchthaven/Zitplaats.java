package luchthaven;

public class Zitplaats {
    private String zitplaatsID;

    public Zitplaats(String zitplaatsID) {
        this.zitplaatsID = zitplaatsID;
    }

    @Override
    public String toString() {
        return "Zitplaats{" + zitplaatsID + "}";
    }
}
