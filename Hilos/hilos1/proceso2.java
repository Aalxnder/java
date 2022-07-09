package Hilos.Hilos1;

public class proceso2 implements Runnable //Interface em jdk
{
    @Override
    public void run()
    {
        for(int i=0;i<5;i++)
        {
            System.out.println("proceso 2");
        }
    }
}
