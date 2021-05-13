package WC3.oef2;

public class Student extends Persoon{
    private int studentnr = 0;
    private String specialisatie ="unknown";



    public Student(String voornaam, String achternaam, int studentnr, String specialisatie) {
        super(voornaam, achternaam);
        this.studentnr = studentnr;
        this.specialisatie = specialisatie;
    }

    public Student() {
        super();
        this.studentnr = this.studentnr;
        this.specialisatie = this.specialisatie;
    }

    @Override
    public String toString() {
        return "Student{" +
                super.toString() +
                "studentnr=" + studentnr +
                ", specialisatie='" + specialisatie + '\'' +
                '}';
    }
}
