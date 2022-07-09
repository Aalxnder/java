package InterfacesGraficas.java2dLibreria;

import javax.swing.*;
import java.awt.*;
import java.awt.geom.*;

public class Ventanafiguras2d extends JFrame
{
    public Ventanafiguras2d()
    {
        Toolkit pantalla = Toolkit.getDefaultToolkit();
        Dimension pixeles = pantalla.getScreenSize();
        int altura = pixeles.height;
        int ancho = pixeles.width;

        setVisible(true);
        setResizable(false);
        setBounds(ancho/4,altura/4,ancho/2,altura/2);

        Image imagen = pantalla.getImage("images/icono.png");
        setIconImage(imagen);

        setTitle("Figuras con la libreria java2D");

        Lamina lamina = new Lamina();
        add(lamina);



    }
}
