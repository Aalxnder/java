package POO.Abstraccion;

public class Rectangulo
{
    private float base,altura,perimetro,area;
    public Rectangulo(float base, float altura)
    {
        this.base = base;
        this.altura = altura;
    }
    public float Perimetro()
    {
        perimetro = (base+altura)*2;
        return perimetro;
    }
    public float Area()
    {
        area = base*altura;
        return area;
    }
}
