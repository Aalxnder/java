package POO.interfaces.Temp2ClasesInternas;

import javax.swing.*;

public class Temp2Main
{
    public static void main(String[] args)
    {
        tempo2 miReloj = new tempo2();

        miReloj.enMarcha(3000, true);

        JOptionPane.showMessageDialog(null,"Pulsa aceptar para terminar");

        System.exit(0);
    }
}
