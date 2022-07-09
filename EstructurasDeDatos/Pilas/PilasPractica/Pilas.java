package EstructurasDeDatos.Pilas.pilasPractica;

import javax.swing.*;

public class Pilas
{
    //ver el ultimo valor agregado
    private Nodo UltimoValor;
    int tamanio = 0;
    String lista = "";

    public Pilas()
    {
        UltimoValor = null;
        tamanio = 0;
    }
    //revisar si la lista esta vacia
    public boolean pilaVacia()
    {
        //saber si la lista esta vacia
        return UltimoValor == null;
    }

    //insertar nodo
    public void insertarNodo(int dato)
    {
        Nodo nuevo_nodo = new Nodo(dato); //crear el objeto del tipo nodo
        nuevo_nodo.siguiente = UltimoValor; //el siguiente nodo es el ultimo nodo
        UltimoValor = nuevo_nodo; //el nuevo nodo ahora es el ultimo nodo
        tamanio++;
    }

    //eliminar nodo
    public int Eliminar()
    {
        int aux = UltimoValor.dato;
        UltimoValor = UltimoValor.siguiente;
        tamanio--;
        return aux;
    }

    //conocer el ultimo valor
    public int ultimoValorIngresado()
    {
        return UltimoValor.dato;
    }

    //retornar el tamaño de la pila
    public int tamanioPila()
    {
        return tamanio;
    }

    //vaciarPila
    public void vaciarPila()
    {
        while(!pilaVacia())
        {
            Eliminar();
        }
    }

    //mostra la pila
    public void mostrarPila()
    {
        Nodo aux = UltimoValor;
        while(aux != null)
        {
            lista += aux.dato + "\n";
            aux = aux.siguiente;
        }
        JOptionPane.showMessageDialog(null,lista);
        lista = "";
    }
}
