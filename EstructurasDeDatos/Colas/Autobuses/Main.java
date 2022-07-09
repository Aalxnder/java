package EstructurasDeDatos.Colas.AutobusesCola;

import javax.swing.*;

public class Main
{
    public static void main(String[] args)
    {
        int opcion = 0;
        String nombre = "";
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

                switch (opcion)
                {
                    case 1:
                    {
                        nombre = JOptionPane.showInputDialog(null, "ingresa el nombre a insertar");
                        cola.ingresar(nombre);
                        break;
                    }
                    case 2:
                    {
                        if(!cola.colaVacia())
                        {
                            JOptionPane.showMessageDialog(null,"pasa el usuario: " + cola.Extraer());
                        }
                        else
                        {
                            JOptionPane.showMessageDialog(null,"La cola esta vacia, no hay nadie para atender");
                        }
                        break;
                    }
                    case 3:
                    {
                        if(!cola.colaVacia())
                        {
                            cola.mostrarCntenido();
                        }
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
                            }
                        }
                        catch (NumberFormatException e)
                        {
                            JOptionPane.showMessageDialog(null, "ingresa un numero");
                        }
                        break;
                    }
                }
            }
            catch (NumberFormatException e)
            {
                JOptionPane.showMessageDialog(null, "Opcion no valida");
            }
        }while(opcion != ' ');
    }
}
