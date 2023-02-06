/*Realizar un algoritmo que calcule la suma de todos los elementos de un vector de
tamaño N, con los valores ingresados por el usuario.

 */
package introjava;

import java.util.Scanner;

/**
 *
 * @author Macarena Cardozo.
 */
public class EjercicioB42 {

    public static void main(String[] args) {

        Scanner read = new Scanner(System.in);

        System.out.print("Ingresa el tamaño del vector: ");
        int n = read.nextInt();

        int[] vector = new int[n];

        //Llamo a los Metodos
        vector = llenarVector(n);
        MostrarVector(vector);
        int suma = SumaVector(vector);
        System.out.println("");
        System.out.println("La suma de los elementos ingresados es: "+suma);
        System.out.println("");

    }

    public static int[] llenarVector(int n) {

        Scanner read = new Scanner(System.in);

        int[] vector = new int[n];

        for (int i = 0; i < n; i++) {

            System.out.print("Ingresa un valor para [ " + i + " ] : ");
            vector[i] = read.nextInt();
            
        }

        return vector;
    }

    public static void MostrarVector(int[] vector) {

        Scanner read = new Scanner(System.in);

        for (int i = 0; i < vector.length; i++) {

            System.out.print(" [ " + vector[i] + " ]  ");

        }

    }

    public static int SumaVector(int[] vector) {

        Scanner read = new Scanner(System.in);

        int suma = 0;

        for (int i = 0; i < vector.length; i++) {

            suma += vector[i];
        }

        return suma;
    }

}
