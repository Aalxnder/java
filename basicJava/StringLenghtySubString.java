package BasicJava;

import javax.swing.*;

public class StringLenghtySubString
{
    public static void main(String[] args)
    {
        String nombre,nombresub;
        int desde,hasta,lenght;

        nombre = JOptionPane.showInputDialog("Ingresa el nombre");

        lenght = nombre.length();

        JOptionPane.showMessageDialog(null,"Longitud de la cadena: "+nombre+ " es de: "+lenght);

        desde = Integer.parseInt(JOptionPane.showInputDialog("Ingresa desde que caracter se va a substraer la cadena"));
        while(desde < 0 || desde>lenght)
        {
            JOptionPane.showMessageDialog(null,"Ingresa un punto de partida valido");
            desde = Integer.parseInt(JOptionPane.showInputDialog("Ingresa desde que caracter se va a substraer la cadena"));
        }
        hasta = Integer.parseInt(JOptionPane.showInputDialog("Ingresa hasta donde se va a substraer la cadena"));
        while(hasta < 0 || hasta>lenght)
        {
            JOptionPane.showMessageDialog(null,"Ingresa un punto de fin valido");
            hasta = Integer.parseInt(JOptionPane.showInputDialog("Ingresa hasta que caracter se va a substraer la cadena"));
        }

        nombresub = nombre.substring(desde,hasta);
        JOptionPane.showMessageDialog(null,"cadena original: "+nombre+ " Cadena substraida: "+nombresub);
    }
}
