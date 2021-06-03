package bibliotheek;

import java.awt.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DatabaseSingleton {

    private static DatabaseSingleton instance;
    private Connection connection;

    private DatabaseSingleton() {

    }

    public static DatabaseSingleton getInstance() {
        if (instance == null) {
            instance = new DatabaseSingleton();
        }
        return instance;
    }

    public Connection getConnection() throws SQLException {
        if (connection == null || connection.isClosed()) {
            connection = DriverManager.getConnection("jdbc:mysql://dt5.ehb.be/2021PROGESS004", "2021PROGESS004", "27531846");
        }
        return connection;
    }
}
