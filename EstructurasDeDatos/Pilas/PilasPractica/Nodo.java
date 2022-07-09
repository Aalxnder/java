package EstructurasDeDatos.Pilas.pilasPractica;

public class Nodo
{
    //tipo de dato de la pila
    int dato;
    //puntero al siguiente nodo
    Nodo siguiente;
    //constructor para guardar cada nodo
    public Nodo(int dato)
    {
        this.dato = dato;
        this.siguiente = null;
    }
}
