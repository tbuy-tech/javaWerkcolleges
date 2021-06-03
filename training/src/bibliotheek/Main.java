package bibliotheek;

public class Main {
    public static void main(String[] args) {

        Bibliothecaris jan = new Bibliothecaris("Jan", "1234");
        Lid piet = new Lid("Piet", "1234");
        Lid tom = new Lid("tom", "8574");
        Lid arno = new Lid("arno", "3552");

        //jan.voegLidToe(piet);
        //jan.voegLidToe(tom);
        //jan.voegLidToe(arno);
        //Bibliotheek deMunt = new Bibliotheek(jan);

        //deMunt.getLeden();

        new UI();
    }
}
