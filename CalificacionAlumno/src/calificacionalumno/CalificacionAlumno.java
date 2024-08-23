/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calificacionalumno;

import java.util.Scanner;

/**
 *
 * @author emili
 */
public class CalificacionAlumno {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        //Variables
        Scanner leer = new Scanner(System.in);
        int NumCont,Cal1,Cal2,Cal3,Cal4,Cal5,Cal6;
        double Prom;
                
        //Datos entrada
        System.out.print("Ingrese el numero de control del alumno: ");
        NumCont = leer.nextInt();
        System.out.print("Ingrese la calificacion 1 del alumno: ");
        Cal1 = leer.nextInt();
        System.out.print("Ingrese la calificacion 2 del alumno: ");
        Cal2 = leer.nextInt();
        System.out.print("Ingrese la calificacion 3 del alumno: ");
        Cal3 = leer.nextInt();
        System.out.print("Ingrese la calificacion 4 del alumno: ");
        Cal4 = leer.nextInt();
        System.out.print("Ingrese la calificacion 5 del alumno: ");
        Cal5 = leer.nextInt();
        System.out.print("Ingrese la calificacion 6 del alumno: ");
        Cal6 = leer.nextInt();
        
        //Proceso
        Prom = (Cal1 + Cal2 + Cal3 + Cal4 + Cal5 + Cal6)/6;
        
        //Datos salida
        System.out.println("El alumno conel numero de control:  "+NumCont+", tiene un promedio de: "+Prom);
        
    }
    
}
