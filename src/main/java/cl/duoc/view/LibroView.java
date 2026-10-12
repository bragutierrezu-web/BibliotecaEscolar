package cl.duoc.view;

import cl.duoc.dao.LibroDAO;
import cl.duoc.model.Libro;

import javax.swing.*;
import java.awt.*;

public class LibroView extends JFrame {

    private JTextField txtTitulo;
    private JTextField txtAutor;
    private JTextField txtIsbn;
    private JTextField txtEditorial;
    private JTextField txtStock;
    private JTextField txtCategoria;

    private JButton btnGuardar;

    public LibroView() {

        setTitle("Registro de Libros");
        setSize(500,400);
        setLocationRelativeTo(null);

        setLayout(new GridLayout(7,2));

        add(new JLabel("Titulo"));
        txtTitulo = new JTextField();
        add(txtTitulo);

        add(new JLabel("Autor"));
        txtAutor = new JTextField();
        add(txtAutor);

        add(new JLabel("ISBN"));
        txtIsbn = new JTextField();
        add(txtIsbn);

        add(new JLabel("Editorial"));
        txtEditorial = new JTextField();
        add(txtEditorial);

        add(new JLabel("Stock"));
        txtStock = new JTextField();
        add(txtStock);

        add(new JLabel("Categoria"));
        txtCategoria = new JTextField();
        add(txtCategoria);

        btnGuardar = new JButton("Guardar");
        add(btnGuardar);

        btnGuardar.addActionListener(e -> guardarLibro());

        setVisible(true);
    }

    private void guardarLibro() {

        Libro libro = new Libro();

        libro.setTitulo(txtTitulo.getText());
        libro.setAutor(txtAutor.getText());
        libro.setIsbn(txtIsbn.getText());
        libro.setEditorial(txtEditorial.getText());
        libro.setStock(Integer.parseInt(txtStock.getText()));
        libro.setIdCategoria(Integer.parseInt(txtCategoria.getText()));

        LibroDAO dao = new LibroDAO();

        if(dao.agregarLibro(libro)){

            JOptionPane.showMessageDialog(
                    this,
                    "Libro guardado correctamente");
            dispose();

        }else{

            JOptionPane.showMessageDialog(
                    this,
                    "Error al guardar");
        }
    }
}