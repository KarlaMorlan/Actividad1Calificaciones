
package Calificaciones.Principal;

import java.util.Scanner;

/**
 *
 * @author kaivo
 */
public class Metodos {
        String nombre;
        int calif[] = new int[5];
        int suma=0;
        float promedio=0;
        
        // Ingresa nombre del alumno
        public void ingresaNombre(){
            
            Scanner n = new Scanner (System.in);
            System.out.println("Ingresa el nombre del alumno:  ");
            nombre = n.nextLine();

        }
        
        // Ingresar 5 calificaciones
        public void calPromedio(){

            Scanner c=new Scanner(System.in);
            System.out.println("Ingresa las 5 calificaciones del alumno:");

             for (int i=0; i<calif.length; i++) {
                 calif[i]=c.nextInt();
                 suma=suma+calif[i];
            }
             for (int i=0; i<calif.length; i++) {
                 System.out.println(calif[i]);
            }
                 
            // Promedio del alumno

            promedio=(suma/calif.length);      
       
        }
        
        //Asignar nota segun el promedio final
        public char notaFinal() {
            char nota = ' ';
            
            if ((promedio>=91) && (promedio<=100))
            {
               nota = 'A';
               System.out.println("Calificación: A");
            }
            else if ((promedio>=81) && (promedio<=90))
            {
                nota = 'B';
                System.out.println("Calificación: B");
            }
            else if ((promedio>=71) && (promedio<=80))
            {
                nota = 'C';
                System.out.println("Calificación: C");
            }
            else if ((promedio>=61) && (promedio<=70))
            {
                nota = 'D';
                System.out.println("Calificación: D");
            }
            else if ((promedio>=51) && (promedio<=60))
            {
                nota = 'E';
                System.out.println("Calificación: E");
            }
            else if (promedio<=50)
            {
                nota = 'F';
                System.out.println("Calificación: F");
            }
            return nota;
          
        }
        
        public void Imprime(){
            
            // Imprime titulo
            System.out.print("CALIFICACIONES UNIVERSIDAD TECMILENIO\n");
            // Imprime nombre del alumno
            System.out.println("Nombre del alumno: " + nombre);
            // Imprime las calificaciones del alumno
            System.out.println("Calificación 1 = " + calif[0]);
            System.out.println("Calificación 2 = " + calif[1]);
            System.out.println("Calificación 3 = " + calif[2]);
            System.out.println("Calificación 4 = " + calif[3]);
            System.out.println("Calificación 5 = " + calif[4]);
            //Imprime el resultado del promedio
            System.out.println("El promedio es:" + promedio);   
        }
    
}
