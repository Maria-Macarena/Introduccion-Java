/*Realizar un programa que rellene un matriz de 4 x 4 de valores aleatorios y la
muestre ordenada por sus columnas.
*/
package introjava;

import java.util.Scanner;

/**
 *
 * @author Macarena Cardozo.
 */
public class EjercicioB21 {

  
    public static void main(String[] args) {
        
    Scanner read = new Scanner(System.in);    
        
      int n=4;
      int [][] matriz = new int[n][n];
      
      
        
        
    }
    
    
    public static int [][] crearMatriz(int [][] matriz){
        
        for(int i=0;i<matriz.length;i++){
            for(int j=0;j<matriz.length;j++){
                
                matriz[i][j]= (int) Math.random()*99+1;
            }
        }
        
        
        return matriz;
    }
    
    
    
    public static void imprimirMatriz(int [][] matriz){
        
        
        for(int i=0;i<matriz.length;i++){
            for(int j=0;j<matriz.length;j++){
                System.out.println("[ "+i+" ]"+" [ "+j+" ]");
            }
        }
        
        
    }
    
    
    public static int [][] ordenarMatriz(int [][] matriz){
        
        for(int i=0;i<matriz.length;i++){
            for(int j=0;j<matriz.length;j++){
                
            }
        }
        
        return matriz;
    }
    
    
    
}
