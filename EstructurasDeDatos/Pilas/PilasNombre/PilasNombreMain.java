package EstructurasDeDatos.Pilas.pilasNombre;

import javax.swing.*;

public class PilasNombreMain
{
    public static void main(String[] args)
    {
        PilaNombre pila = new PilaNombre();
        int opc = 0;
        do
        {
            try
            {
                opc = Integer.parseInt(JOptionPane.showInputDialog(null,
                        "1. Insertar nodo\n"
                        +"2. Eliminar nodo\n"
                        +"3. La pila esta vacia?\n"
                        +"4. Conocer el ultimo valor ingresado\n"
                        +"5. Tamaño de la pila\n"
                        +"6. Vaciar pila\n"
                        +"7. Mostrar contenido de la pila\n"
                        +"8. Salir"));

                switch(opc)
                {
                    case 1:
                    {
                        String nombre = JOptionPane.showInputDialog(null,"Ingrese el nombre del nodo");
                        int edad = Integer.parseInt(JOptionPane.showInputDialog(null,"Ingrese la edad del nodo"));
                        pila.insertarNodo(nombre,edad);
                        break;
                    }
                    case 2:
                    {
                        if(!pila.pilaVacia())
                        {
                            JOptionPane.showMessageDialog(null,"El valor eliminado fue: " + pila.Eliminar());
                        }
                        else
                        {
                            JOptionPane.showMessageDialog(null,"La pila esta vacia, no hay nada que eliminar");
                        }
                        break;
                    }
                    case 3:
                    {
                        if (pila.pilaVacia())
                        {
                            JOptionPane.showMessageDialog(null, "La pila esta vacia");
                        }
                        else
                        {
                            JOptionPane.showMessageDialog(null, "La pila no esta vacia");
                        }
                        break;
                    }
                    case 4:
                    {
                        if(!pila.pilaVacia())
                        {
                            JOptionPane.showMessageDialog(null,"El ultimo valor ingresado fue: "+pila.ultimoValorIngresado());
                        }
                        else
                        {
                            JOptionPane.showMessageDialog(null,"La pila esta vacia, no hay nada que mostrar");
                        }
                        break;
                    }
                    case 5:
                    {
                        if(!pila.pilaVacia())
                        {
                            JOptionPane.showMessageDialog(null,"La pila contiene " + pila.TamanioPila() + " nodos");
                        }
                        else
                        {
                            JOptionPane.showMessageDialog(null,"La pila esta vacia, no hay nada que mostrar");
                        }
                        break;
                    }
                    case 6:
                    {
                        if(!pila.pilaVacia())
                        {
                            pila.vaciarPila();
                        }
                        else
                        {
                            JOptionPane.showMessageDialog(null,"La pila esta vacia");
                        }
                        break;
                    }
                    case 7:
                    {
                        if(!pila.pilaVacia())
                        {
                            pila.mostrarPila();
                        }
                        else
                        {
                            JOptionPane.showMessageDialog(null,"La pila esta vacia");
                        }
                        break;
                    }
                    case 8:
                    {
                        break;
                    }
                    default:
                    {
                        JOptionPane.showMessageDialog(null, "Opcion no valida");
                    }
                }
            }
            catch (NumberFormatException e)
            {
                JOptionPane.showMessageDialog(null,"Opcion no valida");
            }
        }while(opc != 8);
    }
}
