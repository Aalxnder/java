package InterfacesGraficas.interfacesGraficas2;

import javax.swing.*;

public class ColocarFrame
{
    public static void main(String[] args)
    {
        Frame1 ventana = new Frame1();
        ventana.setVisible(true);
        ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        ventana.setResizable(true);
    }
}
