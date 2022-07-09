package Hilos.Hilos1;

public class Proceso1 extends Thread //Clase en java jdk
{
    @Override
    public void run() //metodo en la clase Thread
    {
        for (int i=0; i<=5;i++)
        {
            System.out.println("Proceso 1");
        }
    }
}
