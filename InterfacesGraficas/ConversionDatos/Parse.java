package InterfacesGraficas.ConversionDatos;

import javax.swing.*;
import java.awt.event.*;

public class Parse extends JFrame implements ActionListener
{
    private JLabel label1,label2,label3;
    private JTextField texto1,texto2;
    private JButton boton;


    public Parse()
    {
        setLayout(null);

        //label 1;
        label1 = new JLabel("Valor 1: ");
        label1.setBounds(20,10,80,30);
        add(label1);

        //text field 1
        texto1 = new JTextField();
        texto1.setBounds(120,10,200,30);
        add(texto1);

        //label 2
        label2 = new JLabel("valor 2");
        label2.setBounds(20,50,80,30);
        add(label2);

        //Text field 2
        texto2 = new JTextField();
        texto2.setBounds(120,50,200,30);
        add(texto2);

        //boton
        boton = new JButton("Sumar");
        boton.setBounds(20,100,100,30);
        add(boton);
        boton.addActionListener(this);

        //label 3
        label3 = new JLabel("resultado: ");
        label3.setBounds(150,100,100,30);
        add(label3);


    }

    public void actionPerformed(ActionEvent e)
    {
        if(e.getSource() == boton)
        {
            int num1 = 0,num2 = 0,resultado = 0;

            num1 = Integer.parseInt(texto1.getText()); //convertir string a entero
            num2 = Integer.parseInt(texto2.getText());
            resultado = num1 + num2;
            label3.setText("Resultado: "+resultado);
            texto1.setText("");
            texto2.setText("");
        }
    }
    public static void main(String[] args) 
    {
        Parse ventana = new Parse();
        ventana.setBounds(0,0,330, 180);
        ventana.setLocationRelativeTo(null);
        ventana.setResizable(false);
        ventana.setDefaultCloseOperation(EXIT_ON_CLOSE);
        ventana.setVisible(true);
    }
}
