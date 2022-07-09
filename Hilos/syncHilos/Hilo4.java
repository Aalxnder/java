package Hilos.SincronizacionHilos;

public class Hilo4 extends Thread
{
    @Override
    public void run()
    {
        for(int i=0;i<=5;i++)
        {
            System.out.print("K\n");
            try
            {
                Hilo1.sleep(1200);
            }
            catch(InterruptedException e)
            {
                System.out.println("Error en la clase hilo4 "+e);
            }
        }
    }
}
