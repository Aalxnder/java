package Arrays.arrays1;

import javax.swing.*;

public class arraysMain
{
    public static void main(String[] args)
    {

        int num[] = new int [5];

        for(int i=0; i<num.length; i++)
        {
            num[i] = Integer.parseInt(JOptionPane.showInputDialog("Ingresa el numero de la posicion "+i));
        }
        //System.out.println(num[0]);
        for(int i=0;i<num.length;i++)
        {
            JOptionPane.showMessageDialog(null,"Valor del indice "+i+": "+num[i]);
        }
    }

}
