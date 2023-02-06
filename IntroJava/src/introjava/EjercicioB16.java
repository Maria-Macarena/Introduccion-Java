/*Realizar un programa que lea 4 números (comprendidos entre 1 y 20) e imprima el
número ingresado seguido de tantos asteriscos como indique su valor.
5 *****
3 ***
11 ***********
2 **
 */
package introjava;

import java.util.Scanner;

/**
 *
 * @author Macarena Cardozo.
 */
public class EjercicioB16 {

    public static void main(String[] args) {

        Scanner read = new Scanner(System.in);

        int num1, num2, num3, num4;

        System.out.println("Ingresa el primer número que se encuentre"
                + " entre 1 y 20");
        num1 = read.nextInt();

        System.out.println("Ingresa el segundo número que se encuentre"
                + " entre 1 y 20");
        num2 = read.nextInt();

        System.out.println("Ingresa el tercer número que se encuentre"
                + " entre 1 y 20");
        num3 = read.nextInt();

        System.out.println("Ingresa el cuarto número que se encuentre"
                + " entre 1 y 20");
        num4 = read.nextInt();

        if (num1 < 1 || num1 > 20) {
            System.out.println("El número ingresado en el primer lugar"
                    + " no es válido, ingrese la opción correcta");
            num1 = read.nextInt();

        }

        if (num2 < 1 || num2 > 20) {
            System.out.println("El número ingresado en el segundo lugar"
                    + " no es válido, ingrese la opción correcta");
            num2 = read.nextInt();
        }

        if (num3 < 1 || num3 > 20) {
            System.out.println("El número ingresado en el tercer lugar"
                    + " no es válido, ingrese la opción correcta");
            num3 = read.nextInt();
        }

        if (num4 < 1 || num4 > 20) {
            System.out.println("El número ingresado en el cuarto lugar"
                    + " no es válido, ingrese la opción correcta");
            num4 = read.nextInt();
        }
        
        System.out.print(num1);
        for(int i=0;i<num1;i++){
            System.out.print("*");
        }
        
        System.out.println("");
        
        System.out.print(num2);
        for(int i=0;i<num2;i++){
            System.out.print("*");
        }
        
        System.out.println("");

        System.out.print(num3);
        for(int i=0;i<num3;i++){
            System.out.print("*");
        }
        
        System.out.println("");
        
        System.out.print(num4);
        for(int i=0;i<num4;i++){
            System.out.print("*");
        }
        
        System.out.println("");
    }

}
