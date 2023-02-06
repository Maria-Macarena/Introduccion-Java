/*Escriba un programa que valide si una nota está entre 1 y 10, sino está entre 0 y 10
la nota se pedirá de nuevo hasta que la nota sea correcta.*/
package introjava;

import java.util.Scanner;

/**
 *
 * @author Macarena Cardozo.
 */
public class EjercicioB10 {

    public static void main(String[] args) {

        Scanner read = new Scanner(System.in);

        int nota = 0;

        do {

            System.out.println("Tecleá un número entre 0 y 10: ");
            nota = read.nextInt();

        } while (nota <= 1 || nota >= 10);

    }

}
