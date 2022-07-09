package Excepciones;

import java.util.Scanner;

public abstract class Operacion
{
     private int num1;
     private int num2;
     protected int resultado;

     public abstract void pedirNumeros();
     public abstract void operacion(int num1, int num2);
     Scanner scanner = new Scanner(System.in);

     public void menu()
     {
          Division division = new Division();
         int opc;
         do
         {
              System.out.println("1. Suma");
              System.out.println("2. Resta");
              System.out.println("3. Multiplicacion");
              System.out.println("4. Division");
              System.out.println("5. Salir");
              System.out.println("Ingrese una opcion: ");
              opc = scanner.nextInt();

              switch(opc)
              {
                   case 1:
                   {

                   }
                   case 2:
                   {

                   }
                   case 3:
                   {

                   }
                   case 4:
                   {
                         division.pedirNumeros();
                         division.operacion(num1, num2);
                         menu();
                   }
                   case 5:
                   {

                   }
                   default:
                   {

                   }
              }
         }while(opc != ' ');
     }
     //setters y getters
     public void setNum1(int num1)
     {
         this.num1 = num1;
     }

     public int getNum1()
     {
         return num1;
     }

     public void setNum2(int num2)
     {
         this.num2 = num2;
     }
     public int getNum2()
     {
         return num2;
     }
}
