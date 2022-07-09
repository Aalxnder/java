package InterfacesGraficas.InterfazGraficas1;

import java.awt.event.*;
import javax.swing.*;

public class Prueba extends JFrame implements ActionListener
{
    private JLabel label1;
    private JTextField texto;
    private JButton boton;

    public Prueba()
    {
        setLayout(null);
        getContentPane().setBackground(new java.awt.Color(224, 224, 224));

        label1 = new JLabel("Introduce algo");
        label1.setBounds(10, 10, 100, 20);
        label1.setFont(new java.awt.Font("Arial", 0, 14));
        label1.setForeground(new java.awt.Color(0, 0, 0));
        this.add(label1);

        texto = new JTextField();
        texto.setBounds(130,10,150,20);
        this.add(texto);

        boton = new JButton("Aceptar");
        boton.setBounds(10,50,100,20);
        boton.addActionListener(this);
        this.add(boton);
    }

    public void actionPerformed(ActionEvent e)
    {
        if(e.getSource() == boton)
        {
            String textoExtraido = texto.getText();
            if(textoExtraido.equals(""))
            {
                JOptionPane.showMessageDialog(null,"Primero ingresa algo en el campo");
            }
            else
            {
                JOptionPane.showMessageDialog(null, textoExtraido);
                texto.setText("");
            }
        }
    }
    public static void main(String[] args)
    {
        Prueba ventana = new Prueba();
        ventana.setSize(300, 110);
        ventana.setResizable(false);
        ventana.setTitle("Prueba");
        ventana.setDefaultCloseOperation(EXIT_ON_CLOSE);
        ventana.setVisible(true);
        ventana.setLocationRelativeTo(null);
    }
}
