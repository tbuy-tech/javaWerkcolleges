package WC3.oef3;

public class Administrateur extends Personeel {
    private String departement;

    public Administrateur(String voornaam, String achternaam, Kantoor kantoor, String departement) {
        super(voornaam, achternaam, kantoor);
        this.departement = departement;
    }

    public void kantoorUpdate(Personeel personeel, Kantoor kantoor) {
        personeel.setKantoor(kantoor);
    }
}
