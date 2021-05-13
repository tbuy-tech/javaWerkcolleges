package Werkcollege1.oef1;

public class Main {
    public static void main(String[] args) {
        Cirkel a = new Cirkel();
        a.setKleur("rood");
        a.setStraal(3.5);
        System.out.println(a.geefOmtrek());
        System.out.println(a.toString());
    }

}
