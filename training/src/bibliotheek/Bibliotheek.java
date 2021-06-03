package bibliotheek;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class Bibliotheek {
    private List<String> leden;
    private List<Boek> boeken;
    private List<Reservatie> reservaties;
    Bibliothecaris bibliothecaris;

    public Bibliotheek(Bibliothecaris bibliothecaris) {
        this.leden = fetchLeden();
        this.boeken = new ArrayList<>();
        this.reservaties = new ArrayList<>();
        this.bibliothecaris = bibliothecaris;
    }

    private ArrayList<String> fetchLeden() {

        LidDAO lidDAO = new LidDAO();
        ArrayList<String> leden = null;
        try {
            leden = lidDAO.laadDeLeden();
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }

        return leden;
    }

    public List<String> getLeden() {
        return leden;
    }

    public List<Boek> getBoeken() {
        return boeken;
    }

    public List<Reservatie> getReservaties() {
        return reservaties;
    }

    public Bibliothecaris getBibliothecaris() {
        return bibliothecaris;
    }
}
