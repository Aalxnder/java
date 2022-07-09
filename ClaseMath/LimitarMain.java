package ClaseMath.LimitarDecimales;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.text.DecimalFormat;
import java.util.Scanner;

public class LimitarMain
{
    public static void main(String[] args)
    {
        //Obtener Raiz
        double numero,raiz;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingresa el numero a sacar la raiz: ");
        numero = scanner.nextDouble();

        if(numero <0)
        {
            System.out.println("No existe raiz real de este numero.");
        }
        else
        {
            raiz = Math.sqrt(numero);

            DecimalFormat df = new DecimalFormat("#.000");
            //Opcion limitar decimales 1
            System.out.println("La raiz del numero "+numero+" es: "+df.format(raiz)); //obtener solo ciertos decimales
            //Opcion limitar decimales 2
            System.out.println("La raiz del numero "+numero+" es: "+String.format("%.2f",raiz)); //obtener solo ciertos decimales
            //Opcion limitar decimales 3
            System.out.println("La raiz del numero "+numero+" es: "+(double)Math.round(raiz*10000d)/10000); //obtener solo ciertos decimales
            //Opcion limitar decimales 4
            BigDecimal db = new BigDecimal(raiz);
            db = db.setScale(5, RoundingMode.HALF_UP);
            System.out.println("La raiz del numero "+numero+" es: "+db.doubleValue()); //obtener solo ciertos decimales

        }

    }
}
