package Werkcollege1.oef4;

public class Main {
    public static void main(String[] args) {
        Auto nissan = new Auto();
        nissan.toPrint();
        nissan.vulTank();
        nissan.toPrint();
        System.out.println(nissan.drive(700) + "km");
        nissan.toPrint();
        nissan.vulTank();
        nissan.toPrint();
        System.out.println(nissan.drive(400) + "km");
        nissan.toPrint();
        System.out.println(nissan.drive(123) + "km");
        nissan.toPrint();
    }
}
