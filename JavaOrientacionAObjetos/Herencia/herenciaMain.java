package POO.Herencia;

public class herenciaMain
{
    public static void main(String[] args)
    {
        ClaseHijaSuma suma = new ClaseHijaSuma();
        suma.pedirDatos();
        suma.sumar();
        suma.mostrarResultado();

        ClaseHijaResta resta = new ClaseHijaResta();
        resta.pedirDatos();
        resta.restar();
        resta.mostrarResultado();
    }
}
