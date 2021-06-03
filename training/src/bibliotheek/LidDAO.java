package bibliotheek;

import java.sql.*;
import java.util.ArrayList;

public class LidDAO {

    public LidDAO() {

    }

    public void voegLidToe(Lid lid) throws SQLException {
        Connection connection;
        String sql = "INSERT INTO Leden (id, naam, wachtwoord) VALUES (?, ?, ?)";
        connection = DatabaseSingleton.getInstance().getConnection();
        PreparedStatement ps = connection.prepareStatement(sql);
        ps.setInt(1, lid.getId());
        ps.setString(2, lid.getNaam());
        ps.setString(3, lid.getWachtwoord());

        int rowsInserted = ps.executeUpdate();
        if (rowsInserted > 0) {
            System.out.println("row added boiii");
        }
        connection.close();

    }

    public ArrayList<String> laadDeLeden() throws SQLException {
        ArrayList<String> leden = new ArrayList<>();
        Connection connection;
        String sql = "SELECT id, naam, wachtwoord FROM Leden;";
        ResultSet rs;
        connection = DatabaseSingleton.getInstance().getConnection();
        Statement statement = connection.createStatement();
        rs = statement.executeQuery(sql);
        while (rs.next()) {
            System.out.println();
            rs.getInt(1);
            rs.getString(2);
            rs.getString(2);
            String output = "Lid: %d - %s - %s";
            leden.add(String.format(output, rs.getInt(1), rs.getString(2), rs.getString(2)));
        }
        return leden;
    }

    public boolean checkLogIn(String naam, String wachtwoord) {
        Connection connection;
        String sql = "SELECT * FROM Bibliothecarissen WHERE naam=? AND  wachtwoord=?;";
        ResultSet rs;
        PreparedStatement ps = null;
        try {
            connection = DatabaseSingleton.getInstance().getConnection();
            ps = connection.prepareStatement(sql);
            ps.setString(1, naam);
            ps.setString(2, wachtwoord);
            rs = ps.executeQuery();
            while (rs.next()) {
                String a = rs.getString(2);
                String b = rs.getString(3);
                System.out.println(a + " - " + b);
                System.out.println(wachtwoord.equals(b));
                if (naam.equals(a) && wachtwoord.equals(b)) {
                    return true;
                };
            }

        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }

        return false;
    }

    public boolean checkLeden(String naam, String wachtwoord) {
        Connection connection;
        String sql = "SELECT * FROM Leden WHERE naam=? AND  wachtwoord=?;";
        ResultSet rs;
        PreparedStatement ps = null;
        try {
            connection = DatabaseSingleton.getInstance().getConnection();
            ps = connection.prepareStatement(sql);
            ps.setString(1, naam);
            ps.setString(2, wachtwoord);
            rs = ps.executeQuery();
            while (rs.next()) {
                String a = rs.getString(2);
                String b = rs.getString(3);
                System.out.println(a + " - " + b);

                if (naam.equals(a) && wachtwoord.equals(b)) {
                    return true;
                };
            }

        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }

        return false;
    }

    public boolean voegLidToe(String naam, String wachtwoord) {
         Connection connection;
         ResultSet rs;
         String sql = "INSERT INTO Leden (id, naam, wachtwoord) VALUES ( ?, ?, ?);";
         Lid lid = new Lid(naam, wachtwoord);
        try {
            connection = DatabaseSingleton.getInstance().getConnection();
            PreparedStatement ps = connection.prepareStatement(sql);
            ps.setInt(1, lid.getId());
            ps.setString(2, naam);
            ps.setString(3, wachtwoord);

            int rowsInserted = ps.executeUpdate();
            if (rowsInserted > 0) {
                System.out.println(naam + " toegevoegd.");
            }
            connection.close();
        } catch (SQLException throwables) {
            System.out.println( "Error: " + throwables.getMessage() );
            return false;
        }

        return true;
    }
}
