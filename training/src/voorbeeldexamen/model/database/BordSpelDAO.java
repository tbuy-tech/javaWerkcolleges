package voorbeeldexamen.model.database;

import voorbeeldexamen.model.entity.Bordspel;

import java.sql.*;
import java.util.ArrayList;

public class BordSpelDAO {

    public BordSpelDAO() {
    }

    public void voegBordspelToe(Bordspel b) {

        String sql = "INSERT INTO Bordspelen (id, naam, prijs, beschrijving, speelduur) VALUES (?,?,?,?,?);";
        try(Connection connection = DatabaseSingleton.getInstance().getConnection()) {
            PreparedStatement ps = connection.prepareStatement(sql);
            ps.setInt(1, b.getId());
            ps.setString(2, b.getNaam());
            ps.setFloat(3, b.getPrijs());
            ps.setString(4, b.getBeschrijving());
            ps.setInt(5, b.getSpeelduur());
            int rowsInserted = ps.executeUpdate();
            if (rowsInserted > 0) {
                System.out.println("Bordspel toegevoegd.");
            }
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
    }

    public ArrayList<Bordspel> geefAlleBordspellen() {
        ArrayList<Bordspel> bordSpelen = new ArrayList<>();
        ResultSet rs;
        String sql = "SELECT * FROM Bordspelen;";
        try(Connection connection = DatabaseSingleton.getInstance().getConnection()) {

            Statement statement = connection.createStatement();

            rs = statement.executeQuery(sql);
            while (rs.next()) {
                bordSpelen.add(new Bordspel(rs.getInt(1), rs.getString(2), rs.getFloat(3), rs.getString(4), rs.getInt(5)));
            }
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }


        return bordSpelen;
    }

}
