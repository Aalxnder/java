package InterfacesGraficas.colores;
import javax.swing.*;
import java.awt.*;
import java.awt.geom.*;


public class MarcoColor extends JFrame
{
    public MarcoColor()
    {
        setTitle("prueba con colores");
        setSize(400,400);

        LaminaColor lamina1 = new LaminaColor();
        add(lamina1);
        lamina1.setBackground(SystemColor.window);
    }


}
