package BasicJava;

import java.util.Scanner;

public class CondicionesCompuestas
{
    public static void main(String[] args)
    {
        String nombre;
        int antiguedad, clave;

        Scanner escaner = new Scanner(System.in);

        do
        {
            System.out.println("***********************************************");
            System.out.println("*Bienvenido al sistema vacacional de coca cola*\n" +
                               "***********************************************\n"+
                    "Ingrese su clave de departamento\n" +
                    "[1] Atencion al cliente\n[2] Logistica\n[3] Gerencia\n");

            clave = escaner.nextInt();

            switch (clave)
            {
                case 1:
                {
                    escaner.nextLine();
                    System.out.println("Atencion a cliente");
                    System.out.println("Ingresa tu nombre");
                    nombre = escaner.nextLine();

                    System.out.println("Ingresa tus años de servicio");
                    antiguedad = escaner.nextInt();

                    while (antiguedad <0)
                    {
                        System.out.println("Error, ingresa una antiguedad valida");
                        System.out.println("Ingresa nuevamente tus años de servicio");
                        antiguedad = escaner.nextInt();
                    }
                    if(antiguedad <=1)
                    {
                        System.out.println("EL empleado "+nombre+ " Tiene derecho a 6 dias de vacaciones");
                    } else if (antiguedad>1 && antiguedad <= 6)
                    {
                        System.out.println("El empleado "+nombre+" Tiene derecho a 14 dias de vacaciones");
                    }
                    else
                    {
                        System.out.println("El empleado "+nombre+ "Tiene derecho a 20 dias de vacaciones");
                    }
                    break;
                }
                case 2:
                {
                    escaner.nextLine();
                    System.out.println("Logistica");
                    System.out.println("Ingresa tu nombre");
                    nombre = escaner.nextLine();
                    System.out.println("Ingresa tus años de servicio");
                    antiguedad = escaner.nextInt();

                    while (antiguedad <0)
                    {
                        System.out.println("Error, ingresa una antiguedad valida");
                        System.out.println("Ingresa nuevamente tus años de servicio");
                        antiguedad = escaner.nextInt();
                    }

                    if(antiguedad <=1)
                    {
                        System.out.println("EL empleado "+nombre+ " Tiene derecho a 7 dias de vacaciones");
                    } else if (antiguedad>1 && antiguedad <= 6)
                    {
                        System.out.println("El empleado "+nombre+" Tiene derecho a 15 dias de vacaciones");
                    }
                    else
                    {
                        System.out.println("El empleado "+nombre+ "Tiene derecho a 22 dias de vacaciones");
                    }
                    break;
                }
                case 3:
                {
                    escaner.nextLine();
                    System.out.println("Gerencia");
                    System.out.println("Ingresa tu nombre");
                    nombre = escaner.nextLine();
                    System.out.println("Ingresa tus años de servicio");
                    antiguedad = escaner.nextInt();

                    while (antiguedad <0)
                    {
                        System.out.println("Error, ingresa una antiguedad valida");
                        System.out.println("Ingresa nuevamente tus años de servicio");
                        antiguedad = escaner.nextInt();
                    }

                    if(antiguedad <=1)
                    {
                        System.out.println("EL empleado "+nombre+ " Tiene derecho a 10 dias de vacaciones");
                    } else if (antiguedad>1 && antiguedad <= 6)
                    {
                        System.out.println("El empleado "+nombre+" Tiene derecho a 20 dias de vacaciones");
                    }
                    else
                    {
                        System.out.println("El empleado "+nombre+ "Tiene derecho a 30 dias de vacaciones");
                    }
                    break;
                }
                default:
                {
                    System.out.println("Opcion no valida");
                    break;
                }
            }
        }while(clave != ' ');
    }
}
