/*Escriba un programa que lea números enteros. Si el número es múltiplo de cinco
debe detener la lectura y mostrar la cantidad de números leídos, la cantidad de
números pares y la cantidad de números impares. Los números negativos no deben sumarse.

*/
package introjava;

import java.util.Scanner;

/**
 *
 * @author Macarena Cardozo.
 */
public class EjercicioB33 {

    
    public static void main(String[] args) {
       
        Scanner read = new Scanner(System.in);
        
        int n ,par=0,impar=0;
        
        
       do{
           System.out.print("Ingresa un número: ");
           n = read.nextInt();
           
           
           
           if(n>0){
               if(n % 2 == 0){
               par++;
           }else{
               impar++;
           }
               
           }
           
       }while(n % 5 != 0);
        
        
        System.out.print("Canidad de números pares: "+par);
        System.out.println("");
        System.out.print("Canidad de números impares: "+impar);
        System.out.println("");
        System.out.print("Total de números ingresados: "+(par+impar));
        System.out.println("");
        
        
        
    }
    
}
