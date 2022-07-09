package InterfacesGraficas.Botones;

import javax.swing.*;
import javax.swing.event.*;
import java.awt.event.*;

public class Terminos extends JFrame implements ChangeListener, ActionListener
{
    private JCheckBox check1;
    private JButton boton;
    private JLabel label1;

    public Terminos()
    {
        setLayout(null);

        //label
        label1 = new JLabel("Aceptar Terminos y condiciones");
        label1.setBounds(10,10,400,30);
        add(label1);

        //CheckBox
        check1 = new JCheckBox("Acepto");
        check1.setBounds(10,50,150,30);
        check1.addChangeListener(this); //evento
        add(check1);

        //boton
        boton = new JButton("continuar");
        boton.setBounds(10,100,100,30);
        boton.addActionListener(this);
        add(boton);
        boton.setEnabled(false); //Esperar a que el boton este habilitado o desabilitado
    }

    public void stateChanged(ChangeEvent e)
    {
        if(check1.isSelected() == true)
        {
            boton.setEnabled(true);
        }
        else
        {
            boton.setEnabled(false);
        }
    }

    public void actionPerformed(ActionEvent e)
    {
        if(e.getSource() == boton)
        {
            System.exit(0);
        }
    }
    public static void main(String[] args)
    {
        Terminos ventana = new Terminos();
        ventana.setBounds(0,0,350,200);
        ventana.setLocationRelativeTo(null);
        ventana.setTitle("Terminos y condiciones");
        ventana.setDefaultCloseOperation(EXIT_ON_CLOSE);
        ventana.setResizable(false);
        ventana.setVisible(true);
    }
}
