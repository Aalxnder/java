package Bucles;

import javax.swing.*;
import java.util.Scanner;

public class InversorPalabras
{
    public static void main(String[] args)
    {
        Scanner escaner = new Scanner(System.in);
        String cadena;
        String cadenainv = "";
        System.out.println("Ingresa la cadena a invertir");
        cadena = escaner.next();

        int contador = cadena.length();

        while(contador!=0)
        {
            cadenainv += cadena.substring(contador-1,contador);
            contador--;
        }
        System.out.print("Palabra invertida: "+cadenainv);
    }
}
