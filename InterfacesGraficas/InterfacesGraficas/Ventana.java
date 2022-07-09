package InterfacesGraficas.InterfazGraficas1;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Ventana extends JFrame implements ActionListener
{
    private JLabel label1;
    private JTextField textField1;
    private JButton button1;
    private JPanel panel;

    public Ventana()
    {

        this.setContentPane(panel);
        this.setTitle("Prueba");
        this.setSize(300,120);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);
        button1.addActionListener(this);
        this.setLocationRelativeTo(null);
    }
    @Override
    public void actionPerformed(ActionEvent e)
    {
        if(e.getSource()==button1)
        {
            String nombre = textField1.getText();
            if(nombre.equals(""))
            {
                JOptionPane.showMessageDialog(null,"No has introducido nada, nada para mostrar");
            }
            else
            {
                JOptionPane.showMessageDialog(null,"Hola "+nombre);
                textField1.setText("");
            }
        }
    }
    public static void main(String[] args)
    {
        Ventana ventana = new Ventana();
    }

}
