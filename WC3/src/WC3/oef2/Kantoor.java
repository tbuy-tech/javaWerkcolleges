package WC3.oef2;

public class Kantoor {
    private Adres adres;
    private  int gebouw;
    private  int verdieping;

    public Kantoor(Adres adres, int gebouw, int verdieping) {
        this.adres = adres;
        this.gebouw = gebouw;
        this.verdieping = verdieping;
    }

    public Adres getAdres() {
        return adres;
    }

    public int getGebouw() {
        return gebouw;
    }

    public int getVerdieping() {
        return verdieping;
    }

    public void setAdres(Adres adres) {
        this.adres = adres;
    }

    public void setGebouw(int gebouw) {
        this.gebouw = gebouw;
    }

    public void setVerdieping(int verdieping) {
        this.verdieping = verdieping;
    }
}
