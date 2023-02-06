/*Simular la división usando solamente restas. Dados dos números enteros mayores
que uno, realizar un algoritmo que calcule el cociente y el residuo usando sólo
restas. Método: Restar el dividendo del divisor hasta obtener un resultado menor
que el divisor, este resultado es el residuo, y el número de restas realizadas es el
cociente. Por ejemplo: 50 / 13:
50 – 13 = 37 una resta realizada
37 – 13 = 24 dos restas realizadas
24 – 13 = 11 tres restas realizadas
dado que 11 es menor que 13, entonces: el residuo es 11 y el cociente es 3.

 */
package introjava;

import java.util.Scanner;

/**
 *
 * @author Macarena Cardozo
 */
public class EjercicioB34 {

    public static void main(String[] args) {

        Scanner read = new Scanner(System.in);

        /*
        el cociente será el número de restas que hagamos del divisor sobre el
        dividendo y su resultado hasta que la resta sea 0 o menor de 0.
        Y el resto será el valor de la última resta, pero en positivo.
         */
        System.out.println("Ingresar un número para usarlo como dividendo");
        int dividendo = read.nextInt();

        System.out.println("Ingresar un número para usarlo como divisor");
        int divisor = read.nextInt();

        //Definimos una variable que sea el cociente y que incrementaremos en cada resta.
        int cociente = 0;

        while (dividendo > 0) {
            cociente++;
            dividendo = dividendo - divisor;

        }

        System.out.println("Cociente " + cociente);
        System.out.println("Resto " + (-dividendo));
    }

}
