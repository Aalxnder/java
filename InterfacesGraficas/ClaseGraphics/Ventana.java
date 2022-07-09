package InterfacesGraficas.ClaseGraphics;

import javax.swing.*;
import java.awt.*;

public class Ventana extends JFrame
{

    private JPanel panel;
    public Ventana()
    {
        this.setContentPane(panel);
        this.setTitle("clase graphics");
        this.setBounds(0,0,600,600);
        this.setLocationRelativeTo(null);

    }
    public static void main(String[] args)
    {
//        Ventana ventana = new Ventana();
//        ventana.setVisible(true);
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Ventana().setVisible(true);
            }
        });
    }

    public void paint(Graphics g)
    {
        super.paint(g);
        g.setColor(Color.BLUE);
        g.drawLine(0,70,100,100);
        g.drawRect(100,100,100,100);
        g.drawRect(200,200,100,100);
        g.drawRoundRect(300,300,100,100,20,20);
        g.drawOval(100,100,100,100);
        int vectorX [] = {500,550,450};
        int vextorY [] = {70,120,120};
        g.drawPolygon(vectorX,vextorY,3);
        //rellenar figuras
        g.setColor(Color.RED);
        g.fillRect(100,100,100,100);
        g.fillRoundRect(300,300,100,100,20,20);
    }
}

