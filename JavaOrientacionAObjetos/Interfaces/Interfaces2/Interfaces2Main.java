package POO.interfaces.Interfaces2;
import java.util.*;
public class Interfaces2Main
{
    public static void main(String[] args)
    {
        Jefatura jefe_RRHH = new  Jefatura("Juan",55000,2006,9,25);
        jefe_RRHH.estableceIncentivo(2570);
        Empleado[] misEmpleados = new Empleado[6];
        misEmpleados[0] = new Empleado("Ana",30000,2000,07,07);
        misEmpleados[1] = new Empleado("Fernanda",35000,1200,10,07);
        misEmpleados[2] = new Empleado("Antonio",40000,3000,07,05);
        misEmpleados[3] = new Empleado("Maria",30000,2000,07,07);
        misEmpleados[4] = jefe_RRHH;
        misEmpleados[5] = new Jefatura("Guzman ",24000,4000,07,07);

        Jefatura jefa_finanzas=(Jefatura)misEmpleados[5];
        jefa_finanzas.estableceIncentivo(55000);

        System.out.println(jefa_finanzas.TomasDeciciones("Aumento de sueldo"));

        System.out.println("El bonus de navidad de el jefe de finanzas: "+jefa_finanzas.dameNombre()+" Tiene un bonus de: "+jefa_finanzas.establecebonus(2000)+"\n");
        System.out.println(misEmpleados[3].dameNombre()+" tiene un bonus de: "+misEmpleados[3].establecebonus(500)+"\n");
        for(Empleado e: misEmpleados)
        {
            e.subeSueldo(5);
        }

        Arrays.sort(misEmpleados);

        for(Empleado e: misEmpleados)
        {
            System.out.println("Nombre: "+e.dameNombre()+"\n"+
                               "Sueldo: "+e.dameSueldo()+"\n"+
                               "fecha de alta: "+e.dameFechaContrato());
            System.out.println("\n");
        }


    }

}
class Empleado implements Comparable,Trabajadores
{
    public Empleado(String nom,double sue,int agno,int mes,int dia)
    {
        nombre = nom;
        sueldo = sue;
        GregorianCalendar calendario = new GregorianCalendar(agno,mes-1,dia);
        altaContrato = calendario.getTime();
        ++IdSiguiente;
        Id=IdSiguiente;

    }

    //bonus
    public double establecebonus(double bonus)
    {
        return Trabajadores.bonus_base+bonus;
    }

    public String dameNombre()
    {
        return nombre;
    }
    public double dameSueldo()
    {
        return sueldo;
    }
    public Date dameFechaContrato()
    {
        return altaContrato;
    }
    public void subeSueldo(double porcentaje)
    {
        double aumento=sueldo*porcentaje/100;
        sueldo+=aumento;
    }

    @Override
    public int compareTo(Object miObjeto)
    {
        Empleado otroEmpleado = (Empleado) miObjeto;
        if (this.sueldo < otroEmpleado.sueldo)
        {
            return -1;
        }

        if(this.sueldo>otroEmpleado.sueldo)
        {
            return 1;
        }
            return 0;
    }


    private String nombre;
    private double sueldo;
    private Date altaContrato;
    private static int IdSiguiente;
    private int Id;
}

class Jefatura extends Empleado implements Jefes
{
    public double incentivo;
    public Jefatura(String nom,double sue,int agno,int mes,int dia)
    {
        super(nom, sue, agno, mes, dia);
    }
    public void estableceIncentivo(double b)
    {
        incentivo = b;
    }
    public double dameSueldo()
    {
        double sueldoJefe = super.dameSueldo();
        return sueldoJefe+incentivo;
    }
    @Override
    public String TomasDeciciones(String decision)
    {

        System.out.println(" ");
        return "Un Miembro de la direccion ha tomado la decision de: "+decision;
    }

    public double establecebonus(double bonus)
    {
        double prima = 2000;
        return Trabajadores.bonus_base+bonus+prima;
    }
}