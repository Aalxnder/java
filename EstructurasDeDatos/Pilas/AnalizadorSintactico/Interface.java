package EstructurasDeDatos.Pilas.AnalizadorSintactico;

import javax.swing.*;
import java.awt.event.*;

public class Interface extends JFrame implements ActionListener
{
    private JLabel label;
    private JTextField textField1;
    private JButton validarExpresionButton;
    private JPanel panel;

    public Interface()
    {
        textField1.setText("(3*{7-6}-{3*7}-[6*3])");
        setContentPane(panel);
        validarExpresionButton.addActionListener(this);
        this.setVisible(true);
        this.setResizable(false);
        this.setBounds(0,0,300,120);
        this.setLocationRelativeTo(null);
    }
    public void actionPerformed(ActionEvent e)
    {
        if(e.getSource() == validarExpresionButton)
        {
            if(ValidarExpresion())
            {
                JOptionPane.showMessageDialog(null,"La expresion es valida");
            }
            else
            {
                JOptionPane.showMessageDialog(null,"La expresion no es valida");
            }
        }
    }

    public static void main(String[] args)
    {
        Interface ventana = new Interface();
    }
    //validar la expresion
    public boolean ValidarExpresion()
    {
        Pila pila = new Pila();
        String cadena = textField1.getText();
        for (int i = 0;i<cadena.length();i++) {
            //comparar si es una llave abierta
            if (cadena.charAt(i) == '(' || cadena.charAt(i) == '[' || cadena.charAt(i) == '{') {
                pila.insertar(cadena.charAt(i));
            }
            else
            //comparar si es una llave cerrada
            {
                if(cadena.charAt(i) == ')')
                {
                    if(pila.extraerInfo() != '(')
                    {
                        return false;
                    }
                }
                else
                {
                    if(cadena.charAt(i) == ']')
                    {
                        if(pila.extraerInfo() != '[')
                        {
                            return false;
                        }
                    }
                    else
                    {
                        if(cadena.charAt(i) == '}')
                        {
                            if(pila.extraerInfo() != '{')
                            {
                                return false;
                            }
                        }
                    }
                }
            }
        }
        return pila.pilavacia();
    }
}
