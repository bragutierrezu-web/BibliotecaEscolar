package cl.duoc.controlador;

import cl.duoc.dao.LibroDAO;
import cl.duoc.model.Libro;

public class ControladorLibro {

    private LibroDAO libroDAO;

    public ControladorLibro() {
        libroDAO = new LibroDAO();
    }

    public void guardarLibro(Libro libro) {

        libroDAO.agregarLibro(libro);

    }

    public void actualizarLibro(Libro libro) {

        libroDAO.actualizarLibro(libro);

    }

    public void eliminarLibro(int id) {

        libroDAO.eliminarLibro(id);

    }
}