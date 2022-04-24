/*
Agradecimientos especiales a Lady Alejandra Naravaz Carranza por pasarme la info de los personajes usados
en este codigo pq yo no se un carajo de harry potter #Fuerzajhonny #TeAmoRobert
 */

package PracticaHarry;

public class HarryMain
{
    public static void main(String[] args)
    {
        //primer personaje
        PersonajeHarry hermione = new PersonajeHarry("hermione Granger","Griffindor","femenino",
                "nutria","ver a ron y harry muertos");
        System.out.println(hermione.toString());
        System.out.println("\n");
        //segundo personaje
        PersonajeHarry harry = new PersonajeHarry("Harry potter","Griffindor","masculino",
                "Ciervo","Dementor");
        System.out.println(harry.toString());
        System.out.println("\n");
        PersonajeHarry snape = new PersonajeHarry("Snape","Slytherin","masculino",
                "cierva","Volver a ver a lily muerta");
        System.out.println(snape.toString());

        System.out.println("\n");
        PersonajeHarry luna = new PersonajeHarry("Luna Lovegood","Ravenclaw","femenino"
                ,"liebre","ver muerto a su padre o que la enterraran viva");
        System.out.println(luna.toString());

        System.out.println("\n");

        PersonajeHarry draco = new PersonajeHarry("Draco Malfoy","Slytherin","masculino",
                "no tiene patronus","Voldemort o su padre");
        System.out.println(draco.toString());
    }
}
