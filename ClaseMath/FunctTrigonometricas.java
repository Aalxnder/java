package ClaseMath.Trigonometria;

import java.util.Scanner;

//Obtener sen, cos, tan, arcsen, arccos,arctan, esto solo acepta angulos en radianes y toca convertirlos a angulos
public class FunctTrigonometricas
{

    public static void main(String[] args)
    {
        double resultado;
        double anguloGrados;
        double Conversion;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingresa los angulos a convertir a radianes: ");
        anguloGrados = scanner.nextDouble();
        Conversion = Math.toRadians(anguloGrados);

        //Seno
        resultado = Math.sin(Conversion);
        System.out.println("El seno del angulo "+anguloGrados+" grados es: "+resultado);

        //Coseno
        resultado = Math.cos(Conversion);
        System.out.println("El coseno del angulo "+anguloGrados+" grados es: "+resultado);

        //tangente
        resultado = Math.tan(Conversion);
        System.out.println("La tangente del angulo "+anguloGrados+" grados es: "+resultado);

        //funciones trigonometricas inversas
        double valorIngresado = Math.cos(Conversion);

        //arccos
        Conversion = Math.acos(valorIngresado);
        anguloGrados = Math.toDegrees(Conversion); //convertir a grados
        System.out.println("Arccos de "+valorIngresado+" es: "+anguloGrados+" grados");
        //Arcsen
        Conversion = Math.asin(valorIngresado);
        anguloGrados = Math.toDegrees(Conversion); //convertir a grados
        System.out.println("Arcsin de "+valorIngresado+" es: "+anguloGrados+" grados");
        //arctan
        Conversion = Math.atan(valorIngresado);
        anguloGrados = Math.toDegrees(Conversion); //convertir a grados
        System.out.println("Arctan de "+valorIngresado+" es: "+anguloGrados+" grados");
    }

}
