package Arrays.Matrices;

import java.util.Scanner;

//para sumar matrices tienen que tener la misma cantidad de filas y columnas
//por ejemplo se sumara matriz1[0][0] + matriz2[0][0] y se guardara en matrizResultado[0][0]
public class SumaMatrices
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingresa la cantidad de filas: ");
        int filas = scanner.nextInt();
        System.out.println("Ingresa la cantidad de columnas: ");
        int columnas = scanner.nextInt();

        int[][] matriz1 = new int[filas][columnas];
        int[][] matriz2 = new int[filas][columnas];
        int[][] Resultado = new int[filas][columnas];

        //llenar matriz1
        for(int i=0;i<matriz1.length;i++)
        {
            for(int j = 0;j<matriz1.length;j++)
            {
                matriz1[i][j] = (int)(Math.random()*10);

            }
        }
        //llenar matriz2
        for(int i=0;i<matriz2.length;i++)
        {
            for(int j = 0;j<matriz2.length;j++)
            {
                matriz2[i][j] = (int)(Math.random()*10);
            }
        }

        //sumar o restar matricesmatrices
        for(int i=0;i<matriz1.length;i++)
        {
            for(int j=0;j< matriz1.length;j++)
            {
                Resultado[i][j] = matriz1[i][j] + matriz2[i][j];
//                Resultado[i][j] = matriz1[i][j] - matriz2[i][j];
            }

        }

        //imprimir matrices
        for(int i=0;i<matriz1.length;i++)
        {
            //for para recorrer la matriz 1
            for(int j=0;j<matriz1.length;j++)
            {
                System.out.print("[ "+matriz1[i][j] + " ]");
            }

            if(i==1)
            {
                System.out.print("    +   ");
            }
            else
            {
                System.out.print("        ");
            }

            //for para recorrer la matriz 2
            for(int j=0;j<matriz2.length;j++)
            {
                System.out.print("[ "+matriz2[i][j]+" ]");
            }

            if(i==1)
            {
                System.out.print("    =   ");
            }
            else
            {
                System.out.print("        ");
            }

            //Imprimir el resultado
            for(int j=0;j<Resultado.length;j++)
            {
                System.out.print("[ "+Resultado[i][j]+" ]");
            }
            System.out.println("");
        }
    }
}
