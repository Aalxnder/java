package POO.Constructor;

import java.util.Scanner;

public class ConConstructor
{
    public ConConstructor()
    {
        Scanner scanner = new Scanner(System.in);
        String nombre = "";
        System.out.println("Ingrese su nombre: ");
        nombre = scanner.nextLine();
        System.out.println("Su nombre es: "+nombre);
    }
}
