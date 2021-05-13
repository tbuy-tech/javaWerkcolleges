package Werkcollege1.oef3;

public class Regen {
    boolean hetRegent;


    public Regen(boolean hetRegent) {
        this.hetRegent = hetRegent;
    }
    //SETTER
    public void setHetRegent(boolean hetRegent) {
        this.hetRegent = hetRegent;
    }
    //GETTER
    public boolean GetHetRegent() {
        return hetRegent;
    }
    //METHODS
    public void regenInTon(int inhoud, int capaciteit, boolean looptover) {
        int regenVal = 1 + (int) (Math.random() * 10);
         inhoud += regenVal;
         if (inhoud > capaciteit) {
             looptover = true;
             inhoud = capaciteit;
         }
    }
}
