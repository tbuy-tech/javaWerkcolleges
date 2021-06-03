package volmacht;

public class Main {
    public static void main(String[] args) {
        VolmachtHebber a = new VolmachtHebber("Piet", "Snot");
        VolmachtHebber b = new VolmachtHebber("Tom", "Dujardin");
        VolmachtHebber c = new VolmachtHebber("Tim", "Jardin");
        UniverseleRekening uni = new UniverseleRekening();
        uni.toevoegenVolmacht(a);
        uni.toevoegenVolmacht(b);
        try {
            uni.haalGeldAf(a);
            uni.haalGeldAf(b);
        } catch (PersoonHeeftGeenVolmacht persoonHeeftGeenVolmacht) {
            System.out.println(persoonHeeftGeenVolmacht.getMessage());
        }
        try {
            uni.haalGeldAf(c);
        } catch (PersoonHeeftGeenVolmacht persoonHeeftGeenVolmacht) {
            System.out.println(persoonHeeftGeenVolmacht.getMessage());
        }

    }
}
