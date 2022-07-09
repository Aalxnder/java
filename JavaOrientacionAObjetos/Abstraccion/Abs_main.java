package POO.Abstraccion;

public class Abs_main
{
    public static void main(String[] args)
    {
        Planta planta = new Planta();

        planta.alimentarse();

        AnimalCarnivoro animalcarnivoro = new AnimalCarnivoro();

        animalcarnivoro.alimentarse();

        AnimalHervivoro animalh = new AnimalHervivoro();

        animalh.alimentarse();
    }
}
