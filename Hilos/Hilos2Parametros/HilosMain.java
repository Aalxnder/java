package Hilos.Hilos2Parametros;

public class HilosMain
{
    public static void main(String[] args)
    {
        Proceso hilos1 = new Proceso(" Hilo 1 ");
        Proceso hilo2 = new Proceso(" Hilo 2 ");
        Proceso hilo3 = new Proceso(" Hilo 3");
        hilos1.ValorCondicion(5);
        hilo2.ValorCondicion(10);
        hilo3.ValorCondicion(15);
        hilo2.start();
        hilos1.start();
        hilo3.start();
    }
}
