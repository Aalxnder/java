package EstructurasDeDatos.Pilas.pilasNombre;

import javax.swing.*;

public class PilaNombre
{
    private NodoNombre UltimoValor;
    int tamanio = 0;
    String lista = "";

    public PilaNombre()
    {
        UltimoValor = null;
        tamanio = 0;
    }

    public boolean pilaVacia()
    {
        //saber si la lista esta vacia
        return UltimoValor == null;
    }

    public void insertarNodo(String nombre, int edad)
    {
        NodoNombre nuevo_nodo = new NodoNombre(nombre,edad);
        nuevo_nodo.siguiente = UltimoValor;
        UltimoValor = nuevo_nodo;
        tamanio++;
    }
    public int Eliminarfecha()
    {
        int aux = UltimoValor.edad;
        UltimoValor = UltimoValor.siguiente;
        tamanio--;
        return aux;
    }
    public String Eliminar()
    {
        String aux = UltimoValor.nombre;
        UltimoValor = UltimoValor.siguiente;
        tamanio--;
        return aux;
    }
    public String UltimoValorIngresado()
    {
        return UltimoValor.nombre;
    }
    public int TamanioPila()
    {
        return tamanio;
    }

    public String ultimoValorIngresado()
    {
        String datos = "";
        datos = UltimoValor.nombre + " " + UltimoValor.edad;
        return datos;
    }

    public void mostrarPila()
    {
        NodoNombre aux = UltimoValor;
        while(aux != null)
        {
            lista += aux.nombre +" "+ aux.edad +"\n";
            aux = aux.siguiente;
        }
        JOptionPane.showMessageDialog(null,lista);
        lista = "";
    }

    public void vaciarPila()
    {
        while(!pilaVacia())
        {
            Eliminar();
            Eliminarfecha();
        }
    }
}
