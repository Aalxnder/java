package Arrays.MatricesForEach;

public class MatrizEjercicio
{
    public static void main(String[] args)
    {
        double acumulado;
        double intereses=0.10;
        double matrix[][]= new double[5][5];

        for(int i=0;i<5;i++)
        {
            matrix[i][0]=10000;
            acumulado=10000;

            for(int j=1;j<5;j++)
            {
                acumulado = acumulado+(acumulado*intereses);
                matrix[i][j] = acumulado;
            }
            intereses=intereses+0.01;
        }

        for(int i=0;i<5;i++)
        {
            System.out.println();
            for (int j=0;j<5;j++)
            {
                System.out.print(matrix[i][j]);
                System.out.print(" ");
            }
        }
    }
}
