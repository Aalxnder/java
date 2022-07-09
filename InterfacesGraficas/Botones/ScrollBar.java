package InterfacesGraficas.Botones;

import javax.swing.*;

public class ScrollBar extends JFrame
{
    private JLabel label1, label2;
    private JTextField texto;
    private JTextArea area;
    private JScrollPane scroll;

    public ScrollBar()
    {
        setLayout(null);

        //label
        label1 = new JLabel("Text Field");
        label1.setBounds(30,25,100,30);
        add(label1);

        //text field
        texto = new JTextField();
        texto.setBounds(140,30,200,30);
        add(texto);

        //label 2
        label2 = new JLabel("Text area");
        label2.setBounds(30,70,100,30);
        add(label2);

        //text Area
        area = new JTextArea();
        scroll = new JScrollPane(area); //agregar el scroll al area
        scroll.setBounds(140,75,200,100);
        add(scroll);
        //el text area se adaptara al scroll pane pq esta dentro de el
    }

    public static void main(String[] args)
    {
        ScrollBar ventana = new ScrollBar();
        ventana.setBounds(0,0,350,250);
        ventana.setLocationRelativeTo(null);
        ventana.setResizable(false);
        ventana.setTitle("ScrollBar");
        ventana.setVisible(true);
        ventana.setDefaultCloseOperation(EXIT_ON_CLOSE);
    }
}
