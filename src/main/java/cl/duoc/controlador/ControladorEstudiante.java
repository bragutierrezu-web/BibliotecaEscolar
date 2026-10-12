package cl.duoc.controlador;

import cl.duoc.dao.EstudianteDAO;
import cl.duoc.model.Estudiante;

public class ControladorEstudiante {

    private EstudianteDAO estudianteDAO;

    public ControladorEstudiante() {
        estudianteDAO = new EstudianteDAO();
    }

    public void guardarEstudiante(Estudiante estudiante) {
        estudianteDAO.insertar(estudiante);
    }

    public void actualizarEstudiante(Estudiante estudiante) {
        estudianteDAO.actualizar(estudiante);
    }

    public void eliminarEstudiante(int id) {
        estudianteDAO.eliminar(id);
    }
}