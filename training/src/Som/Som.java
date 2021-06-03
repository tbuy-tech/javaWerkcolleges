package Som;

public class Som {
    private int a;
    private int b;
    private int result;

    public Som(int a, int b) {
        this.a = a;
        this.b = b;
    }

    public int som() {

        try {
            result = a + b;
            if (result > 20) {
                throw new Overloop("Te hoog");
            }
            if (result < 2) {
                throw new Onderloop("Te laag");
            }
        } catch (Overloop o) {
            System.out.println("Overloop => " + o.getMessage());
        } catch (Onderloop o) {
            System.out.println("Overloop => " + o.getMessage());
        }
        return result;
    }
}
