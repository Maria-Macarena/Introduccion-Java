/*Dada una cantidad de grados centígrados se debe mostrar su equivalente en
grados Fahrenheit. La fórmula correspondiente es: F = 32 + (9 * C / 5). 
*/
package introjava;

import java.util.Scanner;

/**
 *
 * @author Macarena Cardozo.
 */
public class EjercicioA2 {

    public static void main(String[] args) {

        Scanner read = new Scanner(System.in);

        double grados;

        System.out.println("Ingresá la temperatura en grados centígrados: ");
        grados = read.nextDouble();

        double gradosFahrenheit = 32 + (9 * grados / 5);

        System.out.println(grados + "° centígrados equivale a " + gradosFahrenheit + "° Fahrenheit");
    }

}
