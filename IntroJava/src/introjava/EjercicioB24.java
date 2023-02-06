/*Dadas dos matrices cuadradas de números enteros, la matriz M de 10x10 y la matriz
P de 3x3, se solicita escribir un programa en el cual se compruebe si la matriz P está
contenida dentro de la matriz M.
Para ello se debe verificar si entre todas las
submatrices de 3x3 que se pueden formar en la matriz M, desplazándose por filas o
columnas, existe al menos una que coincida con la matriz P. En ese caso, el
programa debe indicar la fila y la columna de la matriz M en la cual empieza el
primer elemento de la submatriz P.

 */
package introjava;

import java.util.Scanner;

/**
 *
 * @author Macarena Cardozo.
 */
public class EjercicioB24 {

    public static void main(String[] args) {

        Scanner read = new Scanner(System.in);

        int dimensionM = 10, dimensionP = 3;

        int[][] m = llenarM(dimensionM);

        int[][] p = llenarP(dimensionP);
        
        imprimir(m);
        imprimir(p);

        int check = busqueda(m, p);

        if (check == 1) {

        }

        System.out.println("ver : " + busqueda(m, p));

    }

    public static int[][] llenarM(int dimensionM) {

        int[][] m = new int[dimensionM][dimensionM];

        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m.length; j++) {
                m[i][j] = (int) (Math.random() * 14 + 1);
            }
        }

        return m;
    }

    public static int[][] llenarP(int dimensionP) {

        int[][] p = new int[dimensionP][dimensionP];

        for (int i = 0; i < p.length; i++) {
            for (int j = 0; j < p.length; j++) {
                p[i][j] = (int) (Math.random() * 14 + 1);
            }
        }

        return p;
    }
    
    
    public static void imprimir(int [][] matriz){
        
        
        for(int i=0;i<matriz.length;i++){
            
            for(int j=0;j<matriz.length;j++){
            
                System.out.print("[ "+i+" ] "+"[ "+j+" ]");
        }
            System.out.println("");
        }
        
        
        
    }

    public static int busqueda(int[][] m, int[][] p) {

        boolean check = true;

        for (int i = 0; i < m.length; i++) {

            for (int j = 0; j < m.length; j++) {

                

                for (int x = 0; x < p.length; x++) {

                    for (int r = 0; r < p.length; r++) {

                        if (m[i] == p[0]) {
                            check = true;
                            
                            if (m.length <= i + j || p[r] != m[i + j]) {
                                check = false;
                                break;
                            }

                            
                        }
                        
                        
                            if (check) {
                                return i;
                            }
                    }

                }
            }

        }

        
        return -1;
    }

}
