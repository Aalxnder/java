package ClaseMath.NumAleatorios;

import java.util.Scanner;

public class VectorRandom
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingresa la longitud del vector: ");
        int cant = scanner.nextInt();
        int[] vector = new int[cant];
        for(int i = 0;i<vector.length; i++)
        {
            vector[i] = (int)(Math.random() * 100);
        }
        System.out.println("Vector random: ");
        for(int i = 0;i<vector.length; i++)
        {
            System.out.print(vector[i] + " ");
        }
    }
}
