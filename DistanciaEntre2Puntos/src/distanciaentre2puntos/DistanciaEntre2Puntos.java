/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package distanciaentre2puntos;

import java.util.Scanner;

/**
 *
 * @author emili
 */
public class DistanciaEntre2Puntos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        //Variables
        Scanner leer = new Scanner(System.in);
        int X1,Y1,X2,Y2;
        double D;
        
        //Datos Entrada
        System.out.print("Escriba el valor de X1: ");
        X1 = leer.nextInt();
        System.out.print("Escriba el valor de Y1: ");
        Y1 = leer.nextInt();
        System.out.print("Escriba el valor de X2: ");
        X2 = leer.nextInt();
        System.out.print("Escriba el valor de Y2: ");
        Y2 = leer.nextInt();
        
        //Proceso
        D = Math.sqrt((Math.pow((X2 - X1),2))+ (Math.pow((Y2 - Y1), 2)));
        
        //Datos Salida
        System.out.println("La distancia entre ambos puntos es de: "+D);
    }
    
}
