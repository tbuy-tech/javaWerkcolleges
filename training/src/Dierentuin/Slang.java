package Dierentuin;

public class Slang extends Reptiel {


    public Slang(String naam, double lengte, String huidType) {
        super(naam, lengte, huidType);
    }

    @Override
    public void maakGeluid() {
        System.out.println("SSSS");
    }
}
