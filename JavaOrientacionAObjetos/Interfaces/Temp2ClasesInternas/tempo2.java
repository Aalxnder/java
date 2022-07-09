package POO.interfaces.Temp2ClasesInternas;

import javax.swing.*;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Date;

public class tempo2
{

    public void enMarcha(int tiempo,final boolean sonido)
    {
        class Hora implements ActionListener
        {
            public void actionPerformed(ActionEvent evento)
            {
                Date ahora = new Date();
                System.out.println("Imprime la hora cada 3 seg: "+ahora);

                if(sonido == true)
                {
                    Toolkit.getDefaultToolkit().beep();
                }
            }
        }
        ActionListener oyente = new Hora();

        Timer temp = new Timer(tiempo,oyente);

        temp.start();
    }

}
