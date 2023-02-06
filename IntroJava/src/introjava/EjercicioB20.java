/*Recorrer un vector de N enteros contabilizando cuántos números son de 1 dígito,
cuántos de 2 dígitos, etcétera (hasta 5 dígitos).
*/
package introjava;

import java.util.Scanner;

/**
 *
 * @author Macarena CArdozo.
 */
public class EjercicioB20 {

    
    public static void main(String[] args) {
        
    Scanner read = new Scanner(System.in);
    
    
        int n,count1=0,count2=0,count3=0,count4=0,count5=0, valores;
        
        System.out.print("Ingresar el tamaño del vector: ");
        n= read.nextInt();
        
        
        
        
        for(int i=0;i<n;i++){
            
            System.out.print("Teclea números hasta 5 dígitos: ");
            valores = read.nextInt();
            
            if(valores<10 && valores>0){
                count1++;
            }
            
            
            if(valores>=10 && valores<100){
                count2++;
            }
            
            
            if(valores>=100 && valores<1000){
                count3=count3+1;
            }
            
            if(valores>=1000 && valores<10000){
                count4=count4+1;
            }
            
            if(valores>=10000 && valores<100000){
                count5=count5+1;
            }
            
            
        }
        
        System.out.println("Números de 1 dígito: "+count1);
        System.out.println("Números de 2 dígitos: "+count2);
        System.out.println("Números de 3 dígitos: "+count3);
        System.out.println("Números de 4 dígitos: "+count4);
        System.out.println("Números de 5 dígitos: "+count5);
        
    }
    
}
