/*Dado un tiempo en minutos, calcular su equivalente en días, horas y minutos. Por ejemplo, si
el usuario ingresa 1600 minutos, el sistema debe calcular su equivalente.

*/
package introjava;

import java.util.Scanner;

/**
 *
 * @author Macarena Cardozo.
 */
public class EjercicioB25 {

   
    public static void main(String[] args) {
        
        Scanner read = new Scanner(System.in);
        
        System.out.print("Introduce el tiempo en minutos y lo convertimos "
                + " a días, horas y minutos. ");
        int tiempo = read.nextInt();
        System.out.println("");
        
        int dia=0,hora=0,minutos=0;
        
        while(tiempo > 0){
            
            if(tiempo > 1440){
                dia++;
                tiempo -= 1440;
            }else if(tiempo >= 60){
                hora++;
                tiempo -=60;
            }else{
                minutos++;
                tiempo -= 1;
            }
        }
        
        System.out.println("Los minutos ingresados equivalen a "+dia+" Días, "+hora+" "
                + " Horas y "+minutos+" Minutos");
        
        
        
        
    }
    
    
    
}
