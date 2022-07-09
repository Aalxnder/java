package EstructurasDeDatos.Pilas.AnalizadorSintactico;

public class Pila
{
    private Nodo Ultimovalor;

    public Pila()
    {
        this.Ultimovalor = null;
    }

    //metodo para insertar en la pila
    public void insertar(char valor)
    {
        Nodo nuevo_nodo = new Nodo();
        nuevo_nodo.informacion = valor;

        //revisar si la pila esta vacia
        if(Ultimovalor == null)
        {
            nuevo_nodo.siguiente = null;
            Ultimovalor = nuevo_nodo;
        }
        //si no esta vacia
        else
        {
            nuevo_nodo.siguiente = Ultimovalor;
            Ultimovalor = nuevo_nodo;
        }
    }

    //extraer info
    public char extraerInfo()
    {
        if(Ultimovalor != null)
        {
            char info = Ultimovalor.informacion;
            Ultimovalor = Ultimovalor.siguiente;
            return info;
        }
        else
        {
            return Character.MAX_VALUE;
        }
    }

    //ver si la pila esta vacia
    public Boolean pilavacia()
    {
        return Ultimovalor == null;
    }
}
