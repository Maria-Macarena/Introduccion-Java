/*Dibujar un cuadra con asteriscos *

 */
package introjava;

import java.util.Scanner;

/**
 *
 * @author Macarena Cardozo.
 */
public class EjercicioB15 {

    public static void main(String[] args) {

        Scanner read = new Scanner(System.in);

        int n;

        System.out.println("Ingresar un numero para dibujar un cuadrado");
        n = read.nextInt();

        
        for(int i=0;i<=n;i++){
            
            
            for(int j=0;j<=n;j++){
            
                if(i==0 || j==0 || i==n || j==n-1 ){
                    System.out.print("*");
                    
                }
                
                if(j>0 || j<n){
                   System.out.print(""); 
                }
                
                
        }
            System.out.println("");
        }
        
        System.out.println("");

    }

}

