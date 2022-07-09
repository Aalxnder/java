package Arrays.Matrices;

import javax.swing.*;

public class MatricesMain
{
    public static void main(String[] args)
    {
        int matrix[][] = new int[3][2];

        for(int i=0;i<3;i++)
        {
            for(int j=0;j<2;j++)
            {
                matrix[i][j]= Integer.parseInt(JOptionPane.showInputDialog("Ingresa la posicion "+i+","+j+":"));
            }
        }
        for(int i=0;i<3;i++)
        {
            System.out.println();
            for(int j=0;j<2;j++)
            {
                System.out.print(matrix[i][j]+" ");
            }

        }
    }
}
