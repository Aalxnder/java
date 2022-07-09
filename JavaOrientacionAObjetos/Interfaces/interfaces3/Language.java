package POO.interfaces.Interfaces3;

public interface Language
{
    void sayHi();
    default void sayBye()
    {
        System.out.println("Bye from Interface");
    }
}
