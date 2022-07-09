package EstructurasDeDatos.Colas.ColasPractica;

import javax.swing.*;

public class Main
{
    public static void main(String[] args)
    {
        int opcion = 0;
        int nodo_info = 0;
        Cola cola = new Cola();

        do
        {
            try
            {
                opcion = Integer.parseInt(JOptionPane.showInputDialog(null,
                        "Menu de opciones\n\n" +
                                "1. Insertar\n" +
                                "2. Extraer\n" +
                                "3. Mostrar contenido de la cola\n"
                                +"4. Salir"));
                switch(opcion)
                {
                    case 1:
                    {
                        nodo_info = Integer.parseInt(JOptionPane.showInputDialog(null,"ingresa el vlor a insertar"));
                        cola.insertar(nodo_info);
                        break;
                    }
                    case 2:
                    {
                        if(!cola.colaVacia())
                        {
                            JOptionPane.showMessageDialog(null,"El valor eliminado fue: " + cola.extraerNodo());
                        }
                        else
                        {
                            JOptionPane.showMessageDialog(null,"La cola esta vacia, no hay nada que eliminar");
                        }
                        break;
                    }
                    case 3:
                    {
                        if(!cola.colaVacia())
                        {
                            cola.mostrarContenido();                        }
                        else
                        {
                            JOptionPane.showMessageDialog(null,"La cola esta vacia");
                        }
                        break;
                    }
                    case 4:
                    {
                        try
                        {
                            int s = Integer.parseInt(JOptionPane.showInputDialog(null, "realmente quieres salir del programa?\n1. si\n2. no"));
                            switch (s)
                            {
                                case 1:
                                {
                                    JOptionPane.showMessageDialog(null,"Gracias por usar el programa");
                                    System.exit(0);
                                    break;
                                }
                                case 2:
                                {
                                    break;
                                }
                                default:
                                {
                                    JOptionPane.showMessageDialog(null,"opcion no valida");
                                }
                            }
                        }
                        catch(NumberFormatException e)
                        {
                            JOptionPane.showMessageDialog(null,"opcion no valida");
                        }
                        break;
                    }
                    default:
                    {
                        JOptionPane.showMessageDialog(null, "Opcion no valida");
                        break;
                    }
                }
            }
            catch(NumberFormatException e)
            {

            }

        }while(opcion != ' ');
    }
}
