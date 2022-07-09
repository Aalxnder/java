package InterfacesGraficas.DibujosFrame;

import javax.swing.*;
import java.awt.*;

public class Ventana extends JFrame
{
    public Ventana()
    {
        Toolkit pantalla = Toolkit.getDefaultToolkit();
        Dimension pixeles = pantalla.getScreenSize();
        int altura = pixeles.height;
        int ancho = pixeles.width;

        setBounds(ancho/4,altura/4,ancho/2,altura/2);
        setVisible(true);
        setResizable(false);


        setTitle("Dibujando figuras en Java");
        Image imagen = pantalla.getImage("images/icono.png");
        setIconImage(imagen);

        LaminaFiguras lamina = new LaminaFiguras();
        add(lamina);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }
}
