package InterfacesGraficas.Laminas;

import javax.swing.*;
import java.awt.*;

public class Lamina extends JPanel
{
    @Override
    public void paintComponent(Graphics g)
    {
        super.paintComponent(g);
        g.drawString("Textos en swing",100,100);
    }
}
