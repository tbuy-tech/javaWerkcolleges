package bibliotheek;

import java.sql.SQLException;

public class Bibliothecaris extends Lid{

    public Bibliothecaris(String naam, String wachtwoord) {
        super(naam, wachtwoord);

    }


    public void voegLidToe(Lid lid) {
        LidDAO lidDao = new LidDAO();
        try {
            lidDao.voegLidToe(lid);
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }

    }
    public void voegBoekToe(Boek boek, Bibliotheek bibliotheek) {
        bibliotheek.getBoeken().add(boek);
    }
    public void verwijderBoek(Boek boek, Bibliotheek bibliotheek) {
        bibliotheek.getBoeken().remove(boek);
    }
    public void voegReservatieToe(Reservatie reservatie, Bibliotheek bibliotheek) {
        bibliotheek.getReservaties().add(reservatie);
    }

}
