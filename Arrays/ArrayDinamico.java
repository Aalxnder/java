package Arrays.ArrayDinamico;

import javax.swing.*;

public class ArrayDinamico
{
    public static void main(String[] args)
    {
        int cant;
        cant = Integer.parseInt(JOptionPane.showInputDialog("Ingresa la cantidad de elementos de array"));

        int num[] = new int [cant];

        for(int i=0;i<num.length;i++)
        {
            num[i] = Integer.parseInt(JOptionPane.showInputDialog("Ingresa el valor en la posicion "+i));
        }
        int cont = 0;
        for(int numeros:num)
        {
            JOptionPane.showMessageDialog(null,"Numero en la posicion "+cont+" es: "+numeros);
            cont ++;
        }
    }
}
