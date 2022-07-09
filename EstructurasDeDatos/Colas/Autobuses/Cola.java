package EstructurasDeDatos.Colas.AutobusesCola;

import javax.swing.*;

public class Cola
{
    private Nodo inicio;
    private Nodo fin;
    String Cola = "";
    public Cola()
    {
        inicio = null;
        fin = null;
    }

    public boolean colaVacia()
    {
        if(inicio == null)
        {
            return true;
        }
        else
        {
            return false;
        }
    }

    public void ingresar(String nombre)
    {
        Nodo nuevo_nodo = new Nodo();
        nuevo_nodo.persona = nombre;
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

    public String Extraer()
    {
        if(!colaVacia())
        {
            String informacion = inicio.persona;
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
        return "la cola esta vacia";
    }

    public void mostrarCntenido()
    {
        Nodo recorrido = inicio;
        String colaInvertida = "";
        while(recorrido != null)
        {
            Cola += recorrido.persona + " ";
            recorrido = recorrido.siguiente;
        }
        String cadena[] = Cola.split(" ");

        for(int i = cadena.length - 1; i >= 0;i--)
        {
            colaInvertida += " " + cadena[i];
        }
        JOptionPane.showMessageDialog(null, colaInvertida);
        Cola = "";
    }
}
