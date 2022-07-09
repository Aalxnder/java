package EstructurasDeDatos.Pilas.AnimalesPilas;

import javax.swing.*;

public class Animales
{
    public static void main(String[] args)
    {
        int opc = 0;
        Pilas pila = new Pilas();
        do
        {
            try
            {
                opc = Integer.parseInt(JOptionPane.showInputDialog(null,"1. Insertar nodo\n"
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
                        String nombre = JOptionPane.showInputDialog(null,"Ingrese el nombre del animal");
                        String familia = JOptionPane.showInputDialog(null,"Ingrese la familia del animal");
                        String genero = JOptionPane.showInputDialog(null,"Ingrese el genero del animal");
                        String especie = JOptionPane.showInputDialog(null,"Ingrese la especie del animal");
                        int edad = Integer.parseInt(JOptionPane.showInputDialog(null,"Ingrese la edad del animal"));
                        int tiempo = Integer.parseInt(JOptionPane.showInputDialog(null,"Ingrese el tiempo en el zoo del animal"));
                        pila.ingresarNodo(familia,nombre,genero,especie,edad,tiempo);
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
                            JOptionPane.showMessageDialog(null,"El ultimo valor ingresado fue: "+pila.UltimoValoringresado());
                        }
                        else
                        {
                            JOptionPane.showMessageDialog(null,"La pila esta vacia, no hay nada que mostrar");
                        }
                        break;
                    }
                    case 5:
                    {
                        if (!pila.pilaVacia())
                        {
                            JOptionPane.showMessageDialog(null, "El tamaño de la pila es: " + pila.LongitudPila());
                        }
                        else
                        {
                            JOptionPane.showMessageDialog(null, "La pila esta vacia");
                        }
                        break;
                    }
                    case 6:
                    {
                        if (!pila.pilaVacia())
                        {
                            pila.vaciarPila();
                            JOptionPane.showMessageDialog(null, "La pila se ha vaciado");
                        }
                        else
                        {
                            JOptionPane.showMessageDialog(null, "La pila esta vacia");
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
                            JOptionPane.showMessageDialog(null, "La pila esta vacia");
                        }
                        break;
                    }
                    case 8:
                    {
                        break;
                    }
                    default:
                    {
                        JOptionPane.showMessageDialog(null,"Opcion no valida");
                        break;
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
