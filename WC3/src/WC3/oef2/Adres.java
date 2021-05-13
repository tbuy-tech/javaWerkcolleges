package WC3.oef2;

public class Adres {
    private String street = "xstraat";
    private int number = 00;
    private int mailBox = 0;
    private int postal_code = 0;
    private String place = "Unknown";
    //CONSTRUCTOR

    public Adres() {
        this.street = this.street;
        this.number = this.number;
        this.mailBox = this.mailBox;
        this.postal_code = this.postal_code;
        this.place = this.place;
    }
    public Adres(String street, int number, int mailBox, int postal_code, String place) {
        this.street = street;
        this.number = number;
        this.mailBox = mailBox;
        this.postal_code = postal_code;
        this.place = place;
    }

    //SETTER

    public void setStreet(String street) {
        this.street = street;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public void setMailBox(int mailBox) {
        this.mailBox = mailBox;
    }

    public void setPostal_code(int postal_code) {
        this.postal_code = postal_code;
    }

    public void setPlace(String place) {
        this.place = place;
    }

    //GETTER
    public String getStreet() {
        return this.street;
    }

    public String getPlace() {
        return place;
    }

    public int getMailBox() {
        return mailBox;
    }

    public int getNumber() {
        return number;
    }

    public int getPostal_code() {
        return postal_code;
    }

    @Override
    public String toString() {
        return "Adres{" +
                "street='" + street + '\'' +
                ", number=" + number +
                ", mailBox=" + mailBox +
                ", postal_code=" + postal_code +
                ", place='" + place + '\'' +
                '}';
    }
}
