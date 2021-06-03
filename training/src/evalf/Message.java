package evalf;

import java.time.LocalDate;
import java.util.Date;

public abstract class Message {

    private final LocalDate postDatum = LocalDate.now();
    private LocalDate geldigheid;
    private String bericht;

    public Message(LocalDate geldigheid, String bericht) {
        this.geldigheid = geldigheid;
        this.bericht = bericht;

    }

    public abstract void read();
}
