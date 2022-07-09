package POO.Encapsulamiento;

//funciones logicas de una lavadora

public class Lavadora
{
    //las variables llenadocompleto,tipoDeRopa,secadoCompleto y lavadoCompleto cambiaran su valor segun los valores
    private int kilos = 0,LlenadoCompleto = 0,tipoDeRopa = 0,lavadoCompleto = 0,secadoCompleto = 0;

    public Lavadora(int kilos,int tipoDeRopa)
    {
        this.kilos = kilos;
        this.tipoDeRopa = tipoDeRopa;
    }

    //funcion llenado
    private void llenado()
    {
        if(kilos <= 12)
        {
            LlenadoCompleto = 1;
            System.out.println("Llenando");
            System.out.println("Llenado Completo");
        }
        else
        {
            System.out.println("La carga de ropa es muy pesada, reduce la carga");
        }
    }

    //funcion lavado
    private void lavado()
    {
        //LLamar funcion llenado
        llenado();
        if(LlenadoCompleto == 1)
        {
            if(tipoDeRopa == 1)
            {
                System.out.println("Ropa blanca / Se realizara un lavado suave");
                System.out.println("Lavando");
                lavadoCompleto = 1;
            }
            else if (tipoDeRopa == 2)
            {
                System.out.println("Ropa de color / Se realizara un lavado intenso");
                System.out.println("Lavando");
                lavadoCompleto = 1;
            }
            else
            {
                System.out.println("El tipo de ropa No esta disponible");
                System.out.println("Se lavara como ropa de color / Lavado intenso");
                lavadoCompleto = 1;
            }
        }
        else
        {
            System.out.println("Nunca llenaste la lavadora, no se puede iniciar el lavado");
        }
    }

    //funcion secado
    private void secado()
    {
        //LLamar funcion lavado
        lavado();
        if(lavadoCompleto == 1)
        {
            System.out.println("Secando...");
            secadoCompleto = 1;
        }
        else
        {
            System.out.println("No se ha lavado la ropa, por lo cual no se puede secar");
        }
    }

    //Funcion ciclo finalizado
    public void cicloFinalizado()
    {
        //llamar funcion secado
        secado();
        if(secadoCompleto == 1)
        {
            System.out.println("Tu ropa esta lista!");
        }
    }
}
