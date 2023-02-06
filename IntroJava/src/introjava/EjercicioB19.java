/*Realizar un algoritmo que rellene un vector de tamaño N con valores aleatorios y le
pida al usuario un numero a buscar en el vector. El programa mostrará donde se
encuentra el numero y si se encuentra repetido
*/
package introjava;

import java.util.Scanner;

/**
 *
 * @author Macarena Cardozo.
 */
public class EjercicioB19 {

    
    public static void main(String[] args) {
        
    Scanner read = new Scanner(System.in); 
    
    
        int dimension,numero=0;
        
        System.out.print("Ingresa el tamaño del vector: ");
        dimension = read.nextInt();
    
        int [] vector= new int [dimension];
    
        
        
        // llamo a los métodos
        vector = crearVector( dimension);
        
        elegirNumero(numero);
        
        mostrarResultados(vector,numero);
        
        
    }
    
    // ---------------- crear vector ---------------------------------------
    public static int [] crearVector( int dimension ){
        
        int [] vector= new int [dimension];
        
        for(int i=0;i<dimension;i++){
            vector[i] = (int) (Math.random() * 4 + 1);
            System.out.println("[ "+vector[i]+" ]");
        }
        
        return vector;
        
    }
    
    // ------------------- elegir número ------------------------------------
    
    public static int elegirNumero(int numero){
        Scanner read = new Scanner(System.in); 
        
        System.out.println("Elegí un número del 1 al 20");
        numero = read.nextInt();
        
        if(numero<1 || numero>20){
            System.out.println("Por favor elige un número válido");
            numero= read.nextInt();
        }
        
        return numero;
    }
    
    // -------------------- mostrar resultados -----------------------------
    
    public static void mostrarResultados(int [] vector, int numero){
        
        int posicion=-1,count=0;
       
        
        for(int i=0;i<vector.length;i++){
            
            if(vector[i] == numero){
                posicion = vector[i] ;
                count= count +1;
                
            }
        }
        
        
        if(posicion == -1){
            System.out.println("El número ingresado no se encuentra en "
                    + "el vector!");
            
        }else{
            System.out.println("El número ingresado se encuentra en la"
                    + " posición: "+posicion+" y se repite: "+count);
        }
        
        
    }
}
