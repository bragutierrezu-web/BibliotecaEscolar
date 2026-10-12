package cl.duoc.controlador;

import cl.duoc.dao.PrestamoDAO;
import cl.duoc.model.Prestamo;

public class ControladorPrestamo {

    private PrestamoDAO prestamoDAO;

    public ControladorPrestamo() {
        prestamoDAO = new PrestamoDAO();
    }

    public void registrarPrestamo(Prestamo prestamo) {
        prestamoDAO.insertar(prestamo);
    }

    public void registrarPrestamoAsync(Prestamo prestamo) {

        Thread hilo = new Thread(() -> {
            prestamoDAO.insertar(prestamo);
        });

        hilo.start();
    }

    public void devolverLibro(int idPrestamo) {
        prestamoDAO.marcarDevuelto(idPrestamo);
    }
}