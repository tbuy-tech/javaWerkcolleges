package videotheek;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.time.LocalDate;
import java.util.Map;

public class GameDAO {

    public GameDAO() {
    }

    public void uploadGame(Map<Game, LocalDate> media) {



        int rowsInserted;


        String sql = "INSERT INTO Games (titel, beschrijving, rating, uitgever) VALUES (?, ?, ?, ?);";

        try(Connection connection = DatabaseSingleton.getInstance().getConnection();) {

            PreparedStatement ps = connection.prepareStatement(sql);
            for (Map.Entry<Game, LocalDate> entry: media.entrySet()) {

                ps.setString(1, entry.getKey().getTitel());
                ps.setString(2, entry.getKey().getBeschrijving());
                ps.setDouble(3, entry.getKey().getRating());
                ps.setString(4, entry.getKey().getUitgever());

                rowsInserted = ps.executeUpdate();
                if (rowsInserted > 0) {
                    System.out.println("Row added.");
                }
            }

        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
    }
}
