package InterfacesGraficas.Botones;

import javax.swing.*;
import java.awt.event.*;

public class MoverTexto extends JFrame implements ActionListener
{
    private JLabel label;
    private JTextField texto;
    private JTextArea area;
    private JButton boton;
    private JScrollPane scroll;

    String cadena;

    public MoverTexto()
    {
        setLayout(null);

        //label 1
        label = new JLabel("Pasar texto de text field a text area");
        label.setBounds(20,10,500,30);
        add(label);

        //Jtext field
        texto = new JTextField();
        texto.setBounds(10,50,200,30);
        add(texto);

        //botn
        boton = new JButton("Agregar");
        boton.setBounds(250,50,100,30);
        add(boton);
        boton.addActionListener(this);


        //text area y scroll
        area = new JTextArea();
        scroll = new JScrollPane(area);
        scroll.setBounds(10,100,400,350);
        add(scroll);
    }

    public void actionPerformed(ActionEvent e)
    {
        if(e.getSource() == boton)
        {
            cadena += texto.getText() + "\n"; //recuperar el texto y acumularlo en la variable cadena
            area.setText(cadena); //colocar el texto en el text area
            texto.setText(""); //limpiar el text file
        }
    }

    public static void main(String[] args)
    {
        MoverTexto ventana = new MoverTexto();
        ventana.setBounds(0,0,550,460);
        ventana.setLocationRelativeTo(null);
        ventana.setResizable(false);
        ventana.setVisible(true);
        ventana.setDefaultCloseOperation(EXIT_ON_CLOSE);
    }
}
