package InterfacesGraficas.Proyecto2;

import javax.swing.*;
import javax.swing.event.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.*;

public class Terminos extends JFrame implements ActionListener, ChangeListener
{
    private JLabel label1, label2;
    private JCheckBox check;
    private JTextArea Area;
    private JScrollPane scroll;
    private JButton boton1,boton2;

    String nombree = "";
    public Terminos()
    {
        setLayout(null);
        //label 1
        setTitle("Licencia de Uso");
        getContentPane().setBackground(new Color(255,255,255));
        setIconImage(new ImageIcon(getClass().getResource("botella.jpg")).getImage());
        //recuperar un dato de otra interface/ clase
        Bienvenida datoBienvenida = new Bienvenida();
        nombree = datoBienvenida.nombreUser;

        label1 = new JLabel("Terminos y condiciones");
        label1.setBounds(200,15,300,30);
        label1.setForeground(new Color(0,0,0));
        label1.setFont(new Font("Andale Mono",1,22));
        add(label1);

        //Jtext Area
        Area = new JTextArea();
        Area.setEditable(false);
        Area.setFont(new Font("Andale Mono",0,12));
        Area.setForeground(new Color(0,0,0));
        Area.setText("\n\n          Terminos y condiciones\n" +
                "\n         Bestow upon me knowledge Wizard, all-knowing, all-wise I want to rule this\n" +
                "          kingdom Make sweet the breeze, now defiled Dethrone the evil prince's iron\n" +
                "          fists In velvet gloves of sin Parade the grey robed monks\n" +
                "          The vestal virgins wheel the wyvern's in Let the ceremony consecrate the marriage\n" +
                "          Let me be the protégé of five magics\n\n" +
                "          Give me alchemy, give me wizardry Give me sorcery, thermatology\n" +
                "          Electricity, magic if you please Master all of these, bring him to his knees\n\n" +
                "          I master five magics\n" +
                "          I master five magics\n" +
                "          I master five magics\n" +
                "          I master five magics\n\n" +
                "          Possessed with hellish torment (possessed with hellish torment)\n" +
                "          I master magics five (I master magics five) Hunting the abyss lord (hunting the abyss lord)\n" +
                "          Only one will stay alive (only one will stay alive) He who lives by the sword\n " +
                "          (he who lives by the sword) Will surely also die (will surely also die)\n" +
                "          He who lives in sin (he who lives in sin) Will surely live the lie\n");
        scroll = new JScrollPane(Area);
        scroll.setBounds(30,60,640,250);
        add(scroll);

        //JchecButton
        check = new JCheckBox("yo "+nombree+" Acepto los Terminos y condiciones");
        check.setBounds(30,330,300,30);
        check.setBackground(new Color(255,255,255));
        check.addChangeListener(this);
        add(check);

        boton1 = new JButton("Acepto");
        boton1.setBounds(30,380,100,30);
        boton1.setEnabled(false);
        boton1.addActionListener(this);
        add(boton1);

        boton2 = new JButton("No acepto");
        boton2.setBounds(140,380,100,30);
        boton2.setEnabled(true);
        boton2.addActionListener(this);
        add(boton2);

        ImageIcon imagen = new ImageIcon("/home/alx/Desktop/Javafiles/java/src/InterfacesGraficas/Proyecto2/index.png");
        label2 = new JLabel(imagen);
        label2.setBounds(330,280,300,190);
        add(label2);
    }

    public void stateChanged(ChangeEvent e)
    {
        if(check.isSelected() == true)
        {
            boton2.setEnabled(false);
            boton1.setEnabled(true);
        }
        if(check.isSelected() == false)
        {
            boton1.setEnabled(false);
            boton2.setEnabled(true);
        }
    }

    public void actionPerformed(ActionEvent e)
    {
        if(e.getSource() == boton1)
        {
            Principal ventanaPrincipal = new Principal();
            ventanaPrincipal.setBackground(new Color(255,255,255));
            ventanaPrincipal.setBounds(0,0,700,550);
            ventanaPrincipal.setLocationRelativeTo(null);
            ventanaPrincipal.setDefaultCloseOperation(EXIT_ON_CLOSE);;
            ventanaPrincipal.setResizable(false);
            ventanaPrincipal.setVisible(true);
            this.setVisible(false);
        }
        if(e.getSource() == boton2)
        {
            Bienvenida ventana = new Bienvenida();
            ventana.setBounds(0,0,400,450);
            ventana.setLocationRelativeTo(null);
            ventana.setResizable(false);
            ventana.setDefaultCloseOperation(EXIT_ON_CLOSE);
            ventana.setVisible(true);
            this.setVisible(false);
        }
    }

    public static void main(String[] args)
    {
        Terminos ventana2 = new Terminos();
        ventana2.setBounds(0,0,700,460);
        ventana2.setLocationRelativeTo(null);
        ventana2.setDefaultCloseOperation(EXIT_ON_CLOSE);
        ventana2.setResizable(false);
        ventana2.setVisible(true);
    }
}
