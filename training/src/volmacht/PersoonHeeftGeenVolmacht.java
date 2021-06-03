package volmacht;

public class PersoonHeeftGeenVolmacht extends Exception {
    public PersoonHeeftGeenVolmacht() {
        super("Deze persoon heeft geen volmacht.");
    }
}
