/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calificacionesmatriz.arreglosbidim;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author emili
 */
public class CalificacionesMatrizArreglosBidim {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        //Datos entradas
        Scanner leer = new Scanner(System.in);
        Random cal = new Random();
        
        int Alumnos,SumaCalif,Aprobados=0,Reprobados=0,AlumnoMenor=0,AlumnoMayor=0;
        System.out.print("Ingrese la cantidad de alumnos en el grupo: ");
        Alumnos = leer.nextInt();
        
        int[][] Calificaciones = new int[Alumnos][3];
        double[]CalFinal = new double[Alumnos];
        double CalifMayor=0,CalifMenor=100,SumaProm=0,Promedio;
        
        //Ciclo generar calif
        for (int i = 0; i < Alumnos; i++) //Contola alumnos
        {
            for (int j = 0; j < 3; j++) //Controla criterios de evaluacion
            {
                Calificaciones[i][j]=cal.nextInt(46)+55;
            }
        }
        //Ciclo para mostrar Calif
        System.out.println("Alumno\t\tExamen\t\tTareas\tParticipacion");
        for (int i = 0; i < Alumnos; i++) 
        {
            System.out.print("["+(i+1)+"]");
            for (int j = 0; j < 3; j++) 
            {
                System.out.print("\t\t"+Calificaciones[i][j]);
            }
            System.out.println("");
        }
        //Calcular cal finales
        System.out.println("\nLas calificacione finales son: ");
        for (int i = 0; i < Alumnos; i++) 
        {
            SumaCalif = 0;
            for (int j = 0; j < 3; j++) 
            {
                SumaCalif=SumaCalif+Calificaciones[i][j];
            }
            CalFinal[i]=SumaCalif*1.0/3;
            SumaProm= SumaProm + CalFinal[i];
            if(CalFinal[i]>CalifMayor)
            {
                CalifMayor=CalFinal[i];
                AlumnoMayor = i+1;
            }
            if(CalFinal[i] < CalifMenor)
            {
                CalifMenor=CalFinal[i];
                AlumnoMenor= i+1;
            }    
             if(CalFinal[i] >= 70)
            {
                Aprobados++;
            }
            else
            {
                Reprobados++;
            }
        }
        Promedio= SumaProm / Alumnos;
        //Mostrar Calif Finales
        for (int i = 0; i < Alumnos; i++) 
        {
            System.out.println("["+(i+1)+"]\t"+CalFinal[i]);
        }
        
        System.out.println("FIN");
        //Muestra de resultados
        System.out.println("El Promedio del grupo fue de: "+Promedio);
        System.out.println("La mayor calificacion fue de: "+CalifMayor+" y fue el alumno: "+AlumnoMayor);
        System.out.println("La mayor calificacion fue de: "+CalifMenor+" y fue el alumno: "+AlumnoMenor);
        System.out.println("Los Aprobados fueron: "+Aprobados);
        System.out.println("Los Reprobados fueron: "+Reprobados);
        
    }
    
}
