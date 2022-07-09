package POO.Encapsulamiento;

import javax.swing.*;
import java.awt.event.*;

public class IngresoDatos extends JFrame implements ActionListener//, ItemListener;
{
    private JLabel titulo, labelKilos,labelTipo,imagen;
    private JTextField kilos;
    private JComboBox combo;
    private JButton botonsig,botonant,botonLimpiar;

    public static String kilosString = "",comboSelected = "",tipoLlenado = "";
    public IngresoDatos()
    {
        setLayout(null);
        getContentPane().setBackground(new java.awt.Color(200,200,200));

        //Titulo
        titulo = new JLabel("Ingreso de datos");
        titulo.setBounds(95,10,380,35);
        titulo.setForeground(new java.awt.Color(0,0,0));
        titulo.setFont(new java.awt.Font("Andale Mono",2,28));
        this.add(titulo);
        //imagen
        ImageIcon LogoImagen = new ImageIcon("/home/alx/Desktop/Javafiles/java/src/POO/Encapsulamiento/lavadora.png");
        imagen = new JLabel(LogoImagen);
        imagen.setBounds(-100,60,360,200);
        this.add(imagen);

        //labelTipo y textfield
        labelKilos = new JLabel("Kilos:");
        labelKilos.setFont(new java.awt.Font("Andale Mono",1,18));
        labelKilos.setForeground(new java.awt.Color(0,0,0));
        labelKilos.setBounds(255,60,100,30);
        this.add(labelKilos);

        kilos = new JTextField();
        kilos.setBounds(180,90,190,30);
        kilos.setForeground(new java.awt.Color(0,0,0));
        kilos.setFont(new java.awt.Font("Andale Mono",0,12));
        kilos.setBackground(new java.awt.Color(220,220,220));
        this.add(kilos);

        labelTipo = new JLabel("Tipo de ropa");
        labelTipo.setFont(new java.awt.Font("Andale Mono",1,18));
        labelTipo.setForeground(new java.awt.Color(0,0,0));
        labelTipo.setBounds(225,130,160,30);
        this.add(labelTipo);

        combo = new JComboBox();
        combo.setBounds(180,170,190,30);
        combo.setForeground(new java.awt.Color(0,0,0));
        combo.setFont(new java.awt.Font("Andale Mono",0,14));
        combo.setBackground(new java.awt.Color(220,220,220));
        this.add(combo);
        combo.addItem("");
        combo.addItem("Blanca");
        combo.addItem("Negra");
        combo.addItem("Color");
        combo.addItem("mezclilla");

        //botonLimpiar
        botonLimpiar = new JButton("Limpiar");
        botonLimpiar.setForeground(new java.awt.Color(0,0,0));
        botonLimpiar.setFont(new java.awt.Font("Andale Mono",2,14));
        botonLimpiar.setBackground(new java.awt.Color(220,220,220));
        botonLimpiar.setBounds(225,220,100,30);
        botonLimpiar.addActionListener(this);
        this.add(botonLimpiar);

        botonant = new JButton("Pagina Anterior");
        botonant.setBounds(30,290,150,30);
        botonant.setForeground(new java.awt.Color(0,0,0));
        botonant.setFont(new java.awt.Font("Andale Mono",2,14));
        botonant.setBackground(new java.awt.Color(220,220,220));
        botonant.addActionListener(this);
        this.add(botonant);

        botonsig = new JButton("Iniciar Llenado");
        botonsig.setBounds(220,290,150,30);
        botonsig.setForeground(new java.awt.Color(0,0,0));
        botonsig.setFont(new java.awt.Font("Andale Mono",2,14));
        botonsig.setBackground(new java.awt.Color(220,220,220));
        botonsig.addActionListener(this);
        this.add(botonsig);
    }

    //funcionalidad de los botones
    public void actionPerformed(ActionEvent e)
    {
        if(e.getSource() == botonLimpiar)
        {
            kilos.setText("");
            combo.setSelectedIndex(0);
        }
        if(e.getSource() == botonant)
        {
            JOptionPane.showMessageDialog(null,"Volviendo a la pagina principal");

            Lavadora1 ventana = new Lavadora1();
            ventana.setBounds(0,0,300,400);
            ventana.setLocationRelativeTo(null);
            ventana.setResizable(false);
            ventana.setTitle("Bienvenida");
            ventana.setVisible(true);
            ventana.setDefaultCloseOperation(EXIT_ON_CLOSE);
            this.setVisible(false);
        }
        if(e.getSource() == botonsig)
        {
            int numero = 0;

            kilosString = kilos.getText();
            comboSelected = combo.getSelectedItem().toString();

            if(kilosString.equals("") || comboSelected.equals(""))
            {
                JOptionPane.showMessageDialog(null,"Primero debe rellenar correctamente los campos");
            }

            else
            {
                numero = Integer.parseInt(kilos.getText());

                if(numero >12 || numero<0)
                {
                    JOptionPane.showMessageDialog(null,"Ingresa una cantidad valida(1-12)");
                }
                else
                {
                    if(comboSelected.equals("Blanca"))
                    {
                        tipoLlenado = "Lavado suave";
                        JOptionPane.showMessageDialog(null,"Tipo de ropa blanca, se realizara un lavado suave");

                    }
                    else if (comboSelected.equals("Negra"))
                    {
                        tipoLlenado = "Lavado normal";
                        JOptionPane.showMessageDialog(null,"Tipo de ropa negra, se realizara un lavado normal");
                    }
                    else if(comboSelected.equals("Color"))
                    {
                        tipoLlenado = "Lavado intenso";
                        JOptionPane.showMessageDialog(null,"tipo de ropa de color, se realizara un lavado intenso");
                    }
                    else if(comboSelected.equals("mezclilla"))
                    {
                        tipoLlenado = "lavado intenso";
                        JOptionPane.showMessageDialog(null,"Tipo de ropa de mezclillar, se realizara un lavado intenso");
                    }

                    Llenado ventana = new Llenado();
                    ventana.setBounds(0, 0, 300, 400);
                    ventana.setLocationRelativeTo(null);
                    ventana.setDefaultCloseOperation(EXIT_ON_CLOSE);
                    ventana.setResizable(false);
                    ventana.setTitle("principal");
                    ventana.setVisible(true);
                    this.setVisible(false);
                }
            }
        }

    }
    public static void main(String[] args)
    {
        IngresoDatos ventana = new IngresoDatos();
        ventana.setBounds(0,0,400,400);
        ventana.setLocationRelativeTo(null);
        ventana.setDefaultCloseOperation(EXIT_ON_CLOSE);
        ventana.setTitle("Ingreso de datos");
        ventana.setResizable(false);
        ventana.setVisible(true);
    }
}
