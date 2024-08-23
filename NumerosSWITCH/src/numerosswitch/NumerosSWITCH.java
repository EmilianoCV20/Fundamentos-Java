/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package numerosswitch;

import java.util.Scanner;

/**
 *
 * @author emili
 */
public class NumerosSWITCH {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        //Variables
        Scanner leer=new Scanner(System.in);
        int Numero;
        
        //Entrada
        System.out.print("Escriba un numero: ");
        Numero = leer.nextInt();
        
        //Proceso y salida
        switch(Numero)
        {
            case 5: System.out.println("El numero ingrsado es el CINCO");
            break;
            case 4: System.out.println("El numero ingrsado es el CUATRO");
            break;
            case 3: System.out.println("El numero ingrsado es el TRES");
            break;
            case 2: System.out.println("El numero ingrsado es el DOS");
            break;
            case 1: System.out.println("El numero ingrsado es el UNO");
            break;
            default: System.out.println("NO SE RECONOCE EL NUMERO INGRESADO");
            break;
        }
    }
    
}
