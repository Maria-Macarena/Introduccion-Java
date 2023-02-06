/*Escriba un programa que averigüe si dos vectores de N enteros son iguales (la
comparación deberá detenerse en cuanto se detecte alguna diferencia entre los
elementos).

 */
package introjava;

import java.util.Scanner;

/**
 *
 * @author Macarena Cardozo.
 */
public class EjercicioB43 {

    public static void main(String[] args) {

        Scanner read = new Scanner(System.in);

        System.out.print("Ingresar el tamaño de los vectores: ");
        int n = read.nextInt();

        //Llamo a los métodos
        int[] vector1 = llenarVector(n);
        int[] vector2 = llenarVector(n);

        System.out.println("VECTOR N°1");
        MostrarVector(vector1);
        
        System.out.println("VECTOR N°2");
        MostrarVector(vector2);
        
        
        System.out.println("");
        System.out.print("¿Son iguales los dos vectores?: "+CompararVector(vector1, vector2));
        System.out.println("");
    }

    public static int[] llenarVector(int n) {

        Scanner read = new Scanner(System.in);

        int[] vector = new int[n];

        for (int i = 0; i < n; i++) {

            vector[i] = (int) (Math.random() * 21+1);

        }

        return vector;
    }

    public static void MostrarVector(int[] vector) {

        for (int i = 0; i < vector.length; i++) {

            System.out.print(" [ " + vector[i] + " ]  ");

        }

    }

    public static boolean CompararVector(int[] vector1, int[] vector2) {

        boolean check = true;

        for (int i = 0; i < vector1.length; i++) {
            for (int j = 0; j < vector2.length; j++) {

                if (vector1[i] != vector2[i]) {
                    check = false;

                    return check;
                }
            }
        }
        return check;

    }

}
