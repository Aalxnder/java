package Hilos.Hilos2Parametros;

public class Proceso extends Thread
{
    int numEntero;

    public Proceso(String NombreHilo)
    {
        super(NombreHilo); //indicar que usaremos un parametro
    }
    @Override
    public void run()
    {
        for(int i=0;i<=numEntero;i++)
        {
            System.out.println(i + this.getName()); //get name , getter en la clase threat
        }
        System.out.println("\n");
    }

    public void ValorCondicion(int valor)
    {
        this.numEntero = valor;
    }
}
