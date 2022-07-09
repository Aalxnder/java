package recursividad;

public class Recursividad1
{
    public void imprimir(int x)
    {
        if(x <= 5)
        {
            System.out.print(x + " ");
            imprimir(x+1);
        }
        else
        {
            System.out.println("");
        }
    }

    public static void main(String[] args)
    {
        Recursividad1 r = new Recursividad1();
        r.imprimir(0);
    }
}
