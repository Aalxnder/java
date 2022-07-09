package InterfacesGraficas.InterfacesChidas.InterfaceChidaPrueba2;

import javax.swing.*;
import java.awt.event.*;

public class prueba extends JFrame implements ActionListener
{
    private JLabel LabelFirstName;
    private JPanel Panel;
    private JLabel LastName;
    private JTextField textField1;
    private JTextField textField2;
    private JButton button1;
    private JButton button2;
    public prueba()
    {
        this.setContentPane(Panel);
        this.setTitle("Prueba");
        this.setSize(300,200);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);
        button1.addActionListener(this);
        button2.addActionListener(this);
        this.setLocationRelativeTo(null);

    }
    public void actionPerformed(ActionEvent e)
    {
        if(e.getSource()==button1)
        {
            String nombre = textField1.getText();
            String apellido = textField2.getText();
            JOptionPane.showMessageDialog(null,"Hola "+nombre+" "+apellido);
        }
        if(e.getSource()==button2)
        {
            String nombre = textField1.getText();
            String apellido = textField2.getText();
            JOptionPane.showMessageDialog(null,"adios "+nombre+" "+apellido);
        }
    }
    public static void main(String[] args)
    {
        prueba prueba = new prueba();
    }
}
