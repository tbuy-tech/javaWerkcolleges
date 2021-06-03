package luchthaven;

public class Main {
    public static void main(String[] args) {
        Vlucht a = new Vlucht(40);
        Economy x = new Economy("Piet");
        Business y = new Business("Tom");
        VIP z = new VIP("Yves");
        Economy e = new Economy("Marie");
        Economy r = new Economy("Thomas");
        Business t = new Business("Jan");
        try {
            a.boarding(x);
            a.boarding(y);
            a.boarding(z);
            a.boarding(e);
            a.boarding(r);
            a.boarding(t);
        } catch (PassagierReedsAanwezig passagierReedsAanwezig) {
            passagierReedsAanwezig.printStackTrace();
        }

        a.save();
        try {
            a.zoek(z);
        } catch (PassagierNietAanwezig passagierNietAanwezig) {
            passagierNietAanwezig.printStackTrace();
        }

        for (String zitplaats: a.zitplaatsen
             ) {
            System.out.println(zitplaats);
        }

    }
}
