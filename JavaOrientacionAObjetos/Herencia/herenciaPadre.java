package POO.Herencia;

import java.util.Scanner;

public class herenciaPadre
{
    Scanner escaner = new Scanner(System.in);
    protected int numero1, numero2,resultado;

    //Metodo de pedir los valores al usuario
    public void pedirDatos()
    {
        System.out.println("Ingresa el primer valor: ");
        numero1 = escaner.nextInt();

        System.out.println("Ingresa el segundo valor: ");
        numero2 = escaner.nextInt();
    }
    public void mostrarResultado()
    {
        System.out.println("Resultado: "+resultado);
    }
}
