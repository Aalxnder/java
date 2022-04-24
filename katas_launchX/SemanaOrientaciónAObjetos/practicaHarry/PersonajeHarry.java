package PracticaHarry;

public class PersonajeHarry
{
    String nombre,casa,genero,patronus,boggart;
    public PersonajeHarry(String nombre,String casa, String genero, String patronus, String boggart)
    {
        this.nombre= nombre;
        this.casa = casa;
        this.genero = genero;
        this.patronus = patronus;
        this.boggart = boggart;
    }

    @Override
    public String toString() {
        return  " nombre: " + nombre + '\n' +
                " casa: " + casa + '\n' +
                " genero: " + genero + '\n' +
                " patronus: " + patronus + '\n' +
                " boggart: " + boggart;
    }
}
