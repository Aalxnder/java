package BasicJava;

import java.util.Scanner;

public class CondicionalesIf
{
    public static void main(String[] args)
    {
        int mate, biologia, quimica, promedio;
        Scanner escaner = new Scanner(System.in);

        System.out.println("Ingresa la calificacion de la materia de matematicas");
        mate = escaner.nextInt();
        while(mate > 100 || mate < 0)
        {
            System.out.println("Ingresa una calificacion valida(0-100)");
            System.out.println("Ingresa nuevamente la calificacion de la materia de matematicas");
            mate = escaner.nextInt();
        }


        System.out.println("Ingresa la calificacion de la materia de biologia");
        biologia = escaner.nextInt();
        while(biologia > 100 || biologia < 0)
        {
            System.out.println("Ingresa una calificacion valida(0-100)");
            System.out.println("Ingresa nuevamente la calificacion de la materia de biologia");
            biologia = escaner.nextInt();
        }


        System.out.println("Ingresa la calificacion de la materia de quimica");
        quimica = escaner.nextInt();
        while(quimica > 100 || quimica < 0)
        {
            System.out.println("Ingresa una calificacion valida(0-100)");
            System.out.println("Ingresa nuevamente la calificacion de la materia de quimica");
            quimica = escaner.nextInt();
        }

        promedio = (mate+biologia+quimica)/3;

        System.out.println("El promedio del alumno es de "+promedio);

        if (promedio >= 60)
        {
            System.out.println("El alumno ha aprobado el semestre");
        }
        else
        {
            System.out.println("EL alumno mamo el semestre, jaja que pendejo");
        }
    }
}
