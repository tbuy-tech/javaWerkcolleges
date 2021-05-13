package WC3.oef2;

import java.util.ArrayList;

public class Docent extends Personeel {
    private String specialisatie;
    private ArrayList<Student> studenten;

    public Docent(String voornaam, String achternaam, Kantoor kantoor, String specialisatie, ArrayList<Student> studenten) {
        super(voornaam, achternaam, kantoor);
        this.specialisatie = specialisatie;
        this.studenten = studenten;
    }

//METHODES
    
    public void teaches(Student student) {
        studenten.add(student);
    }

    public String getSpecialisatie() {
        return specialisatie;
    }

    public Kantoor getKantoor() {
        return kantoor;
    }

    public ArrayList<Student> getStudenten() {
        return studenten;
    }

    public void setSpecialisatie(String specialisatie) {
        this.specialisatie = specialisatie;
    }

    public void setKantoor(Kantoor kantoor) {
        this.kantoor = kantoor;
    }

    public void setStudenten(ArrayList<Student> studenten) {
        this.studenten = studenten;
    }
}
