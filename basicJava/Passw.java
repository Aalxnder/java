package BasicJava;

import javax.swing.*;

public class Passw
{
    public static void main(String[] args) {
        String user = "msfadmin", passw = "msfadmin";
        String useru, upassw;

        useru = JOptionPane.showInputDialog("Ingresa El usuario");

        upassw = JOptionPane.showInputDialog("Ingresa la contraseña");

        if((user.equalsIgnoreCase(useru)) && (passw.equalsIgnoreCase(upassw)))
        {
            JOptionPane.showMessageDialog(null, "Inicio de sesion exitoso");
        }
        else
        {
            JOptionPane.showMessageDialog(null,"usuario o contraseña incorrectos");
        }
    }
}
