package Excepciones;

public class Division extends Operacion
{
    int num1,num2;
    @Override
    public void pedirNumeros()
    {
        System.out.println("ingresa el primer numero");
        num1 = scanner.nextInt();
        System.out.println("ingresa el segundo numero");
        num2 = scanner.nextInt();
        setNum1(num1);
        setNum2(num2);
    }

    @Override
    public void operacion(int num1, int num2)
    {
        int division;
        num1 = getNum1();
        num2 = getNum2();
        try
        {
            division = num1/num2;
            System.out.println("EL resultado es: "+ division);
        }
        catch(Exception e)
        {
            System.out.println("Error!!! No se puede dividir entre 0 "+e);
        }
        //esto se ejecutara independientemente de el resultado
        finally
        {
            System.out.println("Operacion Terminada");
        }
    }

}
