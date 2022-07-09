package POO.interfaces.Interfaces3;

public class Spanish implements LenguageSpanish
{
    public Spanish()
    {

    }
    public void decirHola()
    {
        System.out.println("Hola en español");
    }

    @Override
    public void decirAdios()
    {
        System.out.println("Adios en español");
    }
}
