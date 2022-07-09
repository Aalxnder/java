package BasicJava;

import java.util.Scanner;

public class OperadoresAritmeticos
{
    public static void main(String[] args)
    {
        int num1;
        int num2;
        int resultado;
        Scanner escaner = new Scanner(System.in);

        System.out.println("Ingresa el numero 1");
        num1 = escaner.nextInt();

        System.out.println("Ingresa el numero 2");
        num2 = escaner.nextInt();

        resultado = (num1+num2)^2;

        System.out.println("El resultado es "+resultado);
    }
}
