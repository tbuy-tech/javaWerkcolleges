package oefening2;

import java.util.ArrayList;

public class Evalf {
    ArrayList<Message> berichten;

    public Evalf() {
        this.berichten = new ArrayList<Message>();
    }

    public void post(Message message) {
        berichten.add(message);
    }

    public void display() {
        for (Message bericht: this.berichten) {
            System.out.println(bericht.read());
        }
    }

}
