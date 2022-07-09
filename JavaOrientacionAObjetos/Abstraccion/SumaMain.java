package POO.Abstraccion;

import java.util.Scanner;

public class SumaMain
{
    public static void main(String[] args)
    {
        Scanner escaner = new Scanner(System.in);

        System.out.println("ingresa el valor 1");
        int valor1 = escaner.nextInt();

        System.out.println("ingresa el valor 2");
        int valor2 = escaner.nextInt();
        Suma suma = new Suma(valor1, valor2);
        suma.imprimir();

    }
}
