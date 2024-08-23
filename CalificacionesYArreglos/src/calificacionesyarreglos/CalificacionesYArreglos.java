/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calificacionesyarreglos;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author emili
 */
public class CalificacionesYArreglos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        //Datos entrada
        Scanner leer = new Scanner(System.in);
        Random cal = new Random();
        
        int Alumnos;
        System.out.print("Ingrese la cantidad de alumnos en el grupo: ");
        Alumnos = leer.nextInt();
        
        int[] Examen = new int[Alumnos];
        int[] Tareas = new int[Alumnos];
        int[] Participacion = new int[Alumnos];
        int[] Calificacion = new int[Alumnos];
        int SumaCalif=0,CalifMayor=0,CalifMenor=100,Aprobados=0,Reprobados=0;
        int AlumnoMayor=0,AlumnoMenor=0;
        double Promedio;
        
        //Generar Cal
        for (int i = 0; i < Examen.length; i++) 
        {
            Examen[i]=cal.nextInt(31)+30;
            Tareas[i]=cal.nextInt(21)+10;
            Participacion[i]=cal.nextInt(5)+6;
        }
        //Obtener Cal
        for (int i = 0; i < Calificacion.length; i++) 
        {
            Calificacion[i]=Examen[i]+Tareas[i]+Participacion[i];
        }
        //Datos Arreglo Cal
        for (int i = 0; i < Examen.length; i++) 
        {
            SumaCalif = SumaCalif + Calificacion[i];
            if(Calificacion[i]>CalifMayor)
            {
                CalifMayor=Calificacion[i];
                AlumnoMayor = i+1;
            }
            if(Calificacion[i] < CalifMenor)
            {
                CalifMenor=Calificacion[i];
                AlumnoMenor= i+1;
                
            }
            if(Calificacion[i] >= 70)
            {
                Aprobados++;
            }
            else
            {
                Reprobados++;
            }
        }
        Promedio = SumaCalif / Alumnos;
        
        //Datos Salida
        System.out.println("Calificaciones...");
        System.out.println("Alumno"+"\t"+"Examen"+"\t"+"Tareas"+"\t"+"Participacion"+"\t"+ "Calificacion");
        for (int i = 0; i < Examen.length; i++) 
        {
            System.out.println((i+1)+"\t"+Examen[i]+"\t"+Tareas[i]+"\t\t"+Participacion[i]+"\t\t"+ Calificacion[i]);
        }
        System.out.println("El promedio del grupo es de: "+Promedio);
        System.out.println("La Calificacion mayor es de: "+CalifMayor+" y Fue del alumno: "+AlumnoMayor);
        System.out.println("La calificacion Menor es de: "+CalifMenor+" y Fue del alumno: "+AlumnoMenor);
        System.out.println("Los alumnos aprobados fueron: "+Aprobados);
        System.out.println("Los alumnos reprobados fueron: "+Reprobados);
    }
    
}
