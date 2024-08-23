/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tipodecambiopesodollar;

import java.util.Scanner;

/**
 *
 * @author emili
 */
public class TipoDeCambioPesoDollar {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        //Variables
        Scanner leer=new Scanner(System.in);
        double dolares,pesos;
        double cambio=20.41;
        
        //Datos Entrada
        System.out.print("Escriba la cantidad de dolares que desea cambiar: ");
        dolares = leer.nextDouble();
        
        //Proceso
        pesos = dolares * cambio;
        
        
        //Datos Salida
        System.out.println("La cantidad equivalente de pesos es de: "+pesos);
    }
    
}
