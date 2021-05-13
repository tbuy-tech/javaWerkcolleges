package Werkcollege1.oef2;

public class Adress {
    private String street;
    private int number;
    private int mailBox;
    private int postal_code;
    private String place;
    //CONSTRUCTOR
    public Adress(String street, int number, int mailBox, int postal_code, String place) {
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
    //METHODS
    public String toString() {
        return this.street + " " + this.number + " (" + this.mailBox + "), " + this.postal_code + " " + this.place;
    }
}
