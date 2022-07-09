package EstructurasDeDatos.Pilas.AnimalesPilas;

import javax.swing.*;

public class Pilas
{
    int tamanio = 0;
    String lista = "";
    private NodoAnimales UltimoValor;

    public Pilas()
    {
        this.UltimoValor = null;
        this.tamanio = 0;
    }

    public boolean pilaVacia()
    {
        //saber si la lista esta vacia
        return UltimoValor == null;
    }

    public void ingresarNodo(String familia,String nombre,String genero,String especie,int edad,int tiempo)
    {
        NodoAnimales nuevo_nodo = new NodoAnimales(familia,nombre,genero,especie,edad,tiempo);
        nuevo_nodo.siguiente = UltimoValor;
        UltimoValor = nuevo_nodo;
        tamanio++;
    }

    public String Eliminar()
    {
        String aux = UltimoValor.nombre;
        UltimoValor = UltimoValor.siguiente;
        tamanio--;
        return aux;
    }
    public int EliminarInts()
    {
        int aux = UltimoValor.edad;
        UltimoValor = UltimoValor.siguiente;
        tamanio--;
        return aux;
    }
    public String UltimoValoringresado()
    {
        String datos = "";
        datos = UltimoValor.especie + " " + UltimoValor.nombre + "\n" +UltimoValor.genero +" "+UltimoValor.familia + "\n"+UltimoValor.edad + " " + UltimoValor.tiempo;
        return datos;
    }
    public int LongitudPila()
    {
        return tamanio;
    }
    public void mostrarPila()
    {
        NodoAnimales aux = UltimoValor;
        while (aux != null)
        {
            lista += aux.familia + " " + aux.nombre + "\n" + aux.genero + " " + aux.especie + "\n" + aux.edad + " " + aux.tiempo + "\n";
            aux = aux.siguiente;
        }
        JOptionPane.showMessageDialog(null,lista);
        lista = "";
    }

    public void vaciarPila()
    {
        Eliminar();
        EliminarInts();
    }
}
