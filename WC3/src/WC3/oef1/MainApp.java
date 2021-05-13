package WC3.oef1;

import java.util.Scanner;

public class MainApp {
    public static void main(String[] args) {
        Hond a = new Hond(17.3, 9, 4, 2365, "Billie", 23432);
        System.out.println(a.toString());
        Hond b = new Hond();
        System.out.println(b.toString());
    }
}
