package database;

import java.sql.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class MainApp {
    public static void main(String[] args) {
        Map<String, Integer> family = new HashMap<>();
        family.put("Marc", 57);
        family.put("Pascale", 58);
        family.put("Julie", 25);
        family.put("Thomas", 24);
        family.put("Eline", 22);
        family.put("Marie", 19);
        Connection conn;
        ResultSet rs;
        String sql = "INSERT INTO Buyens (Name, Age) VALUES (?, ?);";

        try {
            conn = DatabaseSingleton.getInstance().getConnection();
            Iterator iter = family.entrySet().iterator();
            while (iter.hasNext()) {
                PreparedStatement ps = conn.prepareStatement(sql);
                Map.Entry pair = (Map.Entry)iter.next();
                ps.setString(1, pair.getKey().toString());
                ps.setInt(2, Integer.parseInt(pair.getValue().toString()));
                int rowsInserted = ps.executeUpdate();
                if (rowsInserted > 0) {
                    System.out.println("A new user was inserted successfully!");
                }
            }

        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }

    }
}
