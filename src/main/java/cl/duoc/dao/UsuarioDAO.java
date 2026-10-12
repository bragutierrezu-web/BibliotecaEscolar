package cl.duoc.dao;

import cl.duoc.util.DataBaseConnection;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class UsuarioDAO {

    private Connection connection;

    public UsuarioDAO() {

        connection =
                DataBaseConnection
                        .getInstance()
                        .getConnection();
    }

    public boolean login(String correo,
                         String password) {

        try {

            String sql =
                    "SELECT * FROM usuarios " +
                            "WHERE correo = ? " +
                            "AND contraseña = ?";

            PreparedStatement ps =
                    connection.prepareStatement(sql);

            ps.setString(1, correo);
            ps.setString(2, password);

            ResultSet rs =
                    ps.executeQuery();

            return rs.next();

        } catch (Exception e) {

            e.printStackTrace();
        }

        return false;
    }
}