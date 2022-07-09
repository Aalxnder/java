package EstructurasDeDatos.Pilas.AnimalesPilas;

public class NodoAnimales
{
    String familia,nombre,genero,especie;
    int edad,tiempo;
    NodoAnimales siguiente;

    public NodoAnimales(String familia,String nombre,String genero,String especie,int edad,int tiempo)
    {
        this.familia = familia;
        this.nombre = nombre;
        this.genero = genero;
        this.especie = especie;
        this.edad = edad;
        this.tiempo = tiempo;
        this.siguiente = null;
    }

}
