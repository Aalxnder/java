package Bucles;

public class Ejercicio
{
    public static void main(String[] args)
    {
        int i;
        int j = 99;
        for(i=0;i<=10;i++)
        {
            if(i<10)
            {
                System.out.print(i+" ,");

            }
            else
            {
                System.out.print(i);

            }
        }
        System.out.println(" ");
        for(i=1;i<=5;i++)
        {
            if(i<5)
            {
                System.out.print(i+" ,");
                System.out.print(j+" ,");
            }
            else
            {
                System.out.print(i+" ,");
                System.out.print(j);
            }
            j--;
        }

    }
}
