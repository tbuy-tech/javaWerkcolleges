package Som;

import java.util.Scanner;

public class Input {
    private int a;
    private int b;
    private Scanner x;


    public Input() {
        this.x = x = new Scanner(System.in);
        System.out.println("geef a: ");
        this.a = x.nextInt();
        System.out.println("geef b: ");
        this.b = x.nextInt();
    }

    public int getB() {
        return b;
    }

    public int getA() {
        return a;
    }
}
