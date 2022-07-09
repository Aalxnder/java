package BasicJava;

//import java.util.Scanner;

import javax.swing.*;

public class StringJava
{
    public static void main(String[] args)
    {
        String nombre1;
        String nombre2;
        //Scanner escaner = new Scanner(System.in);

        nombre1 = JOptionPane.showInputDialog("Ingresa el nombre 1");
        //nombre1 = escaner.nextLine();


        nombre2 = JOptionPane.showInputDialog("Ingresa el nombre 2");
        //nombre2 = escaner.nextLine();

        if (nombre1.equals(nombre2))
        {
            JOptionPane.showMessageDialog(null,"Los nombres son iguales");
        }
        else
        {
            JOptionPane.showMessageDialog(null,"Los nombres son diferentes");
        }
    }
}
