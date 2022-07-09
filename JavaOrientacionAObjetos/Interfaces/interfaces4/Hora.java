package POO.interfaces.Interfaces4;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Date;

public class Hora implements ActionListener
{
    public void actionPerformed(ActionEvent e)
    {
        Date ahora = new Date();

        System.out.println("La hora cada 5Seg es: "+ahora);

        Toolkit.getDefaultToolkit().beep();
    }

}
