/*Realizar un programa que complete un vector con los N primeros números de la
sucesión de Fibonacci.
 */
package introjava;

import java.util.Scanner;

/**
 *
 * @author Macarena Cardozo.
 */
public class EjercicioB47 {

    public static void main(String[] args) {

        Scanner read = new Scanner(System.in);

        System.out.print("Ingresa un número: ");
        int n = read.nextInt();
        
        int [] vector=factorial(n);
        imprimir(vector);
        

    }

    public static int [] factorial(int n) {

        int [] vector = new int[n];
        
        int a=0,b=1,c;
        
        for(int i=0;i<vector.length;i++){
            
            vector[i]= a;
            
            c=a+b;
            a=b;
            b=c;
            
        }
        
        return vector;
    }

    public static void imprimir(int [] vector) {

        
        for(int i=0;i<vector.length;i++){
            System.out.print("[ "+vector[i]+" ]");
            
            
        }
        
      
    }

}
