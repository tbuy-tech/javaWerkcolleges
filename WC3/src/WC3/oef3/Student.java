package WC3.oef3;

public class Student extends Persoon {
    private int studentnr;
    private String specialisatie;

    public Student(String voornaam, String achternaam, int studentnr, String specialisatie) {
        super(voornaam, achternaam);
        this.studentnr = studentnr;
        this.specialisatie = specialisatie;
    }
}
