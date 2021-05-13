package Werkcollege1.oef4;
import java.lang.Math;
public class Auto {
    private double kilometerTeller;
    private double tankCapaciteit;
    private double tankInhoud;
    private double verbruik;

    //CONSTRUCTORS
    public Auto() {
        this.kilometerTeller = 0.0;
        this.tankCapaciteit = 55;
        this.tankInhoud = 0.0;
        this.verbruik = 8.3;
    }

    //GETTER
    public double getKilometerTeller() {
        return kilometerTeller;
    }

    public double getTankCapaciteit() {
        return tankCapaciteit;
    }

    public double getTankInhoud() {
        return tankInhoud;
    }

    public double getVerbruik() {
        return verbruik;
    }

    //SETTER
    public void setKilometerTeller(double kilometerTeller) {
        this.kilometerTeller = kilometerTeller;
    }

    public void setTankCapaciteit(double tankCapaciteit) {
        this.tankCapaciteit = tankCapaciteit;
    }

    public void setTankInhoud(double tankInhoud) {
        this.tankInhoud = tankInhoud;
    }

    public void setVerbruik(double verbruik) {
        this.verbruik = verbruik;
    }

    //METHODS
    public void vulTank() {
        this.tankInhoud = this.tankCapaciteit;
    }

    public double drive(double afstand) {
        if (this.tankInhoud - this.verbruik * (afstand / 100) >= 0) {
            this.kilometerTeller += Math.abs(afstand);
            this.tankInhoud -= this.verbruik * (afstand / 100);
            System.out.println("Gereden afstand: ");
            return afstand;
        } else {
            afstand = this.tankInhoud / (this.verbruik / 100);
            this.kilometerTeller += Math.abs(afstand);
            this.tankInhoud -= this.verbruik * (afstand / 100);
            System.out.println("Te weinig brandstof. Gereden afstand: ");
            return afstand;
        }
    }

    public void toPrint() {
        System.out.println("Kilometerteller: " + this.kilometerTeller + "km, tankinhoud: " + this.tankInhoud + "l , tankcapaciteit: " + this.tankCapaciteit + "l , verbruik: " + this.verbruik + "l/100km");
    }
}

