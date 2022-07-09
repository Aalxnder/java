package InterfacesGraficas.Proyecto2;

import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

public class Bienvenida extends JFrame implements ActionListener
{
    private JLabel label1,label2,label3,label4;
    private JTextField nombre;
    private JButton boton;
    public static String nombreUser = "";
    public Bienvenida()
    {
        setLayout(null);
        setTitle("bienvenida");
        getContentPane().setBackground(new Color(255,0,30));

        //imagen de icono
        setIconImage(new ImageIcon(getClass().getResource("botella.jpg")).getImage());

        //imagen
        ImageIcon imagen = new ImageIcon("/home/alx/Desktop/Javafiles/java/src/InterfacesGraficas/Proyecto2/HistoriadellogodeCocaCola.png");
        label1 = new JLabel(imagen);
        label1.setBounds(20,10,350,100);
        add(label1);

        //label dos
        label2 = new JLabel("sistema de control vacacional");
        label2.setBounds(49,120,300,50);
        label2.setFont(new Font("Andale Mono",3,21));
        label2.setForeground(new Color(255,255,255));
        add(label2);

        //label 3
        label3 = new JLabel("ingresa tu nombre: ");
        label3.setBounds(70,190, 200,30);
        label3.setForeground(new Color(255,255,255));
        label3.setFont(new Font("Andale Mono",1,12));
        add(label3);

        //label 4
        label4 = new JLabel("2022 The Coca Cola Company");
        label4.setBounds(95,370,250,25);
        label4.setFont(new Font ("Andale Mono",1,14));
        label4.setForeground(new Color (255,255,255));
        add(label4);

        //text field
        nombre = new JTextField();
        nombre.setBackground(new Color(224,224,224));
        nombre.setBounds(70,230,250,30);
        nombre.setForeground(new Color (0,0,0));
        nombre.setFont(new Font("Andale Mono",0,14));
        add(nombre);


        //boton
        boton = new JButton("Siguiente");
        boton.setBounds(120,290,150,30);
        boton.setFont(new Font("Andale Mono",0,14));
        add(boton);
        boton.addActionListener(this);


    }

    public void actionPerformed(ActionEvent e)
    {
        if(e.getSource() == boton)
        {
            nombreUser = nombre.getText().trim();//texto sin espacios con trim
            if(nombreUser.equals(""))
            {
                JOptionPane.showMessageDialog(null,"Primero debes ingresar tu nombre");
            }
            else
            {
                //Conectar las dos interfaces
                Terminos ventana2 = new Terminos();
                ventana2.setBounds(0,0,700,460);
                ventana2.setLocationRelativeTo(null);
                ventana2.setDefaultCloseOperation(EXIT_ON_CLOSE);
                ventana2.setResizable(false);
                ventana2.setVisible(true);
                this.setVisible(false);
            }
        }
    }

    public static void main(String[] args)
    {
        Bienvenida ventana = new Bienvenida();
        ventana.setBounds(0,0,400,450);
        ventana.setLocationRelativeTo(null);
        ventana.setResizable(false);
        ventana.setDefaultCloseOperation(EXIT_ON_CLOSE);
        ventana.setVisible(true);
    }
}
