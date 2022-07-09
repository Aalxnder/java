package ClaseMath.NumAleatorios;

import java.util.Scanner;

public class MatrizRandom
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingresa las filas: ");
        int filas = scanner.nextInt();
        System.out.println("Ingresa las columnas: ");
        int columnas = scanner.nextInt();

        int[][] matriz = new int[filas][columnas];
        for(int i = 0;i<filas;i++)
        {
            for (int j = 0;j<columnas;j++)
            {
                matriz[i][j] = (int)(Math.random() * 100);
            }
        }
        System.out.println("Matriz random: ");
        for(int i = 0;i<filas;i++)
        {
            for(int j = 0;j<columnas;j++)
            {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }

    }
}
