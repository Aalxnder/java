package InterfacesGraficas.Botones;

import javax.swing.*;

public class TextArea extends JFrame
{
    private JTextField texto;
    private JTextArea area ;
    private JLabel label1,label2;
    public TextArea()
    {
        setLayout(null);

        //label1
        label1 = new JLabel("Text field");
        label1.setBounds(30,25,100,30);
        add(label1);

        //Text field
        texto = new JTextField();
        texto.setBounds(140,30,200,30);
        add(texto);

        //label 2
        label2 = new JLabel("Text Area");
        label2.setBounds(30,70,100,30);
        add(label2);

        //text area
        area = new JTextArea();
        area.setBounds(140,75,200,100);
        add(area);
    }

    public static void main(String[] args)
    {
        TextArea ventana = new TextArea();
        ventana.setBounds(0,0,350,250);
        ventana.setLocationRelativeTo(null);
        ventana.setResizable(false);
        ventana.setVisible(true);
    }
}
