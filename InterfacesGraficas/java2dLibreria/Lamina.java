package InterfacesGraficas.java2dLibreria;

import javax.swing.*;
import java.awt.*;
import java.awt.geom.*;

public class Lamina extends JPanel
{
    public void paintComponent(Graphics g)
    {
        super.paintComponent(g);

        Graphics2D g2 = (Graphics2D) g;  //refundir el objeto

        Rectangle2D rectangulo = new Rectangle2D.Double(100,100,200,150);
        g2.draw(rectangulo);

        Ellipse2D circulo = new Ellipse2D.Double();
        circulo.setFrame(rectangulo);
        g2.draw(circulo);

        g2.draw(new Line2D.Double(100,100,300,200));

        double centroX = rectangulo.getCenterX();
        double centroY = rectangulo.getCenterY();
        double radio = 150;
        Ellipse2D circulo1 = new Ellipse2D.Double();
        circulo1.setFrameFromCenter(centroX,centroY,centroX+radio,centroY+radio);
        g2.draw(circulo1);
    }
}
