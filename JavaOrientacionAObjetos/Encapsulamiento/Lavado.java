package POO.Encapsulamiento;

import javax.swing.*;
import java.awt.event.*;

public class Lavado extends JFrame implements ActionListener
{
    private JLabel Titulo,LabelLavado,LabelKilos,LabelNombre,LabelTipo;
    private JButton botonQLavado,terminarLavado;

    public static String kilos,tipoRopa ,nombre,lavado;
    public Lavado()
    {
        setLayout(null);
        getContentPane().setBackground(new java.awt.Color(200,200,200));

        //tomar datos de la clase IngresoDatos
        IngresoDatos datos = new IngresoDatos();
        kilos = datos.kilosString;
        tipoRopa = datos.comboSelected;
        lavado = datos.tipoLlenado;

        //tomar datos de la clase lavadora1
        Lavadora1 nombreusere = new Lavadora1();
        nombre = nombreusere.nombreUser;

        Titulo = new JLabel("lavando...");
        Titulo.setBounds(70,10,300,40);
        Titulo.setFont(new java.awt.Font("Andale Mono",2,37));
        Titulo.setForeground(new java.awt.Color(0,0,0));
        this.add(Titulo);

        LabelNombre = new JLabel("Ropa de: "+nombre);
        LabelNombre.setBounds(50,60,200,30);
        LabelNombre.setForeground(new java.awt.Color(0,0,0));
        LabelNombre.setFont(new java.awt.Font("Andale Mono",0,26));
        this.add(LabelNombre);

        LabelKilos = new JLabel("Kilos de Ropa: "+kilos);
        LabelKilos.setBounds(10,100,280,30);
        LabelKilos.setFont(new java.awt.Font("Andale Mono",0,16));
        LabelKilos.setForeground(new java.awt.Color(0,0,0));
        this.add(LabelKilos);

        LabelLavado = new JLabel("Tipo De ropa: "+tipoRopa);
        LabelLavado.setBounds(10,140,280,30);
        LabelLavado.setFont(new java.awt.Font("Andale Mono",0,16));
        LabelLavado.setForeground(new java.awt.Color(0,0,0));
        this.add(LabelLavado);

        LabelTipo = new JLabel("Tipo de lavado: "+lavado);
        LabelTipo.setBounds(10,180,280,30);
        LabelTipo.setFont(new java.awt.Font("Andale Mono",0,16));
        LabelTipo.setForeground(new java.awt.Color(0,0,0));
        this.add(LabelTipo);

        botonQLavado = new JButton("Interrumpir Lavado");
        botonQLavado.setBounds(30,230,230,30);
        botonQLavado.setBackground(new java.awt.Color(220,220,220));
        botonQLavado.setForeground(new java.awt.Color(0,0,0));
        botonQLavado.setFont(new java.awt.Font("Andale Mono",2,14));
        botonQLavado.addActionListener(this);
        this.add(botonQLavado);

        terminarLavado = new JButton("Pasar a secado");
        terminarLavado.setBounds(30,270,230,30);
        terminarLavado.setBackground(new java.awt.Color(220,220,220));
        terminarLavado.setForeground(new java.awt.Color(0,0,0));
        terminarLavado.setFont(new java.awt.Font("Andale Mono",2,14));
        terminarLavado.addActionListener(this);
        this.add(terminarLavado);

    }

    public void actionPerformed(ActionEvent e)
    {
        if(e.getSource() == botonQLavado)
        {
            JOptionPane.showMessageDialog(null,"Ciclo de Lavado interrumpido");

            IngresoDatos ventana = new IngresoDatos();
            ventana.setBounds(0,0,400,400);
            ventana.setLocationRelativeTo(null);
            ventana.setDefaultCloseOperation(EXIT_ON_CLOSE);
            ventana.setTitle("Ingreso de datos");
            ventana.setResizable(false);
            ventana.setVisible(true);
            this.setVisible(false);
        }
        if(e.getSource() == terminarLavado)
        {
            Secado ventana = new Secado();
            ventana.setBounds(0,0,300,350);
            ventana.setLocationRelativeTo(null);
            ventana.setDefaultCloseOperation(EXIT_ON_CLOSE);
            ventana.setResizable(false);
            ventana.setTitle("LLenado");
            ventana.setVisible(true);
            this.setVisible(false);
        }
    }
    public static void main(String[] args)
    {
        Lavado ventana = new Lavado();
        ventana.setBounds(0,0,300,350);
        ventana.setLocationRelativeTo(null);
        ventana.setDefaultCloseOperation(EXIT_ON_CLOSE);
        ventana.setResizable(false);
        ventana.setTitle("Lavado");
        ventana.setVisible(true);
    }
}
