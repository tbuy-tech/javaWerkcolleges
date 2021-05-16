package database;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class MainApp {
    public static void main(String[] args) {
        try (Connection c = DatabaseSingleton.getInstance().getConnection()){
            Statement s = c.createStatement();
            ResultSet rs = s.executeQuery("SELECT * Buyens");
            while (rs.next()) {
                System.out.println(rs.getString("Name" + " - " + rs.getInt("Age")));
            }
        } catch (SQLException throwables) {
            throwables.printStackTrace();
            System.out.println(throwables.getMessage());
        }
    }
}
