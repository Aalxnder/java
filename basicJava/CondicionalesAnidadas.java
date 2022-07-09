/*Realizar un prograa que realize una suma, resta, division, multi de numeros enteros segum ña decision
del usuario
1. suma
2. resta
3. multi
4. division
 */

package BasicJava;

import java.util.Scanner;

public class CondicionalesAnidadas
{



    public static void main(String[] args)
    {
        int opc;
        int num1, num2, resultado;
        Scanner escaner = new Scanner(System.in);
        do {
            System.out.println("Menu\n[1] Sumar\n[2] Restar\n[3] multiplicar\n[4] dividir\nElije una opcion");
            opc = escaner.nextInt();

            switch (opc) {
                case 1: {

                    System.out.println("Ingresa el primer numero");
                    num1 = escaner.nextInt();
                    System.out.println("Ingresa el segundo numero");
                    num2 = escaner.nextInt();

                    resultado = num1 + num2;
                    System.out.println("la suma es: " + resultado);
                    break;
                }
                case 2: {

                    System.out.println("Ingresa el primer numero");
                    num1 = escaner.nextInt();
                    System.out.println("Ingresa el segundo numero");
                    num2 = escaner.nextInt();

                    resultado = num1 - num2;

                    System.out.println("la resta es: " + resultado);
                    break;
                }
                case 3: {

                    System.out.println("Ingresa el primer numero");
                    num1 = escaner.nextInt();
                    System.out.println("Ingresa el segundo numero");
                    num2 = escaner.nextInt();

                    resultado = num1 * num2;
                    System.out.println("La multiplicacion es: " + resultado);
                    break;
                }
                case 4: {
                    System.out.println("Ingresa el primer numero");
                    num1 = escaner.nextInt();
                    System.out.println("Ingresa el segundo numero");
                    num2 = escaner.nextInt();
                    while (num2 == 0) {
                        System.out.println("Error, no se puede dividir entre 0");
                        System.out.println("Ingresa nuevamente el segundo numero");
                        num2 = escaner.nextInt();
                    }

                    resultado = num1 / num2;
                    System.out.println("El resultado es: " + resultado);
                    break;
                }
                default:
                {
                    System.out.println("Opcion no disponible");
                    break;

                }
            }
        }while(opc != ' ');

    }

}
