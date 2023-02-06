/*Realizar un algoritmo que rellene un vector con los 100 primeros números enteros y
los muestre por pantalla en orden descendente.
*/
package introjava;

import java.util.Scanner;

/**
 *
 * @author Macarena Cardozo.
 */
public class EjercicioB18 {

    
    public static void main(String[] args) {
    Scanner read = new Scanner(System.in);

    int dimension=100;
    
    int [] vector = new int [dimension]; 
    
    crearVector(vector, dimension);
    
    imprimirVector(vector, dimension);
        
        
    }
    
    public static int [] crearVector(int [] vector, int dimension){
        
        
      
        
        for(int i=0;i<dimension;i++){
            vector[i]= i+1;
        }
        
        return vector;
    }
    
    
    public static void imprimirVector(int [] vector, int dimension){
        
        for(int i= dimension-1;i>=0;i--){
            System.out.print("[ "+vector[i]+" ]");
        }
        
    }
    
}
