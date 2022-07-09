package POO.Encapsulamiento;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;


public class Lavadora1 extends JFrame implements ActionListener
{
    private JLabel titulo,imagen, ingresaNombre;
    private JButton boton;
    private JTextField nombre;
    public static String nombreUser = "";
    public Lavadora1()
    {
        setLayout(null);
        getContentPane().setBackground(new java.awt.Color(200,200,200));

        //LabelTitulo
        titulo = new JLabel("Lavadoras de Samsung");
        titulo.setBounds(45,10,280,30);
        titulo.setForeground(new java.awt.Color(0,0,0));
        titulo.setFont(new java.awt.Font("Andale Mono",2,20));
        this.add(titulo);

        //imagen
        ImageIcon ImagenBienvenida = new ImageIcon("/home/alx/Desktop/Javafiles/java/src/POO/Encapsulamiento/3238691.png");
        imagen = new JLabel(ImagenBienvenida);
        imagen.setBounds(10,40,280,200);
        this.add(imagen);

        //label de nombre y textfield
        ingresaNombre = new JLabel("Ingresa tu nombre");
        ingresaNombre.setBounds(85,240,200,30);
        ingresaNombre.setFont(new java.awt.Font("Andale mono",0,14));
        ingresaNombre.setForeground(new java.awt.Color(0,0,0));
        this.add(ingresaNombre);

        nombre = new JTextField();
        nombre.setBounds(10,270,280,30);
        nombre.setBackground(new java.awt.Color(220,220,220));
        nombre.setFont(new java.awt.Font("Andale mono",0,12));
        nombre.setForeground(new java.awt.Color(0,0,0));
        this.add(nombre);

        boton = new JButton("Siguiente");
        boton.setBounds(80,310,150,30);
        boton.setFont(new java.awt.Font("Andale Mono",2,14));
        boton.setForeground(new java.awt.Color(0,0,0));
        boton.setBackground(new java.awt.Color(220,220,220));
        boton.addActionListener(this);
        this.add(boton);
    }

    //funcionalidad de los botones
    public void actionPerformed(ActionEvent e)
    {
        if(e.getSource() == boton)
        {

            nombreUser = nombre.getText().trim();
            if(nombreUser.equals(""))
            {
                JOptionPane.showMessageDialog(null,"Primero tienes que ingresar tu nombre");
            }
            else
            {
                IngresoDatos ventana = new IngresoDatos();
                ventana.setBounds(0,0,400,400);
                ventana.setLocationRelativeTo(null);
                ventana.setDefaultCloseOperation(EXIT_ON_CLOSE);
                ventana.setTitle("Ingreso de datos");
                ventana.setResizable(false);
                ventana.setVisible(true);
                this.setVisible(false);
            }
        }
    }
    public static void main(String[] args)
    {
        Lavadora1 ventana = new Lavadora1();
        ventana.setBounds(0,0,300,400);
        ventana.setLocationRelativeTo(null);
        ventana.setResizable(false);
        ventana.setTitle("Bienvenida");
        ventana.setVisible(true);
        ventana.setDefaultCloseOperation(EXIT_ON_CLOSE);

    }
}
