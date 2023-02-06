/*Crear un programa que dado un numero determine si es par o impar.
 */
package introjava;

import java.util.Scanner;

/**
 * @author Macarena Cardozo.
 */
public class EjercicioA5 {

    public static void main(String[] args) {

        Scanner read = new Scanner(System.in);

        int num;

        System.out.println("Ingresá un número: ");
        num = read.nextInt();

        if (num % 2 == 0) {
            System.out.println(num + " Es número par");
        } else {
            System.out.println(num + " Es número impar");
        }

    }

}
