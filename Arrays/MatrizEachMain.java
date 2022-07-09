package Arrays.MatricesForEach;

import javax.swing.*;

public class MatrizEachMain
{
    public static void main(String[] args)
    {
        int matrix[][] = new int[3][3];

        for(int i=0;i<3;i++)
        {
            for(int j=0;j<3;j++)
            {
                matrix[i][j]= Integer.parseInt(JOptionPane.showInputDialog("Ingresa la posicion "+i+","+j+":"));
            }
        }

        for(int[] filas:matrix)
        {
            System.out.println();
            for(int columna: filas)
            {
                System.out.print(columna + " ");
            }
        }
    }
}
