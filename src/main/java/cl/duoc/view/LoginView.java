package cl.duoc.view;

import cl.duoc.controlador.ControladorLogin;

import javax.swing.*;
import java.awt.*;

public class LoginView extends JFrame {

    private JTextField txtCorreo;
    private JPasswordField txtPassword;
    private JButton btnIngresar;

    public LoginView() {

        setTitle("Login Biblioteca");
        setSize(400,200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        setLayout(new GridLayout(3,2));

        add(new JLabel("Correo:"));
        txtCorreo = new JTextField();
        add(txtCorreo);

        add(new JLabel("Contraseña:"));
        txtPassword = new JPasswordField();
        add(txtPassword);

        btnIngresar = new JButton("Ingresar");
        add(btnIngresar);

        btnIngresar.addActionListener(e -> login());

        setVisible(true);
    }

    private void login() {

        String correo = txtCorreo.getText();

        String password =
                new String(
                        txtPassword.getPassword());

        ControladorLogin controlador =
                new ControladorLogin();

        boolean acceso =
                controlador.iniciarSesion(
                        correo,
                        password);

        if(acceso){

            JOptionPane.showMessageDialog(
                    this,
                    "Bienvenido");

            dispose();

            new MenuPrincipalView();

        }else{

            JOptionPane.showMessageDialog(
                    this,
                    "Correo o contraseña incorrectos");
        }
    }
}