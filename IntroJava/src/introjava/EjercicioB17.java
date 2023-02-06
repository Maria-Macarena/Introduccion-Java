/*Crea una aplicación que a través de una función nos convierta una cantidad de
pesos introducida por teclado a otra moneda, estas pueden ser a dólares, yenes o
libras. La función tendrá como parámetros, la cantidad de euros y la moneda a
converir, este no devolverá ningún valor y mostrará un
mensaje indicando el cambio (void).
 */
package introjava;

import java.util.Scanner;

/**
 *
 * @author Macarena Cardozo.
 */
public class EjercicioB17 {

    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);

        int monto;
        double resultado;
        int op;

        System.out.print("Ingresa el monto a convertir: $ ");
        monto = read.nextInt();

        System.out.println("Elige la opción del tipo de cambio");
        System.out.println("1 - DÓLAR ESTADOUNIDENSE");
        System.out.println("2 - EURO");
        System.out.println("3 - LIBRA ESTERLINA");
        System.out.println("4 - FRANCO SUIZO");
        op = read.nextInt();

        if (op < 1 || op > 4) {
            System.out.println("La opción ingresada es incorrecta!");
            System.out.print("Ingresa nuevamente la opción: ");
            op = read.nextInt();
        }

        switch (op) {
            case 1:
                resultado = monto * 0.0054;
                System.out.println("$ " + monto + " pesos equivalen a US$ " + resultado + " Dólares Estadounidendes");
                break;
            case 2:
                resultado = monto * 0.0050;
                System.out.println("$ " + monto + " pesos equivalen a € " + resultado + " Euros");
                break;
            case 3:
                resultado = monto * 0.0044;
                System.out.println("$ " + monto + " pesos equivalen a £ " + resultado + " Libras Esterlinas");
                break;
            case 4:
                resultado = monto * 0.0050;
                System.out.println("$ " + monto + " pesos equivalen a CHF " + resultado + " Francos Suizos");
                break;

        }

    }

}
