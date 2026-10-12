package cl.duoc.dao;

import cl.duoc.util.DataBaseConnection;
import java.sql.Connection;

public class CategoriaDAO {

    private Connection connection;

    public CategoriaDAO() {
        connection = DataBaseConnection.getInstance().getConnection();
    }
}