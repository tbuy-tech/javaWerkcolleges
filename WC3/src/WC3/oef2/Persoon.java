package WC3.oef2;


public class Persoon {
    private String voornaam = "unknown";
    private String achternaam = "unknown";
    private int telefoon = 00;
    private Adres Adres;

    public Persoon() {
    }

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

    public Adres getAdres() {
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

    public void setAdres(Adres adres) {
        Adres = adres;
    }

    //METHODS
    public String toString() {
        return this.voornaam + " " + this.achternaam + ", " + this.telefoon + ", " + Adres.toString();
    }


}
