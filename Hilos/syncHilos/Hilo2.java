package Hilos.SincronizacionHilos;

public class Hilo2 extends Thread
{
    @Override
    public void run()
    {
        for(int i=0;i<=5;i++)
        {
            System.out.print("E");
            try
            {
                Hilo2.sleep(1200);
            }
            catch(InterruptedException e)
            {
                System.out.println("Error en la clase hilo2 "+e);
            }
        }
    }
}
