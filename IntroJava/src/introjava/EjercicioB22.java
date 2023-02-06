/*Realice un programa que compruebe si una matriz dada es anti simétrica. Se dice
que una matriz A es anti simétrica cuando ésta es igual a su propia traspuesta, pero
cambiada de signo. Es decir, A es anti simétrica si A = -AT. La matriz traspuesta de
una matriz A se denota por AT y se obtiene cambiando sus filas por columnas (o
viceversa).
 */
package introjava;

import java.util.Scanner;

/**
 *
 * @author Macarena Cardozo.
 */
public class EjercicioB22 {

    public static void main(String[] args) {

        Scanner read = new Scanner(System.in);

        int filas, columnas;

        System.out.print("Ingrese el número de filas de la "
                + " matriz: ");
        filas = read.nextInt();

        System.out.print("Ingrese el números de columnas: ");
        columnas = read.nextInt();

        int matriz[][] = new int[filas][columnas];
        

         // -------------------llamado de métodos ---------------------------------------
         
        System.out.println("Ingresa los números para la MATRIZ ORIGINAL");

        matriz = crearMatriz(filas, columnas);//creamos la matriz
        
        System.out.println("");
        
        verificar(filas,columnas,matriz);//verificamos si es antisimetrica

        System.out.println("MATRIZ ORIGINAL");

        imprimirMatriz(filas, columnas, matriz);//mostramos la matriz original

        System.out.println("");

        System.out.println("MATRIZ TRASPUESTA");

        imprimirMatrizTraspuesta(filas, columnas, matriz);//mostramos la matriz traspuesta
        
        System.out.println("");
    }

    // --------------------- llenado de matriz original ----------------------------------
    public static int[][] crearMatriz(int filas, int columnas) {
        Scanner read = new Scanner(System.in);

        int matriz[][] = new int[filas][columnas];

        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                System.out.println("Teclea el valor de " + i + "," + j + " : ");

                matriz[i][j] = read.nextInt();
            }
        }

        return matriz;

    }
    
    
    
     // --------------------- verificamos si es antisimétrica ----------------------------------
    public static void verificar(int filas, int columnas, int[][] matriz) {

        boolean check=false;
        
        
            for (int i = 0; i < filas; i++) {
                for (int j = 0; j < columnas; j++) {
                    if (matriz[i][j] == -matriz[j][i]) {
                        check= true;
                    }

                }
                

            }
           if(check){
            System.out.println("La matriz es antisimétrica!");
        }else{
            System.out.println("La matriz no es antisimétrica!");
        }
        

        
        
        
    }

    
     // --------------------- imprimir matriz original ----------------------------------

    public static void imprimirMatriz(int filas, int columnas, int[][] matriz) {

        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                System.out.print(" [" + matriz[i][j] + "] ");

            }
            System.out.println("");

        }
    }
    
     // --------------------- imprimir de matriz traspuesta ----------------------------------

    public static void imprimirMatrizTraspuesta(int filas, int columnas, int[][] matriz) {

        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                System.out.print(" [" + -matriz[j][i] + "] ");

            }
            System.out.println("");

        }
        
    }

    

}
