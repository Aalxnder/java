package Hilos.EstadosDeHilo;

public class EstadosHilosMain
{
    public static void main(String[] args)
    {
        HiloProceso hilo1 = new HiloProceso(); //Instanciar el hilo Primer estado
        HiloProceso hilo2 = new HiloProceso();

        hilo1.start(); //Estado ejecutable de hilo
        try
        {
            hilo1.sleep(1000); //para usar esto es necesaria la sentencia try catch
        }
        catch(InterruptedException e)
        {
            System.out.println("Error en el hilo1 "+e);
        }
        hilo2.start();
        hilo2.stop(); //Estado detenido de hilo
        try
        {
            hilo2.sleep(1000);  //Estado de hilo norunneable
        }
        catch(InterruptedException e)
        {
            System.out.println("Error en el hilo "+e);
        }


    }
}
