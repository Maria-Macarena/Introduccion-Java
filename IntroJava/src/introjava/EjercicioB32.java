/*Realice un programa que calcule y visualice el valor máximo, el valor mínimo y el
promedio de n números (n>0). El valor de n se solicitará al principio del programa y
los números serán introducidos por el usuario. 

*/
package introjava;

import java.util.Scanner;

/**
 *
 * @author Macarena Cardozo.
 */
public class EjercicioB32 {

    
    public static void main(String[] args) {
        
        Scanner read = new Scanner(System.in);
        
        int limite,contador=0;
         
        
        System.out.print("Teclea la cantidad de números que deseas ingresar: ");
        limite=read.nextInt();
        
        int [] vector = new int[limite];        
        
        
        int mayor = vector[0];
        int menor = vector[0];
        
        for(int i=0;i<limite;i++){
            
            System.out.print("Introducí un número: ");
            vector[i] = read.nextInt();
            
            
            if(vector[i]>mayor){
                mayor = vector[i];
            }
            
            if(vector[i]<menor){
                menor = vector[i];
                
            }
            
            contador += vector[i]; 
           
        }
        
        
        System.out.println("mayor: "+mayor);
        System.out.println("menor: "+menor);
        System.out.println("total: "+contador);
        
        
        
    }
    
}
