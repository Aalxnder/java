package InterfacesGraficas.Menus;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Menus extends JFrame implements ActionListener
{
    private JMenuBar menu; //(only one)
    private JMenu menu1; //etiquetas
    private JMenuItem opc1,opc2,opc3;

    public Menus()
    {
        setLayout(null);

        //Menu Bar
        menu = new JMenuBar();
        setJMenuBar(menu);

        //opciones del menu
        menu1 = new JMenu("Opciones");
        menu.add(menu1);

        opc1 = new JMenuItem("Rojo"); //crear la opcion
        opc1.addActionListener(this); //declarar evento
        menu1.add(opc1); //agregarlo como opcion

        opc2 = new JMenuItem("Verde"); //crear la opcion
        opc2.addActionListener(this); //declarar evento
        menu1.add(opc2); //agregarlo como opcion

        opc3 = new JMenuItem("Azul"); //crear la opcion
        opc3.addActionListener(this); //declarar evento
        menu1.add(opc3); //agregarlo como opcion

    }

    public void actionPerformed(ActionEvent e)
    {
        Container fondo = this.getContentPane(); //contenedor para poder cambiar el fondo

        if(e.getSource() == opc1)
        {
            fondo.setBackground(new Color(255,0,0));
        }
        if(e.getSource() == opc2)
        {
            fondo.setBackground(new Color(0,255,0));
        }
        if(e.getSource() == opc3)
        {
            fondo.setBackground(new Color(0,0,255));
        }
    }

    public static void main(String[] args)
    {
        Menus ventana = new Menus();
        ventana.setBounds(0,0,300,255);
        ventana.setLocationRelativeTo(null);
        ventana.setTitle("menus");
        //ventana.setResizable(false);
        ventana.setDefaultCloseOperation(EXIT_ON_CLOSE);
        ventana.setVisible(true);
    }
}
