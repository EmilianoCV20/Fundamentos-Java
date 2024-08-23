/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package condicionalanidadoand;

import java.util.Scanner;

/**
 *
 * @author emili
 */
public class CondicionalAnidadoAND {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        //Variables
        Scanner leer=new Scanner(System.in);
        int examen,actitud;
        
        //Entada
        System.out.print("Ingrese la calificacion del alumno: ");
        examen=leer.nextInt();
        
        //Proceso y salida
        if(examen >= 70)
        {
            System.out.print("Ingrese la actitud del alumno(0=mala/1=buena): ");
            actitud=leer.nextInt();
            if(actitud == 1)
                System.out.println("El alumno SI acredita el curso");
            else
                System.out.println("El alumno NO acredita el curso");
        }
        else
                System.out.println("El alumno NO acredita el curso");
        
    }
    
}
