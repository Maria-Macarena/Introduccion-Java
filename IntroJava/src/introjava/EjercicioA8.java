/*Realizar un programa que solo permita introducir solo frases o palabras de 8 de
largo. Si el usuario ingresa una frase o palabra de 8 de largo se deberá de imprimir
un mensaje por pantalla que diga “CORRECTO”, en caso contrario, se deberá
imprimir “INCORRECTO”.
 */
package introjava;

import java.util.Scanner;

/**
 *
 * @author Macarena Cardozo.
 */
public class EjercicioA8 {

    public static void main(String[] args) {

        Scanner read = new Scanner(System.in);

        String frase;
        int largo;

        System.out.println("Ingresá una frase: ");
        frase = read.nextLine();

        if (frase.length() == 8) {
            System.out.println("Correcto!!");
        } else {

            System.out.println("Incorrecto!!");
        }

    }

}
