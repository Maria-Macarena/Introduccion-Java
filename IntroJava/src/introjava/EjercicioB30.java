/*Leer la altura de N personas y determinar el promedio de estaturas que se
encuentran por debajo de 1.60 mts. y el promedio de estaturas en general.

*/
package introjava;

import java.util.Scanner;

/**
 *
 * @author Macarena Cardozo.
 */
public class EjercicioB30 {

  
    public static void main(String[] args) {
       
        Scanner read = new Scanner(System.in);
        
        int cantidad;
        double valor=0,promedio;
        
        
        System.out.print("Ingresar la cantidad de personas: ");
        cantidad = read.nextInt();
        
        for(int i=0;i<cantidad;i++){
            System.out.println("Ingresar la altura que corresponde a "
                    + " la persona n° "+(i+1)+" : ");
            valor = read.nextDouble();
            
            valor += valor;
        }
        
        promedio= valor/cantidad;
        
        System.out.println("suma de estaturas: "+valor);
        
        System.out.printf("El promedio de estatura es de: %.2f",promedio);
        
        
        
    }
    
}
