/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package basepotencia;

import java.util.Scanner;

/**
 *
 * @author emili
 */
public class BasePotencia {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        //Variables
        Scanner leer = new Scanner(System.in);
        int Base,Potencia,i;
        double Resultado=1;
        
        //Datos Entrada
        System.out.print("Ingrese el balor de la base: ");
        Base = leer.nextInt();
        System.out.print("Ingrese el valor de la potencia: ");
        Potencia = leer.nextInt();
        
        //Proceso y Datos Salida
        for(i=1;i<=Potencia;i++)
        {
            Resultado = (Resultado * Base);
        }
        System.out.println("El resultado de elevar "+Base+" a la potencia "+Potencia+", es de: "+Resultado);
    }
    
}
