package WC3.oef3;

import org.w3c.dom.ls.LSOutput;

import java.util.ArrayList;
import java.util.Scanner;

public class MainApp {
    public static void addDocent(ArrayList docenten) {
        Scanner myObj = new Scanner(System.in);
        System.out.println("Geef voornaam: ");
        String voornaam = myObj.nextLine();
        System.out.println("Geef achternaam: ");
        String achternaam = myObj.nextLine();
        System.out.println("Geef straat: ");
        String straat = myObj.nextLine();
        System.out.println("Geef specialisatie: ");
        String spec = myObj.nextLine();
        System.out.println("Geef plaatsnaam: ");
        String plaatsnaam = myObj.nextLine();
        System.out.println("Geef huisnr: ");
        int huisnr = myObj.nextInt();
        System.out.println("Geef postcode: ");
        int postcode = myObj.nextInt();
        System.out.println("Geef gebouw: ");
        int gebouw = myObj.nextInt();
        System.out.println("Geef verdieping: ");
        int verdieping = myObj.nextInt();
        Adres adres = new Adres(straat, huisnr, 1, postcode, plaatsnaam);
        Kantoor kantoor = new Kantoor(adres, gebouw, verdieping);
        docenten.add(new Docent(voornaam, achternaam, kantoor, spec ));
    }
    public static void addStudent(ArrayList studenten) {
        Scanner myObj = new Scanner(System.in);
        System.out.println("Geef voornaam: ");
        String voornaam = myObj.nextLine();
        System.out.println("Geef achternaam: ");
        String achternaam = myObj.nextLine();
        System.out.println("Geef specialisatie: ");
        String spec = myObj.nextLine();
        System.out.println("Geef studentennummer: ");
        int studentnr = myObj.nextInt();
        studenten.add(new Student(voornaam, achternaam, studentnr, spec ));
    }
    public static void addAdmin(ArrayList administrateur) {
        Scanner myObj = new Scanner(System.in);
        System.out.println("Geef voornaam: ");
        String voornaam = myObj.nextLine();
        System.out.println("Geef achternaam: ");
        String achternaam = myObj.nextLine();
        System.out.println("Geef straat: ");
        String straat = myObj.nextLine();
        System.out.println("Geef departement: ");
        String departement = myObj.nextLine();
        System.out.println("Geef plaatsnaam: ");
        String plaatsnaam = myObj.nextLine();
        System.out.println("Geef huisnr: ");
        int huisnr = myObj.nextInt();
        System.out.println("Geef postcode: ");
        int postcode = myObj.nextInt();
        System.out.println("Geef gebouw: ");
        int gebouw = myObj.nextInt();
        System.out.println("Geef verdieping: ");
        int verdieping = myObj.nextInt();
        Adres adres = new Adres(straat, huisnr, 1, postcode, plaatsnaam);
        Kantoor kantoor = new Kantoor(adres, gebouw, verdieping);
        administrateur.add(new Administrateur(voornaam, achternaam, kantoor, departement ));
    }
    public static void main(String[] args) {
        String mainMenu = "Maak een keuze:\n\n1) Voeg persoon toe\n2) Verwijder Persoon\n3) Toon alles en stop.";
        String subMenu = "Maak een keuze:\n\n1) Docent\n2) Student\n 3) Administrateur";
        ArrayList<Docent>  docenten = new ArrayList<Docent>();
        ArrayList<Student>  studenten = new ArrayList<Student>();
        ArrayList<Administrateur>  admins = new ArrayList<Administrateur>();
        boolean adminGo = true;
        while (adminGo) {
            System.out.println("Welkom in de administratie.");
            System.out.println(mainMenu);
            Scanner myObj = new Scanner(System.in);  // Create a Scanner object
            int keuze = myObj.nextInt();  // Read user input
            switch (keuze) {
                case 1:
                    System.out.println(subMenu);
                    keuze = myObj.nextInt();  // Read user input
                    switch (keuze) {
                        case 1:
                            addDocent(docenten);
                            break;
                        case 2:
                            addStudent(studenten);
                            break;
                        case 3:
                            addAdmin(admins);
                            break;
                    }
                    break;
                case 2:
                    System.out.println(subMenu);
                    keuze = myObj.nextInt();  // Read user input
                    switch (keuze) {
                        case 1:

                            break;
                        case 2:

                            break;
                        case 3:

                    }
                    break;
                case 3:
                    showAlles(docenten, admins, studenten);
                    adminGo = false;
                    System.out.println("Bye");
            }
        }
    }

    private static void showAlles(ArrayList<Docent> docenten, ArrayList<Administrateur> admins, ArrayList<Student> studenten) {
        System.out.println("Docenten: ");
        for (Docent docent: docenten
             ) {
            System.out.println( docent.toString());
        }
        System.out.println("Admins: ");
        for (Administrateur admin: admins
        ) {
            System.out.println(admin.toString());
        }
        System.out.println("Studenten: ");
        for (Student student: studenten
        ) {
            System.out.println(student.toString());
        }
    }

}

