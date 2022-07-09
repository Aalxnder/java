package ClaseMath.NumAleatorios;

public class Random
{
    public static void main(String[] args)
    {
        int random = 0;

        random = (int)(Math.random() * 100); //Generar un numero aleatorio entre 0 y 100 y convertirlo a int
        System.out.println("El numero aleatorio es: " + random);
    }
}
