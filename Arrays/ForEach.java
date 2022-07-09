package Arrays.BucleForEach;

import javax.swing.*;

public class ForEach
{
    public static void main(String[] args)
    {
        String vector[] = new String[8];   //Este for each almacenara paises

        for(int i=0;i<vector.length;i++)
        {
            vector[i]= JOptionPane.showInputDialog("Ingresa el pais numero "+i+":");
        }
        for(String pais:vector)
        {
            System.out.println("Pais: "+pais);
        }
    }
}
