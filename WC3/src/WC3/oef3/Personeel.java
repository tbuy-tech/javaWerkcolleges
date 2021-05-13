package WC3.oef3;

public class Personeel extends Persoon {
    protected Kantoor kantoor;

    public Personeel(String voornaam, String achternaam, Kantoor kantoor) {
        super(voornaam, achternaam);
        this.kantoor = kantoor;
    }

    public Kantoor getKantoor() {
        return kantoor;
    }

    public void setKantoor(Kantoor kantoor) {
        this.kantoor = kantoor;
    }

    @Override
    public String toString() {
        return "Personeel{" +
                super.toString() +
                "kantoor=" + kantoor.toString() +
                '}';
    }
}
