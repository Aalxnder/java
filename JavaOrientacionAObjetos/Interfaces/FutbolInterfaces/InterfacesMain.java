package POO.interfaces.interfacescoches;

public class InterfacesMain
{
    public static void main(String[] args)
    {
        Carro carro = new Carro();
        Bicicleta bici = new Bicicleta();

        carro.avanzar();
        bici.detenerse();
        bici.sentarse();
    }
}
