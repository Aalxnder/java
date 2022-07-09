package Arrays.BucleForEach;

public class MatrizAleatoria
{
    public static void main(String[] args)
    {
        //Array con numero aleatorios
        int vector[]=new int[1000];

        for(int i=0;i<vector.length;i++)
        {
            //Generar los numeros randoms
            vector[i]=(int)Math.round(Math.random()*100);
        }
        for(int random: vector)
        {
            System.out.println("numero random generado: "+random);
        }
    }
}
