/*Escribir un programa que lea un número entero por teclado y muestre por pantalla
el doble, el triple y la raíz cuadrada de ese número.
*/
package introjava;

import java.util.Scanner;

/**
 *
 * @author Macarena Cardozo
 */
public class EjercicioA3 {

    public static void main(String[] args) {

        Scanner read = new Scanner(System.in);

        String frase;

        System.out.println("Ingresá una frase: ");
        frase = read.nextLine();

        if (frase.equals("Eureka")) {
            System.out.println("Correcto!");
        } else {
            System.out.println("Incorrecto!");
        }

    }

}
