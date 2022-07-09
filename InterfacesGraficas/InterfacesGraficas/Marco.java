package InterfacesGraficas.InterfazGraficas1;

import javax.swing.*;
import java.awt.*;

public class Marco extends JFrame
{
    public Marco()
    {
        //setSize(600,400);
        //setLocation(400,150);
        setBounds(400,150,600,400);
        setResizable(true);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //(Cerrar programa)
        //MaximizarPantalla
        //setExtendedState(Frame.MAXIMIZED_BOTH);
        setTitle("Primera Interfaz En javaGOD");
    }
}
