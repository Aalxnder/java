package POO.interfaces.Interfaces3;

public class MainInterfaces3
{
    public static void main(String[] args)
    {
        English english = new English();
        Programming java = new Programming();
        Spanish spanish = new Spanish();

        english.sayHi();
        english.sayBye();
        java.sayHi();
        java.sayBye();
        spanish.decirHola();
        spanish.decirAdios();
    }
}
