package POO.Abstraccion;

public class Suma
{
    private int num1,num2,resultado;
    public Suma(int valor1, int valor2)
    {
        this.num1 = valor1;
        this.num2 = valor2;

    }
    public void sumar()
    {
        resultado = num1+num2;
    }

    public void imprimir() {
        sumar();
        System.out.println("resulado: "+resultado);
    }
}
