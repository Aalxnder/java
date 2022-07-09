package EstructurasDeDatos.Colas.ColasPractica;

import javax.swing.*;

public class Cola
{
    private Nodo inicio; //conocer el inicio de la cola
    private Nodo fin; //fin de la cola
    String Cola = "";
    public Cola()
    {
        inicio = null;
        fin = null;
    }

    //revisar si la cola esta vacia o no
    public boolean colaVacia()
    {
        if(inicio == null) //si no hay elementos en el primer nodo esta vacia, retornamos true
        {
            return true;
        }
        else
        {
            return false;
        }
    }

    public void insertar(int informacion)
    {
        Nodo nuevo_nodo = new Nodo();
        nuevo_nodo.informacion = informacion;
        //si la cola esta vacia
        if(colaVacia())
        {
            inicio = nuevo_nodo;
            fin = nuevo_nodo;
        }
        else
        {
            fin.siguiente = nuevo_nodo;
            fin = nuevo_nodo;
        }
    }

    //extraer un valor
    public int extraerNodo()
    {
        if(!colaVacia())
        {
            int informacion = inicio.informacion;
//            si se cumple esto es que el elemento que estamos viendo es el ultimo en entrar a la cola y los apuntadores deben ir a null
            if(inicio == fin)
            {
                inicio = null;
                fin = null;
            }
            else
            {
                inicio = inicio.siguiente;
                return informacion;
            }
        }
        return Integer.MAX_VALUE;
    }

    //mostrar el contenido de la cola
    public void mostrarContenido()
    {
        Nodo recorrido = inicio;
        String colaInvertida = "";
        //mientas no se llegue al final de la cola
        while(recorrido != null)
        {
            Cola += recorrido.informacion + " ";
            recorrido = recorrido.siguiente;
        }
        String cadena[] = Cola.split(" ");//se separa la cadena en un arreglo de cadenas

        for(int i = cadena.length-1; i >= 0; i--) //se recorre el arreglo de cadenas de forma inversa(el -1 es para evitar el error de indice fuera de rango)
        {
            colaInvertida +=" "+cadena[i];
        }
        JOptionPane.showMessageDialog(null, colaInvertida);
        Cola = "";

    }
}
