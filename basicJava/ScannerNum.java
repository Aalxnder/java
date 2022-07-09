package BasicJava;

import java.util.Scanner;

public class ScannerNum
{
    public static void main(String[] args)
    {
        String nombre;
        int num1,num2,resultado;
        Scanner escaner = new Scanner(System.in);

        System.out.println("Ingresa tu nombre: ");
        nombre = escaner.nextLine();

        System.out.println("Ingresa el primer numero");
        num1 = escaner.nextInt();

        System.out.println("Ingresa el segundo numero");
        num2 = escaner.nextInt();

        resultado = num1+num2;
        System.out.println("El resultado del usuario "+nombre +" es: "+resultado);
    }
}
