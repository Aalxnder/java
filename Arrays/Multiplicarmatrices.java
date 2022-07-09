package Arrays.Matrices;

import java.util.Scanner;

public class Multiplicarmatrices
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        //datos de la primer matrix
        System.out.println("Ingresa las filas de la matriz A: ");
        int filasA = scanner.nextInt();
        System.out.println("Ingresa las columnas de la matriz A: ");
        int columnasA = scanner.nextInt();
        //datos de la segunda matrix
        System.out.println("Ingresa las filas de la matriz B: ");
        int filasB = scanner.nextInt();
        System.out.println("Ingresa las columnas de la matriz B: ");
        int columnasB = scanner.nextInt();

        while((filasA != columnasB)|| (columnasA != filasB))
        {
            System.out.println("Las matrices no son multiplicables");
            System.out.println("Ingresa las filas de la matriz A: ");
            filasA = scanner.nextInt();
            System.out.println("Ingresa las columnas de la matriz A: ");
            columnasA = scanner.nextInt();
            System.out.println("Ingresa las filas de la matriz B: ");
            filasB = scanner.nextInt();
            System.out.println("Ingresa las columnas de la matriz B: ");
            columnasB = scanner.nextInt();
        }
        int matriz1[][] = new int[filasA][columnasA];
        int matriz2[][] = new int[filasB][columnasB];
        int Resultado[][] = new int[filasA][columnasB];

        //llenar la matriz 1
        try
        {
            for(int i = 0; i<filasA; i++)
            {
                for(int j = 0;j<columnasA;j++)
                {
                    matriz1[i][j] = (int)(Math.random()*5);
                }
            }

            //llenado de matriz 2
            for(int i = 0;i<filasB;i++)
            {
                for(int j = 0;j<columnasB;j++)
                {
                    matriz2[i][j] = (int)(Math.random()*5);
                }
            }

            //multiplicacion de las matrices
            for(int i = 0;i<filasA;i++)
            {
                for(int j = 0;j<columnasB;j++)
                {
                    for(int k = 0;k<columnasA;k++)
                    {
                        Resultado[i][j] += matriz1[i][k] * matriz2[k][j];
                    }
                }
            }
        }
        catch(Exception e)
        {
            System.out.println("Error, matrices demasiado grandes "+e);
        }

            //imprimir matrices(prueba)
        try
        {
            for(int i = 0;i<filasA;i++)
            {
                //primer matriz
                for(int j = 0;j<columnasA;j++)
                {
                    System.out.print(matriz1[i][j] + " ");
                }
                if(i==1)
                {
                    System.out.print("    *   ");
                }
                else
                {
                    System.out.print("        ");
                }

                //matriz2
                for(int j = 0;j<columnasB;j++)
                {
                    System.out.print(matriz2[i][j] + " ");
                }

                if(i==1)
                {
                    System.out.print("    =   ");
                }
                else
                {
                    System.out.print("        ");
                }

                //resultado
                for(int j = 0;j<columnasB;j++)
                {
                    System.out.print(Resultado[i][j] + " ");
                }
                System.out.println("");
            }
        }
        catch(Exception e)
        {
            System.out.println("Error, matrices demasiado grandes "+e);
        }

    }
}
