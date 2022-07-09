package InterfacesGraficas.Botones;

import javax.swing.*;
import java.awt.event.*;

public class Botones1 extends JFrame implements ActionListener
{
    private JLabel label1;
    private JButton boton;

    public Botones1()
    {
        setLayout(null);
        label1 = new JLabel("Practica 1 de botones");
        label1.setBounds(190,20,300,50);
        add(label1);

        boton = new JButton("Cerrar ventana");
        boton.setBounds(300,250,150,30);
        add(boton);

        boton.addActionListener(this); //Funcion del boton

    }
    //programar el evento del boton
    public void actionPerformed(ActionEvent e)
    {
        if(e.getSource() == boton) //get source(actionevent) contiene el objeto del evento y recupera el evento que se origino
        {
            System.exit(0); //Cerrar la interface
        }
    }
    public static void main(String[] args)
    {
        Botones1 botones = new Botones1();
        botones.setBounds(0,0,500,400);
        botones.setLocationRelativeTo(null);
        botones.setResizable(false);
        botones.setVisible(true);
    }
}
