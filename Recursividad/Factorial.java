package recursividad;

public class Factorial
{
    //sacar facotorial de un numero
    public int factorial(int n)
    {
        if(n == 0)
        {
            return 1;
        }
        else
        {
            int valor = n * factorial(n-1);
            return valor;
        }
    }

    public static void main(String[] args)
    {
        Factorial f = new Factorial();
        System.out.println(f.factorial(8));
    }
}
