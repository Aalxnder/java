package InterfacesGraficas.DibujosFrame;

import javax.swing.*;
import java.awt.*;

public class LaminaFiguras extends JPanel
{
    @Override
    public void paintComponent(Graphics g)
    {
        super.paintComponent(g);

        g.drawArc(50,100,100,200,120,150);
    }
}
