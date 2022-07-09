package POO.Abstraccion;

import InterfacesGraficas.InterfacesBasic.Jlabel;

import javax.swing.*;
import java.awt.event.*;
import java.util.Scanner;
import javax.swing.ImageIcon;

public class RectanguloMain extends JFrame implements ActionListener
{
    private JLabel titulo,LabelArea, LabelPerimetro,resultados,Larea,Lperimetro;
    private JTextField area,altura, Rarea,Rperimetro;
    private JButton boton,botonLimpiar;
    float resultadoArea,resultadoPerimetro;
    public RectanguloMain()
    {
        setLayout(null);
        getContentPane().setBackground(new java.awt.Color(224,224,226));


        titulo = new JLabel("Area y perimetro de rectangulo");
        titulo.setBounds(20,10,300,30);
        titulo.setForeground(new java.awt.Color(0,0,0));
        titulo.setFont(new java.awt.Font("Andale Mono",1,17));
        this.add(titulo);

        //Area
        LabelArea = new JLabel("ingresa la Base");
        LabelArea.setBounds(100,50,300,30);
        LabelArea.setFont(new java.awt.Font("Andale Mono",0,12));
        LabelArea.setForeground(new java.awt.Color(0,0,0));
        this.add(LabelArea);

        area = new JTextField();
        area.setBounds(10,80,280,30);
        area.setBackground(new java.awt.Color(200,200,200));
        area.setForeground(new java.awt.Color(0,0,0));
        area.setFont(new java.awt.Font("Andale Mono",0,12));
        this.add(area);

        LabelPerimetro= new JLabel("ingresa la Altura");
        LabelPerimetro.setBounds(90,120,300,30);
        LabelPerimetro.setFont(new java.awt.Font("Andale Mono",0,12));
        LabelPerimetro.setForeground(new java.awt.Color(0,0,0));
        this.add(LabelPerimetro);

        altura = new JTextField();
        altura.setBounds(10,160,280,30);
        altura.setBackground(new java.awt.Color(200,200,200));
        altura.setForeground(new java.awt.Color(0,0,0));
        altura.setFont(new java.awt.Font("Andale Mono",0,12));
        this.add(altura);

        //boton
        boton = new JButton("calcular");
        boton.setBounds(180,200,100,30);
        boton.setForeground(new java.awt.Color(0,0,0));
        boton.setFont(new java.awt.Font("Andale Mono",0,14));
        boton.setBackground(new java.awt.Color(200,200,200));
        boton.addActionListener(this);
        this.add(boton);

        botonLimpiar = new JButton("Limpiar");
        botonLimpiar.setBounds(10,200,100,30);
        botonLimpiar.setForeground(new java.awt.Color(0,0,0));
        botonLimpiar.setFont(new java.awt.Font("Andale Mono",0,14));
        botonLimpiar.setBackground(new java.awt.Color(200,200,200));
        botonLimpiar.addActionListener(this);
        this.add(botonLimpiar);

        resultados = new JLabel("Resultados");
        resultados.setBounds(120,240,300,30);
        resultados.setFont(new java.awt.Font("Andale Mono",0,12));
        resultados.setForeground(new java.awt.Color(0,0,0));
        this.add(resultados);

        Larea = new JLabel("Area");
        Larea.setBounds(50,270,300,30);
        Larea.setFont(new java.awt.Font("Andale Mono",0,12));
        Larea.setForeground(new java.awt.Color(0,0,0));
        this.add(Larea);

        Rarea = new JTextField();
        Rarea.setBounds(10,300,120,30);
        Rarea.setBackground(new java.awt.Color(200,200,200));
        Rarea.setForeground(new java.awt.Color(0,0,0));
        Rarea.setFont(new java.awt.Font("Andale Mono",0,12));
        Rarea.setEditable(false);
        this.add(Rarea);

        Lperimetro = new JLabel("Perimetro");
        Lperimetro.setBounds(190,270,300,30);
        Lperimetro.setFont(new java.awt.Font("Andale Mono",0,12));
        Lperimetro.setForeground(new java.awt.Color(0,0,0));
        this.add(Lperimetro);

        Rperimetro = new JTextField();
        Rperimetro.setBounds(160,300,120,30);
        Rperimetro.setBackground(new java.awt.Color(200,200,200));
        Rperimetro.setForeground(new java.awt.Color(0,0,0));
        Rperimetro.setEditable(false);
        Rperimetro.setFont(new java.awt.Font("Andale Mono",0,12));
        this.add(Rperimetro);
    }
    public void actionPerformed(ActionEvent e)
    {
        if(e.getSource() == boton)
        {
            String R1,R2;
            //tomar los datos del JTextfiled
            R1 = area.getText();
            R2 = altura.getText();


            if(R1.equals("") || R2.equals(""))
            {
                JOptionPane.showMessageDialog(null,"Primero debes rellenar los campos");
            }
            else
            {
                //conversion de datos
                float base = Float.parseFloat(R1);
                float alturaa = Float.parseFloat(R2);
                Rectangulo calculo = new Rectangulo(base,alturaa);

                resultadoArea = calculo.Area();
                Rarea.setText("El area es: "+resultadoArea);

                resultadoPerimetro = calculo.Perimetro();
                Rperimetro.setText("El area es: "+resultadoPerimetro);
            }

        }
        if (e.getSource() == botonLimpiar)
        {
            Rarea.setText("");
            Rperimetro.setText("");
            area.setText("");
            altura.setText("");
        }
    }
    public static void main(String[] args)
    {
        RectanguloMain ventana = new RectanguloMain();

        ventana.setBounds(0,0,300,400);
        ventana.setLocationRelativeTo(null);
        ventana.setDefaultCloseOperation(EXIT_ON_CLOSE);
        ventana.setTitle("Area y perimetro de rectangulo");
        ventana.setVisible(true);
        ventana.setResizable(false);
        //Rectangulo calculo = new Rectangulo(base,altura);
        //calculo.imprimir();
    }
}
