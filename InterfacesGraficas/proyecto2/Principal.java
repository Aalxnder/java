package InterfacesGraficas.Proyecto2;

import InterfacesGraficas.Botones.ScrollBar;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Principal extends JFrame implements ActionListener
{
    private JMenuBar menubar;
    private JMenu MOpciones,MCalcular,MAcercaDE,MColorFondo;
    private JMenuItem calculo,rojo,negro,morado,Creador,Salir,nuevo;
    private JLabel lNombre,lLogo,lBienvenido,lTitle,lAPaterno,lAMaterno,lDepartamento,lAntiguedad,
                    lResultado,lFooter;
    private JTextField nombreT,apellidoPatT,apellidoMatT;
    private JComboBox ComboDep,comboAnt;
    private JScrollPane Scroll;
    private JTextArea Area;

    String NombreBienvenida = "";

    public Principal()
    {
        setLayout(null);
        setTitle("Pantalla principal");
        getContentPane().setBackground(new Color(255,0,0));
        setIconImage(new ImageIcon(getClass().getResource("botella.jpg")).getImage());
        Bienvenida nombreBienvenidaa = new Bienvenida();
        NombreBienvenida = nombreBienvenidaa.nombreUser;
        //menuBar
        menubar = new JMenuBar();
        menubar.setBackground(new Color(124,124,124));
        setJMenuBar(menubar);


        //opciones del menu opciones
        MOpciones = new JMenu("Opciones");
        MOpciones.setBackground(new Color(124,124,124));
        MOpciones.setFont(new Font("Andale Mono",1,14));
        MOpciones.setForeground(new Color(255,255,255));
        menubar.add(MOpciones);
        //opciones del menu de calcular
        MCalcular = new JMenu("Calcular");
        MCalcular.setBackground(new Color(124,124,124));
        MCalcular.setFont(new Font("Andale Mono",1,14));
        MCalcular.setForeground(new Color(255,255,255));
        menubar.add(MCalcular);
        //Opciones de Acerca de
        MAcercaDE = new JMenu("Acerca De");
        MAcercaDE.setBackground(new Color(124,124,124));
        MAcercaDE.setForeground(new Color(255,255,255));
        MAcercaDE.setFont(new Font("Andale Mono",1,14));
        menubar.add(MAcercaDE);

        //submenus
        MColorFondo = new JMenu("Color de fondo");
        MColorFondo.setBackground(new Color(124,124,124));
        MColorFondo.setFont(new Font("Andale Mono",1,14));
        MColorFondo.setForeground(new Color(0,0,0));
        MOpciones.add(MColorFondo);

        calculo = new JMenuItem("Vacaciones");
        calculo.setBackground(new Color(124,124,124));
        calculo.setFont(new Font("Andale mono",1,14));
        calculo.setForeground(new Color(0,0,0));
        MCalcular.add(calculo);
        calculo.addActionListener(this);

        //Colores de fondo
        rojo = new JMenuItem("Rojo");
        rojo.setBackground(new Color(124,124,124));
        rojo.setForeground(new Color(0,0,0));
        rojo.setFont(new Font("Andale Mono",1,14));
        MColorFondo.add(rojo);
        rojo.addActionListener(this);

        negro = new JMenuItem("Negro");
        negro.setBackground(new Color(124,124,124));
        negro.setForeground(new Color(0,0,0));
        negro.setFont(new Font("Andale Mono",1,14));
        MColorFondo.add(negro);
        negro.addActionListener(this);

        morado = new JMenuItem("Morado");
        morado.setBackground(new Color(124,124,124));
        morado.setForeground(new Color(0,0,0));
        morado.setFont(new Font("Andale Mono",1,14));
        MColorFondo.add(morado);
        morado.addActionListener(this);

        nuevo = new JMenuItem("Nuevo");
        nuevo.setBackground(new Color(124,124,124));
        nuevo.setForeground(new Color(0,0,0));
        nuevo.setFont(new Font("Andale Mono",1,14));
        MOpciones.add(nuevo);
        nuevo.addActionListener(this);

        Salir = new JMenuItem("Salir");
        Salir.setBackground(new Color(124,124,124));
        Salir.setForeground(new Color(0,0,0));
        Salir.setFont(new Font("Andale Mono",1,14));
        MOpciones.add(Salir);
        Salir.addActionListener(this);

        Creador = new JMenuItem("Creador");
        Creador.setBackground(new Color(124,124,124));
        Creador.setForeground(new Color(0,0,0));
        Creador.setFont(new Font("Andale Mono",1,14));
        MAcercaDE.add(Creador);
        Creador.addActionListener(this);

        //label
        ImageIcon imagen = new ImageIcon("/home/alx/Desktop/Javafiles/java/src/InterfacesGraficas/Proyecto2/HistoriadellogodeCocaCola.png");
        lLogo = new JLabel(imagen);
        lLogo.setBounds(-50,5,350,100);
        this.add(lLogo);

        lBienvenido = new JLabel("Bienvenido "+NombreBienvenida);
        lBienvenido.setBounds(280,20,300,60);
        lBienvenido.setFont(new Font("Andale Mono",1,25));
        lBienvenido.setForeground(new Color(255,255,255));
        this.add(lBienvenido);

        lTitle = new JLabel("Calculo de vacaciones de empleados");
        lTitle.setBounds(70,120,600,30);
        lTitle.setForeground(new Color(255,255,255));
        lTitle.setFont(new Font("Andale mono",0,30));
        this.add(lTitle);


        lNombre = new JLabel("Nombre del empleado");
        lNombre.setBounds(25,180,200,30);
        lNombre.setFont(new Font("Andale Mono",0,14));
        lNombre.setForeground(new Color(255,255,255));
        this.add(lNombre);
        //texfield
        nombreT = new JTextField();
        nombreT.setBounds(25,220,200,30);
        nombreT.setBackground(new java.awt.Color(224,224,224));
        nombreT.setFont(new java.awt.Font("Andale Mono",0,14));
        nombreT.setForeground(new java.awt.Color(0,0,0));
        this.add(nombreT);

        lAPaterno = new JLabel("Apellido paterno del empleado");
        lAPaterno.setBounds(25,260,200,30);
        lAPaterno.setFont(new Font("Andale Mono",0,14));
        lAPaterno.setForeground(new Color(255,255,255));
        this.add(lAPaterno);
        //texfield
        apellidoPatT = new JTextField();
        apellidoPatT.setBounds(25,290,200,30);
        apellidoPatT.setBackground(new java.awt.Color(224,224,224));
        apellidoPatT.setFont(new java.awt.Font("Andale Mono",0,14));
        apellidoPatT.setForeground(new java.awt.Color(0,0,0));
        this.add(apellidoPatT);

        lAMaterno = new JLabel("Apellido Materno del empleado");
        lAMaterno.setBounds(25,330,200,30);
        lAMaterno.setFont(new Font("Andale Mono",0,14));
        lAMaterno.setForeground(new Color(255,255,255));
        this.add(lAMaterno);
        //texfield
        apellidoMatT = new JTextField();
        apellidoMatT.setBounds(25,360,200,30);
        apellidoMatT.setBackground(new java.awt.Color(224,224,224));
        apellidoMatT.setFont(new java.awt.Font("Andale Mono",0,14));
        apellidoMatT.setForeground(new java.awt.Color(0,0,0));
        this.add(apellidoMatT);


        //combobox
        lDepartamento = new JLabel("Selecciona el departamento");
        lDepartamento.setBounds(400,180,200,30);
        lDepartamento.setForeground(new java.awt.Color(255,255,255));
        lDepartamento.setFont(new java.awt.Font("Andale Mono",0,14));
        this.add(lDepartamento);
        ComboDep = new JComboBox();
        ComboDep.setBounds(400,220,200,30);
        ComboDep.setBackground(new java.awt.Color(224,224,224));
        ComboDep.setFont(new java.awt.Font("ANdale Mono",0,14));
        ComboDep.setForeground(new java.awt.Color(0,0,0));
        this.add(ComboDep);

        ComboDep.addItem("");
        ComboDep.addItem("Atencion al cliente");
        ComboDep.addItem("Departamento de logistica");
        ComboDep.addItem("Departamento de Gerencia");

        lAntiguedad = new JLabel("Antiguedad");
        lAntiguedad.setBounds(400,260,200,30);
        lAntiguedad.setFont(new java.awt.Font("Andale Mono",0,14));
        lAntiguedad.setForeground(new java.awt.Color(255,255,255));
        this.add(lAntiguedad);

        //comboBox
        comboAnt = new JComboBox();
        comboAnt.setBounds(400,290,200,30);
        comboAnt.setForeground(new java.awt.Color(0,0,0));
        comboAnt.setFont(new java.awt.Font("Andale Mono",0,14));
        this.add(comboAnt);
        comboAnt.addItem("");
        comboAnt.addItem("Menos de un año");
        comboAnt.addItem("1-7 Años");
        comboAnt.addItem("mas de 7 años");

        lResultado= new JLabel("Resultado");
        lResultado.setBounds(400,340,200,30);
        lResultado.setForeground(new java.awt.Color(224,224,224));
        lResultado.setFont(new java.awt.Font("Andale Mono",0,14));
        this.add(lResultado);
        //Text Area
        Area = new JTextArea();
        Scroll = new JScrollPane(Area);
        Scroll.setBounds(400,370,200,80);
        Scroll.setFont(new java.awt.Font("Andale Mono",0,14));
        Area.setText("Aqui Aparecera su resultado");
        Scroll.setForeground(new java.awt.Color(0,0,0));
        Area.setEditable(false);
        this.add(Scroll);

        lFooter = new JLabel("2022 The Coca Cola Company");
        lFooter.setBounds(220,460,200,30);
        lFooter.setFont(new java.awt.Font("Andale Mono",0,14));
        lFooter.setForeground(new java.awt.Color(224,224,224));
        this.add(lFooter);
    }

    public void actionPerformed(ActionEvent e)
    {
        if(e.getSource() == calculo)
        {
            String nombre,apellidopaterno,apellidomaterno,departamento,antiguedad;
            nombre = nombreT.getText();
            apellidomaterno = apellidoMatT.getText();
            apellidopaterno = apellidoPatT.getText();
            departamento = ComboDep.getSelectedItem().toString();
            antiguedad = comboAnt.getSelectedItem().toString();
            if(nombre.equals("")|| apellidomaterno.equals("")||apellidopaterno.equals("")||departamento.equals("")||antiguedad.equals(""))
            {
                JOptionPane.showMessageDialog(null,"Primero debes rellenar todos los campos");
            }
            else
            {
                if(departamento.equals("Atencion al cliente"))
                {
                    if(antiguedad.equals("Menos de un año"))
                    {
                        Area.setText("El trabajador "+nombre+"\n del Departamento de "+departamento+"\n" +
                                "Con Una antiguerdad de "+antiguedad+"\nRecibe 6 dias de vacaciones");
                    }
                    if(antiguedad.equals("1-7 Años"))
                    {
                        Area.setText("El trabajador "+nombre+"\n del Departamento de "+departamento+"\n" +
                                "Con Una antiguerdad de "+antiguedad+"\nRecibe 9 dias de vacaciones");
                    }
                    if(antiguedad.equals("mas de 7 años"))
                    {
                        Area.setText("El trabajador "+nombre+"\n del Departamento de "+departamento+"\n" +
                                "Con Una antiguerdad de "+antiguedad+"\nRecibe 14 dias de vacaciones");
                    }
                }
                else if(departamento.equals("Departamento de logistica"))
                {
                    if(antiguedad.equals("Menos de un año"))
                    {
                        Area.setText("El trabajador "+nombre+"\n del Departamento de "+departamento+"\n" +
                                "Con Una antiguerdad de "+antiguedad+"\nRecibe 5 dias de vacaciones");
                    }
                    if(antiguedad.equals("1-7 Años"))
                    {
                        Area.setText("El trabajador "+nombre+"\n del Departamento de "+departamento+"\n" +
                                "Con Una antiguerdad de "+antiguedad+"\nRecibe 8 dias de vacaciones");
                    }
                    if(antiguedad.equals("mas de 7 años"))
                    {
                        Area.setText("El trabajador "+nombre+"\n del Departamento de "+departamento+"\n" +
                                "Con Una antiguerdad de "+antiguedad+"\nRecibe 13 dias de vacaciones");
                    }
                }
                else if(departamento.equals("Departamento de Gerencia"))
                {
                    if(antiguedad.equals("Menos de un año"))
                    {
                        Area.setText("El trabajador "+nombre+"\n del Departamento de "+departamento+"\n" +
                                "Con Una antiguerdad de "+antiguedad+"\nRecibe 8 dias de vacaciones");
                    }
                    if(antiguedad.equals("1-7 Años"))
                    {
                        Area.setText("El trabajador "+nombre+"\n del Departamento de "+departamento+"\n" +
                                "Con Una antiguerdad de "+antiguedad+"\nRecibe 11 dias de vacaciones");
                    }
                    if(antiguedad.equals("mas de 7 años"))
                    {
                        Area.setText("El trabajador "+nombre+"\n del Departamento de "+departamento+"\n" +
                                "Con Una antiguerdad de "+antiguedad+"\nRecibe 18 dias de vacaciones");
                    }
                }
            }
        }
        if(e.getSource() == rojo)
        {
            getContentPane().setBackground(new java.awt.Color(255,0,0));
        }
        if(e.getSource() == negro)
        {
            getContentPane().setBackground(new java.awt.Color(30,30,30));
        }
        if(e.getSource() == morado)
        {
            getContentPane().setBackground(new java.awt.Color(124,45,240));
        }
        if(e.getSource() == nuevo)
        {
            nombreT.setText("");
            apellidoMatT.setText("");
            apellidoPatT.setText("");
            ComboDep.setSelectedIndex(0);
            comboAnt.setSelectedIndex(0);
            Area.setText("Aqui Aparecera su resultado");
        }
        if(e.getSource() == Salir)
        {
            Bienvenida ventana = new Bienvenida();
            ventana.setBounds(0,0,400,450);
            ventana.setLocationRelativeTo(null);
            ventana.setResizable(false);
            ventana.setDefaultCloseOperation(EXIT_ON_CLOSE);
            ventana.setVisible(true);
            this.setVisible(false);
        }
        if(e.getSource() == Creador)
        {
            JOptionPane.showMessageDialog(null,"Creado Por Levi Alexander para el curso" +
                    "desarrollo en java, Mi github: https://github.com/Aalxnder");
        }
    }

    public static void main(String[] args)
    {
        Principal ventanaPrincipal = new Principal();
        ventanaPrincipal.setBackground(new Color(255,255,255));
        ventanaPrincipal.setBounds(0,0,700,550);
        ventanaPrincipal.setLocationRelativeTo(null);
        ventanaPrincipal.setDefaultCloseOperation(EXIT_ON_CLOSE);;
        ventanaPrincipal.setResizable(false);
        ventanaPrincipal.setVisible(true);
    }
}
