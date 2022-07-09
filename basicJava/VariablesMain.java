package BasicJava;

import java.util.Scanner;

public class VariablesMain
{
    public static void main(String[] args)
    {
        int num1;
        int num2;
        int suma;
        Scanner numeros = new Scanner(System.in);
        System.out.println("Ingresa el primer numero");
        num1 = numeros.nextInt();
        System.out.println("Ingresa el segundo numero");
        num2 = numeros.nextInt();
        suma = num1+ num2;
        System.out.println("La suma es "+suma);
    }
}
