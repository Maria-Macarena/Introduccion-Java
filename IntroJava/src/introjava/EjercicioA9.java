/*Escriba un programa que pida una frase o palabra y valide si la primera letra de esa
frase es una ‘A’. Si la primera letra es una ‘A’, se deberá de imprimir un mensaje por
pantalla que diga “CORRECTO”, en caso contrario, se deberá imprimir
“INCORRECTO”
 */
package introjava;

import java.util.Scanner;

/**
 *
 * @author Macarena Cardozo.
 */
public class EjercicioA9 {

    public static void main(String[] args) {

        Scanner read = new Scanner(System.in);

        String letra;

        System.out.println("Ingresá una frase o una letra");
        letra = read.nextLine().toUpperCase();

        if (letra.startsWith("A")) {
            System.out.println("Correcto!");
        } else {
            System.out.println("Incorrecto!");
        }

    }

}
