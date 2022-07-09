package InterfacesGraficas.Proyecto;

import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

public class Main extends JFrame implements ActionListener
{
    private JLabel label1,label2,label3,label4;
    private JTextField nombre;
    private JButton boton;

    public Main()
    {
        setLayout(null);
        setTitle("bienvenida");
        getContentPane().setBackground(new Color(255,0,0));
        //icono de la pagina
        setIconImage(new ImageIcon(getClass().getResource("botella.jpg")).getImage());
        //imagen
        ImageIcon imagen = new ImageIcon("historia-logo-coca-cola.jpg");
        label1 = new JLabel(imagen);
        label1.setBounds(25,15,300,150);
        add(label1);

        //label2
        label2 = new JLabel("Sistema de control Vacacional");
        label2.setBounds(35,135,300,30);
        label2.setFont(new Font("Andale Mono",3,18));
        label2.setForeground(new Color(255,255,255));
        add(label2);

        //Label 3
        label3 = new JLabel("Ingrese su nombre");
        label3.setBounds(45,212,200,30);
        label3.setFont(new Font("Arial",1,12));
        label3.setForeground(new Color(255,255,255));
        add(label3);

        label4 = new JLabel("2022 The Coca-Cola Company");
        label4.setBounds(85,375,300,30);
        label4.setFont(new Font("Andale Mono",1,12));
        label4.setForeground(new Color(255,255,255));
        add(label4);

        //text field
        nombre = new JTextField();
        nombre.setBounds(45,240,255,25);
        nombre.setBackground(new Color (224,224,224));
        nombre.setFont(new Font("Andale Mono",0,14));
        nombre.setForeground(new Color(0,0,0));
        add(nombre);

        //boton
        boton = new JButton("Ingresar");
        boton.setBounds(125,280,100,30);
        boton.setBackground(new Color(255,255,255));
        boton.setFont(new Font("Andale Mono",1,14));
        boton.setForeground(new Color(0,0,0));
        boton.addActionListener(this);
        add(boton);
    }
    public void actionPerformed(ActionEvent e)
    {
        if(e.getSource() == boton)
        {

        }
    }
    public static void main(String[] args)
    {
        Main ventana = new Main();
        ventana.setBounds(0,0,350,450);
        ventana.setLocationRelativeTo(null);
        ventana.setVisible(true);
        ventana.setResizable(false);
        ventana.setDefaultCloseOperation(EXIT_ON_CLOSE);
    }
}
