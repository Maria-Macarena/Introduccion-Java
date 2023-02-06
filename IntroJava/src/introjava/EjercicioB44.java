/*Los profesores del instituto necesitan llevar un registro de
las notas adquiridas por sus 10 alumnos para luego obtener una cantidad de
aprobados y desaprobados. Durante el periodo de cursado cada alumno obtiene 4
notas, 2 por trabajos prácticos evaluativos y 2 por parciales. Las ponderaciones de
cada nota son:
Primer trabajo práctico evaluativo 10%
Segundo trabajo práctico evaluativo 15%
Primer Integrador 25%
Segundo integrador 50%
Una vez cargadas las notas, se calcula el promedio y se guarda en el arreglo. Al final
del programa los profesores necesitan obtener por pantalla la cantidad de
aprobados y desaprobados, teniendo en cuenta que solo aprueban los alumnos
con promedio mayor o igual al 7 de sus notas del curso.

 */
package introjava;

import java.util.Scanner;

/**
 *
 * @author Macarena Cardozo.
 */
public class EjercicioB44 {

    public static void main(String[] args) {

        Scanner read = new Scanner(System.in);

        int cantidadAlumnos = 10, cantidadNotas = 5;

        //Llamo a los métodos
        double[][] alumnos = cargarNotas(cantidadAlumnos,cantidadNotas );
        
        condicionAlumnos(alumnos, cantidadAlumnos, cantidadNotas);
        
        System.out.println("");

    }

    public static double[][] cargarNotas(int cantidadAlumnos, int cantidadNotas) {

        Scanner read = new Scanner(System.in);

        double[][] alumnos = new double[cantidadAlumnos][cantidadNotas];

        double tp1=0, tp2=0, integrado1=0, integrador2=0;

        String nombre;

        for (int i = 0; i < cantidadAlumnos; i++) {
            
            System.out.print("NOTAS DE ");
            nombre = read.next().toUpperCase();
            
            
            for (int j = 0; j < cantidadNotas; j++) {

                if (j == 0) {
                    System.out.print("Ingresar la nota del Primer Trabajo"
                            + " Evaluativo, tener en cuenta que el 10% de esta "
                            + " nota conforma LA NOTA FINAL: ");
                    tp1 = read.nextDouble();

                    if (tp1 < 1 || tp1 > 10) {
                        System.out.println("La nota ingresada es incorrecta, "
                                + " hazlo de nuevo: ");
                        tp1 = read.nextDouble();
                    }
                }

                if (j == 1) {
                    System.out.print("Ingresar la nota del Segundo Trabajo"
                            + " Evaluativo, tener en cuenta que el 15% de esta "
                            + " nota conforma LA NOTA FINAL: ");
                    tp2 = read.nextDouble();
                    if (tp2 < 1 || tp2 > 10) {
                        System.out.println("La nota ingresada es incorrecta, "
                                + " hazlo de nuevo: ");
                        tp2 = read.nextDouble();
                    }
                }

                if (j == 2) {
                    System.out.print("Ingresar la nota del Primer Integrador,"
                            + " tener en cuenta que el 25% de esta "
                            + " nota conforma LA NOTA FINAL: ");
                    integrado1 = read.nextDouble();
                    if (integrado1 < 1 || integrado1 > 10) {
                        System.out.println("La nota ingresada es incorrecta, "
                                + " hazlo de nuevo: ");
                        integrado1 = read.nextDouble();
                    }
                }

                if (j == 3) {
                    System.out.print("Ingresar la nota del Segundo Integrador,"
                            + " tener en cuenta que el 50% de esta "
                            + " nota conforma LA NOTA FINAL: ");
                    integrador2 = read.nextDouble();
                    if (integrador2 < 1 || integrador2 > 10) {
                        System.out.println("La nota ingresada es incorrecta, "
                                + " hazlo de nuevo: ");
                        integrador2 = read.nextDouble();
                    }
                }

                if (j == 4) {
                    alumnos[i][4] = (10 * tp1 / 100) + (15 * tp2 / 100) + 
                            (25 * integrado1 / 100) + (50 * integrador2 / 100);
                    System.out.println("NOTA FINAL "+alumnos[i][4]);
                }

            }
            
            System.out.println("********************************************");

        }

        return alumnos;
    }

    public static void condicionAlumnos(double[][] vector,int cantidadAlumnos, int cantidadNotas) {

        int aprobados = 0, desaprobados = 0;

        for (int i = 0; i < cantidadAlumnos; i++) {
            
            for(int j=cantidadNotas-1;j<cantidadNotas;j++){
                if (vector[i][j] >= 7) {
                aprobados++;
            } else {
                desaprobados++;
            }
            }
            
        }

        System.out.print("La cantidad de alumnos Aprobados: " + aprobados);
        System.out.println("");
        System.out.print("La cantidad de alumnos Desaprobados: " + desaprobados);

    }

}
