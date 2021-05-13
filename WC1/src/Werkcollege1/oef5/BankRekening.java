package Werkcollege1.oef5;

public class BankRekening {
    private double bedrag;

    //CONSTRUCTORS
    public BankRekening() {
        this.bedrag = 0.0;
    }
    public BankRekening(double bedrag) {
        this.bedrag = bedrag;
    }
    //GETTER

    public double getBedrag() {
        return bedrag;
    }
    //SETTER

    public void setBedrag(double bedrag) {
        if (bedrag < 0) {
            this.bedrag = 0.0;
        }
        this.bedrag = bedrag;
    }
    //METHOD
    public void stortGeld(double som) {
        this.bedrag += som;
    }
    public void haalGeldAf(double som) {
        if (this.bedrag - som < -1000) {
            System.out.println("Te weinig geld, u mag niet meer als 1000€ negatief gaan.");
        } else {
            this.bedrag -= som;
        }
    }
    public void toonGegevens(){
        System.out.println("Huidig saldo: " + this.bedrag);

    }
}
