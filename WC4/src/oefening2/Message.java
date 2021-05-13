package oefening2;

import java.util.Date;

public class Message {

    private Date postdatum;
    private Date maxDatum;
    private String boodschap;
    private String titel;

    public Message(Date postdatum, Date maxDatum, String boodschap, String titel) {
        this.postdatum = postdatum;
        this.maxDatum = maxDatum;
        this.boodschap = boodschap;
        this.titel = titel;

    }

    public Date getPostdatum() {
        return postdatum;
    }

    public Date getMaxDatum() {
        return maxDatum;
    }

    public void setMaxDatum(Date maxDatum) {
        this.maxDatum = maxDatum;
    }

    public String getBoodschap() {
        return boodschap;
    }

    public void setBoodschap(String boodschap) {
        this.boodschap = boodschap;
    }

    public String getTitel() {
        return titel;
    }

    public void setTitel(String titel) {
        this.titel = titel;
    }

    public String read() {
        return "Message{" +
                "postdatum=" + postdatum +
                ", maxDatum=" + maxDatum +
                ", boodschap='" + boodschap + '\'' +
                ", titel='" + titel + '\'' +
                '}';
    };

}
