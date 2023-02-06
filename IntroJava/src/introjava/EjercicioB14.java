/*Realizar un programa que simule el funcionamiento de un dispositivo RS232, este
tipo de dispositivo lee cadenas enviadas por el usuario. Las cadenas deben llegar
con un formato fijo: tienen que ser de un máximo de 5 caracteres de largo, el primer
carácter tiene que ser X y el último tiene que ser una O.
Las secuencias leídas que respeten el formato se consideran correctas, la
secuencia especial “&&&&&” marca el final de los envíos (llamémosla FDE), y toda
secuencia distinta de FDE, que no respete el formato se considera incorrecta.
Al finalizar el proceso, se imprime un informe indicando la cantidad de lecturas
correctas e incorrectas recibidas.
 */
package introjava;

import java.util.Scanner;

/**
 *
 * @author Macarena Cardozo.
 */
public class EjercicioB14 {

    public static void main(String[] args) {

        Scanner read = new Scanner(System.in);

        String frase;

        do {

            System.out.println("Teclea una frase: ");
            frase = read.nextLine().toUpperCase();

            if (frase.length() == 5 && frase.startsWith("X") && frase.endsWith("O")) {
                System.out.println("Correcto!");
            } else if (frase.equals("&&&&&")) {
                System.out.println("El programa ha terminado!");
            } else {
                System.out.println("Incorrecto!");
            }

        } while (!frase.equals("&&&&&"));

    }

}
