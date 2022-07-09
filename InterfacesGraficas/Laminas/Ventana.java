package InterfacesGraficas.Laminas;

import javax.swing.*;
import java.awt.*;
import java.awt.image.ImageObserver;
import java.awt.image.ImageProducer;

public class Ventana extends JFrame
{
    public Ventana()
    {
        Toolkit pantalla = Toolkit.getDefaultToolkit();
        Dimension pixeles = pantalla.getScreenSize();

        int altura = pixeles.height;
        int ancho = pixeles.width;

        setVisible(true);
        setResizable(false);
        Lamina lamina = new Lamina();
        add (lamina);

        setBounds(ancho/4,altura/4,ancho/2,altura/2);

        Image icono = pantalla.getImage("images/icono.png");
        setIconImage(icono);

        setTitle("Ventana con texto en java");

        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }
}
