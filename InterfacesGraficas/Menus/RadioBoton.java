package InterfacesGraficas.Menus;

import javax.swing.*;
import javax.swing.event.*;
import java.awt.event.ActionEvent;

public class RadioBoton extends JFrame implements ChangeListener
{
    private JLabel label;
    private JRadioButton radio1,radio2,radio3;
    private ButtonGroup grupo1; //grupo de botones donde iran los radios

    public RadioBoton ()
    {
        setLayout(null);
        label = new JLabel("Seleccione una opcion");
        label.setBounds(10,10,150,30);
        add(label);

        grupo1 = new ButtonGroup();

        radio1 = new JRadioButton("300x250px");
        radio1.setBounds(10,50,100,30);
        radio1.addChangeListener(this);
        add(radio1);
        grupo1.add(radio1);


        radio2 = new JRadioButton("800x600px");
        radio2.setBounds(10,100,100,30);
        radio2.addChangeListener(this);
        add(radio2);
        grupo1.add(radio2);


        radio3 = new JRadioButton("680x400px");
        radio3.setBounds(10,150,100,30);
        radio3.addChangeListener(this);
        add(radio3);
        grupo1.add(radio3);
    }

    public void stateChanged(ChangeEvent e)
    {
        if(radio1.isSelected())
        {
            setSize(300,250);
        }
        if(radio2.isSelected())
        {
            setSize(800,600);
        }
        if(radio3.isSelected())
        {
            setSize(680,400);
        }
    }

    public static void main(String[] args)
    {
        RadioBoton ventana = new RadioBoton();
        ventana.setBounds(0,0,400,300);
        ventana.setLocationRelativeTo(null);
        ventana.setResizable(false);
        ventana.setDefaultCloseOperation(EXIT_ON_CLOSE);
        ventana.setTitle("Radio button");
        ventana.setVisible(true);
    }
}
