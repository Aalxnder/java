package ClaseMath.NumAleatorios;
import java.util.Random;
public class Random2
{
    public static void main(String[] args)
    {
        int random = 0;

        Random Random = new Random();
        random = (int)(Random.nextDouble() * 100); //Generar un numero aleatorio entre 0 y 100 y convertirlo a int
        System.out.println("El numero aleatorio es: " + random);
    }
}
