package InterfacesGraficas.ConversionDatos;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class ComboBox extends JFrame implements ItemListener
{
    private JComboBox combo;

    public ComboBox()
    {
        setLayout(null);
        combo = new JComboBox();
        combo.setBounds(10,10,100,30);
        add(combo);

        //introducir texto en el combobox
        //combo.addItem("rojo","amarillo","verde","negro","azul");

        combo.addItem("rojo");
        combo.addItem("azul");
        combo.addItem("amarillo");
        combo.addItem("negro");
        combo.addItem("verde");

        combo.addItemListener((ItemListener) this); //declarar el evento
    }

    public void itemStateChanged(ItemEvent e)
    {
        if(e.getSource() == combo)
        {
            String cadena;
            cadena = combo.getSelectedItem().toString();
            setTitle(cadena);

        }
    }
    public static void main(String[] args)
    {
        ComboBox ventana = new ComboBox();
        ventana.setBounds(0,0,300,200);
        ventana.setLocationRelativeTo(null);
        ventana.setResizable(false);
        ventana.setDefaultCloseOperation(EXIT_ON_CLOSE);
        ventana.setVisible(true);
        ventana.setTitle("colores");
    }
}
