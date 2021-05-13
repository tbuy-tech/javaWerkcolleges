package oefening2;
import java.util.Scanner;

public class Input {
    private int li;
    private int re;

    public Input() {
        Scanner input = new Scanner(System.in);
        System.out.println("first value: ");
        this.li = input.nextInt();
        System.out.println("first value: ");
        this.re = input.nextInt();
    }

    public int getLi() {
        return li;
    }

    public int getRe() {
        return re;
    }
}
