package volmacht;



public class Persoon {

    private static int aantal = 0;
    private String voornaam;
    private String achternaam;
    private String telefoon;


    public Persoon(String voornaam, String achternaam) {
        aantal++;
        this.voornaam = voornaam;
        this.achternaam = achternaam;
    }

    public String getVoornaam() {
        return voornaam;
    }

    public void setVoornaam(String voornaam) {
        this.voornaam = voornaam;
    }

    public String getAchternaam() {
        return achternaam;
    }

    public void setAchternaam(String achternaam) {
        this.achternaam = achternaam;
    }

    public String getTelefoon() {
        return telefoon;
    }

    public void setTelefoon(String telefoon) {
        this.telefoon = telefoon;
    }



    public static int getAantal() {
        return aantal;
    }


}
