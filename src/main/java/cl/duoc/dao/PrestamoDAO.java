package cl.duoc.dao;

import cl.duoc.model.Prestamo;
import cl.duoc.util.DataBaseConnection;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class PrestamoDAO {

    private Connection connection;

    public PrestamoDAO() {
        connection = DataBaseConnection.getInstance().getConnection();
    }

    public boolean insertar(Prestamo prestamo) {

        String sql = "INSERT INTO prestamos (id_estudiante, id_libro, fecha_prestamo, fecha_devolucion, devuelto) VALUES (?, ?, ?, ?, ?)";

        try {

            PreparedStatement ps = connection.prepareStatement(sql);

            ps.setInt(1, prestamo.getIdEstudiante());
            ps.setInt(2, prestamo.getIdLibro());
            ps.setDate(3, new java.sql.Date(prestamo.getFechaPrestamo().getTime()));
            ps.setDate(4, new java.sql.Date(prestamo.getFechaDevolucion().getTime()));
            ps.setBoolean(5, prestamo.isDevuelto());

            return ps.executeUpdate() > 0;

        } catch (SQLException e) {
            e.printStackTrace();
        }

        return false;
    }

    public boolean marcarDevuelto(int idPrestamo) {

        String sql = "UPDATE prestamos SET devuelto = true WHERE id = ?";

        try {

            PreparedStatement ps = connection.prepareStatement(sql);
            ps.setInt(1, idPrestamo);

            return ps.executeUpdate() > 0;

        } catch (SQLException e) {
            e.printStackTrace();
        }

        return false;
    }
}