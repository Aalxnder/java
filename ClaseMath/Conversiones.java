package ClaseMath.Conversiones;

import java.util.Scanner;

//convertir un angulo a radianes y biceversa
public class Conversiones
{
    public static void main(String[] args)
    {
        double angulo,AnguloRadianes;
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingresa los angulos a convertir a radianes: ");
        angulo = scanner.nextDouble();
        AnguloRadianes = Math.toRadians(angulo);
        System.out.println("el angulo "+angulo+" en radianes es: "+AnguloRadianes);

        angulo = Math.toDegrees(AnguloRadianes);
        System.out.println(AnguloRadianes +" en grados es: "+angulo);
    }
}
