package cl.duoc.view;

import javax.swing.*;
import java.awt.*;

public class MenuPrincipalView extends JFrame {

    public MenuPrincipalView() {

        setTitle("Menú Principal");
        setSize(500,300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        setLayout(new FlowLayout());

        JButton btnLibros =
                new JButton("Gestión Libros");

        btnLibros.addActionListener(e ->
                new LibroView());

        JButton btnPrestamos =
                new JButton("Prestamos");

        btnPrestamos.addActionListener(e ->
                new PrestamoView());

        add(btnLibros);
        add(btnPrestamos);

        setVisible(true);
    }
}