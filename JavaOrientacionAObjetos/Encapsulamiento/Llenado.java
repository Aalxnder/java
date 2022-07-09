package POO.Encapsulamiento;

import javax.swing.*;
import java.awt.event.*;

public class Llenado extends JFrame implements ActionListener
{
    private JLabel lavado, bienvenido,LabelKilos,LabelTipo,LabelImagen;
    private JButton botonSig,botonant;

    String nombreDato = "";
    public Llenado()
    {
        setLayout(null);
        getContentPane().setBackground(new java.awt.Color(200,200,200));
        Lavadora1 lavadora = new Lavadora1();
        nombreDato = lavadora.nombreUser;

        lavado = new JLabel("Zona de Llenado");
        lavado.setBounds(20,10,380,30);
        lavado.setForeground(new java.awt.Color(0,0,0));
        lavado.setFont(new java.awt.Font("Andale Mono",2,34));
        this.add(lavado);

        bienvenido = new JLabel("Ropa de "+nombreDato);
        bienvenido.setFont(new java.awt.Font("Andale Mono",2,26));
        bienvenido.setBounds(50,50,380,30);
        bienvenido.setForeground(new java.awt.Color(0,0,0));
        this.add(bienvenido);

        ImageIcon imagen = new ImageIcon("/home/alx/Desktop/Javafiles/java/src/POO/Encapsulamiento/index.jpg");
        LabelImagen = new JLabel(imagen);
        LabelImagen.setBounds(50,90,200,180);
        this.add(LabelImagen);

        //botones
        botonant = new JButton("Vaciar la lavadora");
        botonant.setBounds(50,290,200,30);
        botonant.setFont(new java.awt.Font("Andale Mono",0,12));
        botonant.setForeground(new java.awt.Color(0,0,0));
        botonant.setBackground(new java.awt.Color(220,220,220));
        botonant.addActionListener(this);
        this.add(botonant);

        botonSig = new JButton("Iniciar Lavado");
        botonSig.setBounds(50,330,200,30);
        botonSig.setFont(new java.awt.Font("Andale Mono",0,12));
        botonSig.setForeground(new java.awt.Color(0,0,0));
        botonSig.setBackground(new java.awt.Color(220,220,220));
        botonSig.addActionListener(this);
        this.add(botonSig);
    }

    public void actionPerformed(ActionEvent e)
    {
        if(e.getSource() == botonant)
        {
            JOptionPane.showMessageDialog(null,"Ciclo de llenado interrumpido");

            IngresoDatos ventana = new IngresoDatos();
            ventana.setBounds(0,0,400,400);
            ventana.setLocationRelativeTo(null);
            ventana.setDefaultCloseOperation(EXIT_ON_CLOSE);
            ventana.setTitle("Ingreso de datos");
            ventana.setResizable(false);
            ventana.setVisible(true);
            this.setVisible(false);
        }
        if(e.getSource() == botonSig)
        {
            Lavado ventana = new Lavado();
            ventana.setBounds(0,0,300,350);
            ventana.setLocationRelativeTo(null);
            ventana.setDefaultCloseOperation(EXIT_ON_CLOSE);
            ventana.setResizable(false);
            ventana.setTitle("Lavado");
            ventana.setVisible(true);
            this.setVisible(false);
        }
    }
    public static void main(String[] args)
    {
        Llenado ventana = new Llenado();
        ventana.setBounds(0,0,300,400);
        ventana.setLocationRelativeTo(null);
        ventana.setDefaultCloseOperation(EXIT_ON_CLOSE);
        ventana.setResizable(false);
        ventana.setTitle("LLenado");
        ventana.setVisible(true);
    }
}
