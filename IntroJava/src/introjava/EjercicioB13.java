/*Escriba un programa que lea 20 números. Si el número leído es igual a cero se debe
salir del bucle y mostrar el mensaje "Se capturó el numero cero". El programa
deberá calcular y mostrar el resultado de la suma de los números leídos, pero si el
número es negativo no debe sumarse.
 */
package introjava;

import java.util.Scanner;

/**
 *
 * @author Macarena Cardozo.
 */
public class EjercicioB13 {

    public static void main(String[] args) {

        Scanner read = new Scanner(System.in);

        int num, suma = 0;

        for (int i = 0; i < 20; i++) {
            System.out.println("ingresá un número");
            num = read.nextInt();

            if (num == 0) {
                break;
            }

            suma = suma + num;
            i++;
        }

        System.out.println("La suma de los números ingresados es: " + suma);

    }

}
