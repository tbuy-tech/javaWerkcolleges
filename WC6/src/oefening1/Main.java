package oefening1;

public class Main {
    public static void main(String[] args) {
        Passagier a = new Business("Tom");
        Passagier b = new Business("Tim");
        Passagier c = new Economy("Thomas");
        Vlucht beToNl = new Vlucht(200);
        try {
            beToNl.boarding(a);
            beToNl.boarding(b);
            beToNl.boarding(c);
            beToNl.boarding(a);

        } catch (PassagierReedsAanwezigException e) {
            System.out.println(e.getMessage());
        }
        System.out.println(beToNl.toString());
        beToNl.save();
    }

}
