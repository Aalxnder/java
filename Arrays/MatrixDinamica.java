package Arrays.Matrices;

import javax.swing.*;

public class MatrixDinamica
{
    public static void main(String[] args)
    {
        int filas ,columnas;
        filas = Integer.parseInt(JOptionPane.showInputDialog("Ingresa el numero de filas"));
        columnas = Integer.parseInt(JOptionPane.showInputDialog("Ingresa el numero de columnas"));

        int matrix[][] = new int [filas][columnas];
        int cont = 1;

        for(int i=0; i<filas;i++)
        {
            for(int j=0;j<columnas;j++)
            {
                matrix[i][j] = cont;
                cont ++;
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println("");
        }
    }
}
