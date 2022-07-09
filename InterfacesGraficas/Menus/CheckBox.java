package InterfacesGraficas.Menus;

import javax.swing.*;
import javax.swing.event.*;

public class CheckBox extends JFrame implements ChangeListener
{
    private JCheckBox checkBox1,checkBox2,checkBox3;

    public CheckBox()
    {
        setLayout(null);
        checkBox1 = new JCheckBox("Ingles");
        checkBox1.setBounds(10,10,150,30);
        checkBox1.addChangeListener(this); //declarar evento
        add(checkBox1);

        checkBox2 = new JCheckBox("Frances");
        checkBox2.setBounds(10,50,150,30);
        checkBox2.addChangeListener(this); //declarar evento
        add(checkBox2);

        checkBox3 = new JCheckBox("Aleman");
        checkBox3.setBounds(10,90,150,30);
        checkBox3.addChangeListener(this); //declarar evento
        add(checkBox3);
    }

    public void stateChanged(ChangeEvent e)
    {
        String cadena = "";
        if(checkBox1.isSelected() == true) //ver cual checkbox se usa
        {
            cadena = cadena += "Ingles-";

        }
        if(checkBox2.isSelected() == true)
        {
            cadena = cadena += "Frances-";
        }
        if(checkBox3.isSelected() == true)
        {
            cadena = cadena += "Aleman-";
        }
        setTitle(cadena);
    }
    public static void main(String[] args)
    {
        CheckBox ventana = new CheckBox();
        ventana.setBounds(0,0,350,200);
        ventana.setLocationRelativeTo(null);
        ventana.setResizable(false);
        ventana.setTitle("Checkbox");
        ventana.setDefaultCloseOperation(EXIT_ON_CLOSE);
        ventana.setVisible(true);
    }
}
