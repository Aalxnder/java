package InterfacesGraficas.ConversionDatos;

import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

public class BotonRgb extends JFrame implements ActionListener
{
    private JComboBox combo1,combo2,combo3;
    private JLabel label1,label2,label3;
    private JButton boton;

    public BotonRgb()
    {
        setLayout(null);

        //label1
        label1 = new JLabel("Rojo");
        label1.setBounds(30,10,100,30);
        add(label1);

        //combo 1
        combo1 = new JComboBox();
        combo1.setBounds(120,10,150,30);

        for(int i=0;i<=255;i++)
        {
            combo1.addItem(String.valueOf(i)); //Convertir la variable i a string
        }
        add(combo1);

        //label 2
        label2 = new JLabel("verde");
        label2.setBounds(30,50,100,30);
        add(label2);

        //combo 2
        combo2 = new JComboBox();
        combo2.setBounds(120,50,150,30);

        for(int i=0;i<=255;i++)
        {
            combo2.addItem(String.valueOf(i)); //Convertir la variable i a string
        }
        add(combo2);

        //label 3
        label3 = new JLabel("azul");
        label3.setBounds(30,90,100,30);
        add(label3);

        //combo 3
        combo3 = new JComboBox();
        combo3.setBounds(120,90,150,30);

        for(int i=0;i<=255;i++)
        {
            combo3.addItem(String.valueOf(i)); //Convertir la variable i a string
        }
        add(combo3);

        boton = new JButton("Color");
        boton.setBounds(30,140,220,30);
        add(boton);
        boton.addActionListener(this);

    }

    public void actionPerformed(ActionEvent e)
    {
        if(e.getSource() == boton)
        {
            String valor1,valor2,valor3;
            int rojo,verde,azul;

            valor1 = combo1.getSelectedItem().toString(); //parsear de el combo a string
            valor2 = combo2.getSelectedItem().toString();
            valor3 = combo3.getSelectedItem().toString();

            rojo = Integer.parseInt(valor1); //parsear de string a int
            verde = Integer.parseInt(valor2);
            azul = Integer.parseInt(valor3);

            Color color = new Color(rojo,verde,azul); //combinar color

            boton.setBackground(color);
        }
    }

    public static void main(String[] args)
    {
        BotonRgb ventana = new BotonRgb();
        ventana.setBounds(0,0,280,230);
        ventana.setLocationRelativeTo(null);
        ventana.setResizable(false);
        ventana.setDefaultCloseOperation(EXIT_ON_CLOSE);
        ventana.setVisible(true);
        ventana.setTitle("boton rgb");
    }
}
