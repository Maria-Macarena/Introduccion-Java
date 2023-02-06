/*Crear un programa que pida una frase y si esa frase es igual a “eureka” el programa
pondrá un mensaje de Correcto, sino mostrará un mensaje de Incorrecto. 
 */
package introjava;

import java.util.Scanner;

/**
 *
 * @author Macarena Cardozo.
 */
public class EjercicioA6 {

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
