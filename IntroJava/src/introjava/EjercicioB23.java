/*Un cuadrado mágico 3 x 3 es una matriz 3 x 3 formada por números del 1 al 9
donde la suma de sus filas, sus columnas y sus diagonales son idénticas. Crear un
programa que permita introducir un cuadrado por teclado y determine si este
cuadrado es mágico o no. El programa deberá comprobar que los números
introducidos son correctos, es decir, están entre el 1 y el 9.
 */
package introjava;

import java.util.Scanner;

/**
 *
 * @author Macarena Cardozo.
 *
 * 27
 */
public class EjercicioB23 {

    public static void main(String[] args) {

        Scanner read = new Scanner(System.in);

        int n = 3;
        boolean check=false;

        int[][] matriz = new int[n][n];

        //metodos
        matriz = crearCubo(n);
        imprimir(matriz);
        sumarFilas(matriz);
        sumarColumnas(matriz);
        sumarDiagonalPpal(matriz);
        sumarDiagonalSecundaria(matriz);
        
        System.out.println("");
        
        if(verificarFilasColumnas(matriz) == verificarDiagonales(matriz)){
            
            System.out.println("LA MATRIZ ES UN CUBO MÁGICO .!!!!!");
        }else{
            System.out.println("LA MATRIZ NO ES UN CUBO MÁGICO .!!!!");
        }
        

        System.out.println("");

    }

    public static int[][] crearCubo(int n) {

        Scanner read = new Scanner(System.in);
        int[][] matriz = new int[n][n];
        int valor;

        for (int i = 0; i < n; i++) {

            for (int j = 0; j < n; j++) {
                System.out.print("Ingresá un valor para"
                        + " [ " + i + " ] " + " [ " + j + " ] : ");
                valor = read.nextInt();

                if (valor < 10 && valor > 0) {
                    matriz[i][j] = valor;
                } else {
                    System.out.print("Por favor, ingresa un número correcto: ");
                    valor = read.nextInt();
                }

            }
        }

        return matriz;
    }

    public static void imprimir(int[][] matriz) {

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                System.out.print(" [" + matriz[i][j] + "] ");
            }
            System.out.println("");
        }

    }

    public static boolean sumarFilas(int[][] matriz) {

        int sumarfila = 0, sumarcolumna = 0, contador = 0, auxF0 = 0, auxF1 = 0, auxF2 = 0;

        boolean check = false;

        for (int i = 0; i < matriz.length; i++) {

            sumarfila = 0;

            for (int j = 0; j < matriz.length; j++) {

                sumarfila += matriz[i][j];

                if (i == 0) {

                    auxF0 = sumarfila;
                }

                if (i == 1) {

                    auxF1 = sumarfila;
                }

                if (i == 2) {

                    auxF2 = sumarfila;
                }

            }
            System.out.println("");

            System.out.print("Fila N°" + contador + " = " + sumarfila);

            System.out.println("");

            if (auxF0 == auxF1 && auxF1 == auxF2) {
                check = true;
            }

            contador++;

        }

        System.out.println("La suma de todas las Filas son iguales: " + check);
        
        return check;

    }

    public static boolean sumarColumnas(int[][] matriz) {

        int sumarfila = 0, sumarcolumna = 0, contador = 0, auxC0 = 0, auxC1 = 0, auxC2 = 0;

        boolean check = false;

        for (int i = 0; i < matriz.length; i++) {

            sumarcolumna = 0;

            for (int j = 0; j < matriz.length; j++) {

                sumarcolumna += matriz[j][i];

                auxC0 += matriz[0][i];
                auxC1 += matriz[1][i];
                auxC2 += matriz[2][i];

            }

            System.out.println("");

            System.out.print("Columna N° " + contador + " = " + sumarcolumna);

            if (auxC0 == auxC1 && auxC0 == auxC2) {
                check = true;
            }

            contador++;

        }

        System.out.println("");
        System.out.println("La suma de todas las Columnas son iguales: " + check);
        
        return check;

    }
    
    public static int sumarDiagonalPpal(int [][] matriz){
        
        int suma=0;
        
        for(int i=0;i<matriz.length;i++){
            for(int j=0;j<matriz.length;j++){
                
                if(i==j){
                    suma += matriz[i][j];
                }
            }
        }
        
        System.out.println("Suma de la Diagonal Ppal: "+suma);
        
        return suma;
    }
    
    public static int sumarDiagonalSecundaria(int [][] matriz){
        
        int suma=0;
        
        for(int i=0;i<matriz.length;i++){
            for(int j=0;j<matriz.length;j++){
                
                if(i+j == (matriz.length-1)){
                    suma += matriz[i][j];
                }
            }
        }
        
        System.out.println("Suma de la Diagonal Secundaria: "+suma);
        
        return suma;
    }
    
    public static boolean verificarDiagonales(int [][]matriz){
        
        boolean check= false;
        
        
        if(sumarDiagonalPpal(matriz) == sumarDiagonalSecundaria(matriz)){
            check = true;
        }
        
        
        
        return check;
    }
    
    public static boolean verificarFilasColumnas(int [][]matriz){
        
        boolean check= false;
        
        
        if(sumarFilas(matriz) == sumarColumnas(matriz)){
            check = true;
        }
        
        
        
        return check;
    }

}
