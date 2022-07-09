package Hilos.EstadosDeHilo;

public class HiloProceso extends Thread
{
    @Override
    public void run()
    {
        for(int i=0;i<=5;i++)
        {
            System.out.println(i+" "+getName());
            try
            {
                HiloProceso.sleep(1000); //como estamos heredando de la clase Threat no se tiene que intanciar
            }
            catch(InterruptedException e)
            {
                System.out.println("Error dentro de la clase "+e);
            }

        }
        System.out.println("\n");
    }

}
