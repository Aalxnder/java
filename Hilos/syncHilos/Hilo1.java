package Hilos.SincronizacionHilos;

public class Hilo1 extends Thread
{
    @Override
    public void run()
    {
        for(int i=0;i<=5;i++)
        {
            System.out.print("G");

            try
            {
                Hilo1.sleep(1200);
            }
            catch(InterruptedException e)
            {

                System.out.println("Error en la clase hilo1 "+e);
            }
        }
    }
}
