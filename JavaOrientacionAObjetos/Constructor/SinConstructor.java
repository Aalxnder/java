package POO.Constructor;

import java.util.Scanner;

public class SinConstructor
{
    private Scanner scanner = new Scanner(System.in);
    String nombre;
    public void pedirNombre()
    {
        System.out.print("Ingrese su nombre: ");
        nombre = scanner.nextLine();
    }
    public void imprimir()
    {
        System.out.println("Su nombre es: " + nombre);
    }
}
