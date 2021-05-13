package oefening2;

public class Som {
    private int li;
    private int re;
    final static int max = 50;
    final static int min = 10;


    public Som(int li, int re) {
        this.li = li;
        this.re = re;
    }

    public int bereken() throws BuitenException {
        int result = this.li + this.re;
        if (result >= max || result <= min) {
            throw new BuitenException("Niet tussen 10 en 50");
        }
        return result;
    }
}
