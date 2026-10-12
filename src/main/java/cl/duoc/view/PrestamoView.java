package cl.duoc.view;

import javax.swing.*;
import java.awt.*;

public class PrestamoView extends JFrame {

    private JTextField txtIdEstudiante;
    private JTextField txtIdLibro;

    private JButton btnPrestar;
    private JButton btnDevolver;

    public PrestamoView() {

        setTitle("Gestión de Préstamos");
        setSize(400, 250);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);

        setLayout(new GridLayout(3, 2));

        add(new JLabel("ID Estudiante:"));
        txtIdEstudiante = new JTextField();
        add(txtIdEstudiante);

        add(new JLabel("ID Libro:"));
        txtIdLibro = new JTextField();
        add(txtIdLibro);

        btnPrestar = new JButton("Registrar Préstamo");
        btnDevolver = new JButton("Registrar Devolución");

        btnPrestar.addActionListener(e -> {

            JOptionPane.showMessageDialog(this,
                    "Préstamo registrado correctamente");

        });

        btnDevolver.addActionListener(e -> {

            JOptionPane.showMessageDialog(this,
                    "Devolución registrada correctamente");

        });


        add(btnPrestar);
        add(btnDevolver);
        setVisible(true);
    }





    public JTextField getTxtIdEstudiante() {
        return txtIdEstudiante;
    }

    public JTextField getTxtIdLibro() {
        return txtIdLibro;
    }

    public JButton getBtnPrestar() {
        return btnPrestar;
    }

    public JButton getBtnDevolver() {
        return btnDevolver;
    }
}