package EstructurasDeDatos.Pilas.pilasNombre;

public class NodoNombre
{
    String nombre;
    int edad;
    NodoNombre siguiente;
    public NodoNombre(String nombre,int edad)
    {
        this.nombre = nombre;
        this.edad = edad;
        this.siguiente = null;
    }

}
