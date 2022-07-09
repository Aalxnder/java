package InterfacesGraficas.Menus;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.*;
public class SubMenus extends JFrame implements ActionListener
{
    private JMenuBar menubar;
    private JMenu menu1,menu2,menu3;
    private JMenuItem menuItem1, menuItem2,menuItem3,menuItem4,menuItem5;

    public SubMenus()
    {
        setLayout(null);
        menubar = new JMenuBar();
        setJMenuBar(menubar);

        //opciones
        menu1 = new JMenu("opciones");
        menubar.add(menu1); //agregar el menu

        menu2 = new JMenu("Tamaño de la ventana");
        menu1.add(menu2);

        menu3 = new JMenu("Colores");
        menu1.add(menu3);

        //submenus
        menuItem1 = new JMenuItem("300x200px");
        menu2.add(menuItem1);
        menuItem1.addActionListener(this);

        menuItem2 = new JMenuItem("640x480px");
        menu2.add(menuItem2);
        menuItem2.addActionListener(this);

        menuItem3 = new JMenuItem("Rojo");
        menu3.add(menuItem3);
        menuItem3.addActionListener(this);

        menuItem4 = new JMenuItem("verde");
        menu3.add(menuItem4);
        menuItem4.addActionListener(this);

        menuItem5 = new JMenuItem("azul");
        menu3.add(menuItem5);
        menuItem5.addActionListener(this);
    }

    public void actionPerformed(ActionEvent e)
    {
        if(e.getSource() == menuItem1)
        {
            setSize(300,200);
        }
        if(e.getSource() == menuItem2)
        {
            setSize(640,380);
        }
        if(e.getSource() == menuItem3)
        {
            getContentPane().setBackground(new Color(255,0,0));
        }
        if(e.getSource() == menuItem4)
        {
            getContentPane().setBackground(new Color(0,255,0));
        }
        if(e.getSource() == menuItem5)
        {
            getContentPane().setBackground(new Color(0,0,255));
        }
    }

    public static void main(String[] args)
    {
        SubMenus ventana = new SubMenus();
        ventana.setBounds(0,0,400,300);
        ventana.setLocationRelativeTo(null);
        ventana.setTitle("submenus");
        ventana.setDefaultCloseOperation(EXIT_ON_CLOSE);
        ventana.setVisible(true);
        ventana.setResizable(false);
    }
}
