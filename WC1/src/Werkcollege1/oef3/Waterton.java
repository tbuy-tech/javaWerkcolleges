package Werkcollege1.oef3;

public class Waterton {
    private int capaciteit;
    private int inhoud;

    public Waterton(int capaciteit) {
        this.inhoud = 0;
        this.capaciteit = capaciteit;
    }
    public Waterton(int capaciteit, int inhoud) {
        this.inhoud = inhoud;
        this.capaciteit = capaciteit;
    }

    public int getCapaciteit() {
        return capaciteit;
    }

    public int getInhoud() {
        return inhoud;
    }

    public void setCapaciteit(int capaciteit) {
        this.capaciteit = capaciteit;
    }

    public void setInhoud(int inhoud) {
        this.inhoud = inhoud;
    }
    //METHODS

    public void aftappen(int afgetapt) {
        if (this.inhoud >= afgetapt) {
            this.inhoud -= afgetapt;
        } else {
            impossible();
        }

    }
    public void impossible() {
        System.out.println("Onvoldoende water in de waterton");
    }
}
