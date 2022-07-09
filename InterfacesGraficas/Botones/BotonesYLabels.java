package InterfacesGraficas.Botones;

import javax.swing.*;
import java.awt.event.*;

public class BotonesYLabels extends JFrame implements ActionListener
{
    private JLabel label,label2;
    private JButton boton1, boton2, boton3,salir;

    public BotonesYLabels()
    {
        setLayout(null);
        //Label
        label = new JLabel("En espera...");
        label.setBounds(250,10,400,100);
        add(label);


        //label 2
        label2 = new JLabel("presione un boton");
        label2.setBounds(230,30,400,100);
        add(label2);

        //boton 1
        boton1 = new JButton("Boton 1");
        boton1.setBounds(40,300,150,30);
        add(boton1);
        boton1.addActionListener(this);

        //Boton 2
        boton2 = new JButton("Boton 2");
        boton2.setBounds(220,300,150,30);
        add(boton2);
        boton2.addActionListener(this);

        //boton 3
        boton3 = new JButton("Boton 3");
        boton3.setBounds(400,300,150,30);
        add(boton3);
        boton3.addActionListener(this);

        //Boton salir
        salir = new JButton("Cerrar ventana");
        salir.setBounds(220,350,150,30);
        add(salir);
        salir.addActionListener(this);
    }
    public void actionPerformed(ActionEvent e)
    {
        if(e.getSource() == boton1)
        {
            JOptionPane.showMessageDialog(null, "ha presionado el boton 1");
        }
        else if(e.getSource() == boton2)
        {
            JOptionPane.showMessageDialog(null,"Ha presionado el boton 2");
        }
        else if (e.getSource() == boton3)
        {
            JOptionPane.showMessageDialog(null,"Ha presionado el boton 3");
        }
        else if (e.getSource() == salir)
        {
            System.exit(0);
        }
    }

    public static void main(String[] args)
    {
        BotonesYLabels ventana = new BotonesYLabels();
        ventana.setBounds(0,0,600,450);
        ventana.setLocationRelativeTo(null);
        ventana.setResizable(false);
        ventana.setVisible(true);
    }
}
