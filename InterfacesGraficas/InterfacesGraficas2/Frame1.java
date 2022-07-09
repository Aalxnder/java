package InterfacesGraficas.interfacesGraficas2;

import javax.swing.*;
import java.awt.*;

public class Frame1 extends JFrame
{
    public Frame1()
    {
        //Extraer tamaño de pantalla
        Toolkit pantalla = Toolkit.getDefaultToolkit();
        Dimension pixeles = pantalla.getScreenSize();

        int altura = pixeles.height;
        int ancho = pixeles.width;

        setSize(ancho/2,altura/2);
        setLocation(ancho/4,altura/4);
        setTitle("Ventana dos en JavaGOD");
        Image icono = pantalla.getImage("images/icono.png");
        setIconImage(icono);
    }
}
