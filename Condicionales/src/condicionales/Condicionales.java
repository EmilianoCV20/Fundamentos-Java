/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package condicionales;

import java.util.Scanner;

/**
 *
 * @author emili
 */
public class Condicionales {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        //Variables
        Scanner leer=new Scanner(System.in);
        int numero;
        
        //Datos Entrada
        System.out.print("Ingrese el numero: ");
        numero = leer.nextInt();
        
        //Proceso y salida
        if(numero > 10)
            System.out.println("El numero es mayor que 10");
        //Aqui acabaria el programa, y no diria nada, a amenos que se aqregue ELSE
        else
            System.out.println("El numero NO es mayor que 10");
        
        System.out.println("FIN DEL PROGRAMA");
    }
    
}
