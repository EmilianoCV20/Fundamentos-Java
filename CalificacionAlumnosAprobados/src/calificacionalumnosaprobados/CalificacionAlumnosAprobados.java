/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calificacionalumnosaprobados;

import java.util.Scanner;

/**
 *
 * @author emili
 */
public class CalificacionAlumnosAprobados {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        //Variables
        Scanner leer = new Scanner(System.in);
        int cal1,cal2,cal3;
        double prom;
        
        //Datos Entrada
        System.out.print("Ingrese la primera calificacion del alumno: ");
        cal1 = leer.nextInt();
        System.out.print("Ingrese la segunda calificacion del alumno: ");
        cal2 = leer.nextInt();
        System.out.print("Ingrese la tercera calificacion del alumno: ");
        cal3 = leer.nextInt();
        
        //Proceso y Salida
        prom = ((cal1 + cal2 + cal3)/3) /1.0;
        
       if (prom >= 70)
            System.out.println("El alumno ha APROBADO el curso");
       else
            System.out.println("El alumno No HA APROBADO el curso");
       System.out.println("La calificacion final del alunmo fue de: "+ prom);
           
    }
    
}
