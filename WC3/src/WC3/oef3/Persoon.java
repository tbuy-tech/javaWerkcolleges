package WC3.oef3;


public class Persoon {
    private String voornaam;
    private String achternaam;
    private int telefoon;
    private WC3.oef3.Adres Adres;

    public Persoon(String voornaam) {
        this.voornaam = voornaam;
    }

    public Persoon(String voornaam, String achternaam) {
        this.voornaam = voornaam;
        this.achternaam = achternaam;
        this.telefoon = telefoon;
    }

    public String getVoornaam() {
        return voornaam;
    }

    public String getAchternaam() {
        return achternaam;
    }

    public int getTelefoon() {
        return telefoon;
    }

    public WC3.oef3.Adres getAdres() {
        return Adres;
    }

    public void setVoornaam(String voornaam) {
        this.voornaam = voornaam;
    }

    public void setAchternaam(String achternaam) {
        this.achternaam = achternaam;
    }

    public void setTelefoon(int telefoon) {
        this.telefoon = telefoon;
    }

    public void setAdres(WC3.oef3.Adres adres) {
        Adres = adres;
    }

    //METHODS


    @Override
    public String toString() {
        return "Persoon{" +
                "voornaam='" + voornaam + '\'' +
                ", achternaam='" + achternaam + '\'' +
                ", telefoon=" + telefoon +
                ", Adres=" + Adres.toString() +
                '}';
    }
}
