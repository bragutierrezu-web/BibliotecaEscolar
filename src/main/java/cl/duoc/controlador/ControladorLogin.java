package cl.duoc.controlador;

import cl.duoc.dao.UsuarioDAO;

public class ControladorLogin {

    private UsuarioDAO usuarioDAO;

    public ControladorLogin() {

        usuarioDAO =
                new UsuarioDAO();
    }

    public boolean iniciarSesion(
            String correo,
            String password) {

        return usuarioDAO.login(
                correo,
                password);
    }
}