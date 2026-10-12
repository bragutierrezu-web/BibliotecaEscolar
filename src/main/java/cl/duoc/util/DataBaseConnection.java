package cl.duoc.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DataBaseConnection {

    private static DataBaseConnection instancia;
    private Connection connection;

    private DataBaseConnection() {
        try {
            connection = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/biblioteca",
                    "root",
                    "Kiolindo1930#");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public static DataBaseConnection getInstance() {

        if (instancia == null) {
            instancia = new DataBaseConnection();
        }

        return instancia;
    }

    public Connection getConnection() {
        return connection;
    }
}