package InterfacesGraficas.Botones;

import javax.swing.*;
import java.awt.event.*;

public class TextField extends JFrame implements ActionListener
{
    private JTextField texto1;
    private JButton boton1;
    private JLabel label1;

    public TextField()
    {
        setLayout(null);
        //label 1
        label1 = new JLabel("Usuario");
        label1.setBounds(30,25,100,30);
        add(label1);

        //Text file
        texto1 = new JTextField();
        texto1.setBounds(120,30,150,20);
        add(texto1);

        //boton
        boton1 = new JButton("Aceptar");
        boton1.setBounds(10,80,100,30);
        add(boton1);
        boton1.addActionListener(this);

    }

    public void actionPerformed(ActionEvent e)
    {
        if(e.getSource() == boton1)
        {
            String texto = texto1.getText(); //recuperar el texto del texfile
            setTitle(texto); //poner el titulo en el titulo
        }
    }

    public static void main(String[] args)
    {
        TextField ventana = new TextField();
        ventana.setBounds(0,0,300,150);
        ventana.setVisible(true);
        ventana.setLocationRelativeTo(null);
        ventana.setResizable(false);
    }
}
