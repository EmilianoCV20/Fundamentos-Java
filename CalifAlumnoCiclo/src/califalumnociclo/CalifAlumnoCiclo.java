/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package califalumnociclo;

import java.util.Scanner;

/**
 *
 * @author emili
 */
public class CalifAlumnoCiclo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        //Variables
        Scanner leer = new Scanner(System.in);
        int Calif, NumCont,SumaCalif=0;
        double Prom;
        
        //Entrada y Proceso
        System.out.print("Ingrese el numero d econtrol del alumno: ");
        NumCont = leer.nextInt();
        
        for(int i = 1; i<= 6;i++)
        {
            System.out.print("Ingrese la calificacion "+i+" del alumno: ");
            Calif = leer.nextInt();
            SumaCalif = SumaCalif + Calif;
        }
        Prom = SumaCalif/6.0;
        //Salida
        System.out.println("El alumno conel numero de control:  "+NumCont+", tiene un promedio de: "+Prom);
    }
    
}
