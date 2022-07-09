package Bucles;

public class fibonacci
{
    public static void main(String[] args)
    {
        int i=0, a=0, b=1, c=0;

        while(i<10)
        {
            if (i < 9)
            {
                System.out.print(a + ",");
                c = a + b;
                a = b;
                b = c;
            } else
            {
                System.out.println(a);
            }
            i++;
        }
    }
}
