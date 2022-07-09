package POO.interfaces.Interfaces4;
import javax.swing.*;

public class PruebaTempMain
{
    public static void main(String[] args)
    {
        Hora oyente = new Hora(); //objeto

        Timer miTemp = new Timer(5000, oyente); //Pasa objeto de tipo interface y el delay
        miTemp.start(); //Inicializar el temporizador

        JOptionPane.showMessageDialog(null,"Pulsa aceptar para detener");


        System.exit(0);
    }

}
