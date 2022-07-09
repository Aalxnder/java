package Hilos.Hilos1;

public class Hilosmain
{
    public static void main(String[] args)
    {
        //primero crear objetos y despues arrancar los objetos

        Proceso1 hilo1 = new Proceso1(); //Objeto con extends(herencia)
        Proceso1 hilo3 = new Proceso1();
        Thread hilo2 = new Thread(new proceso2());  //Proceso con implements(Interfaces)

        //estos van al final de las instancias
        hilo1.start();
        hilo3.start();
        hilo2.start();
    }
}
