/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arreglos.o.arrays;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author emili
 */
public class ArreglosOArrays {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        //Variables
        Scanner leer = new Scanner(System.in);
        int []Calificaciones = new int[5];
        
        Calificaciones[0]=100;
        Calificaciones[1]=90;
        Calificaciones[2]=85;
        Calificaciones[3]=70;
        Calificaciones[4]=100;
        
        int[] OtrosNumeros = {5,4,8,7,8,3,6};
        
        int[] Temperaturas = new int [20];
        for (int i = 0; i < 20; i++) 
        {
            System.out.print("Ingrese le temperatura maxima del "+(i+1)+" de Enero 2021: ");
            Temperaturas[i] = leer.nextInt();
        }
        
        int[] temperaturas2 = new int[5];
        Random cal = new Random();
        for (int i = 0; i < 5; i++) 
        {
            temperaturas2[i] = cal.nextInt(5);
        }
        
        System.out.println("FIN DEL PROGRAMA");
    }
    
}
