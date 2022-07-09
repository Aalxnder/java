package Hilos.SincronizacionHilos;

public class Hilo3 extends Thread
{
    @Override
    public void run()
    {
        for(int i=0;i<=5;i++)
        {
            System.out.print("E");
            try
            {
                Hilo3.sleep(1200);
            }
            catch(InterruptedException e)
            {
                System.out.println("Error en la clase hilo3 "+e);
            }
        }
    }
}
