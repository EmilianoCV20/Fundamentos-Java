/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package conteodeceros;

import java.util.Scanner;

/**
 *
 * @author emili
 */
public class ConteoDeCeros {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        //Variables
        Scanner leer=new Scanner(System.in);
        int N,X=0,Num,i;
        
        //Datos entrada
        System.out.print("Ingrese la cantidad de numeros que desea revisar: ");
        N = leer.nextInt();
        
        //Proceso y Datos Salida
        for (i = 1; i<= N;i++)
        {
            System.out.print("Ingrese el #"+i+" numero a revisar: ");
            Num = leer.nextInt();
            if(Num == 0)
            {
                X=X+1;
            }
        }
        System.out.println("El numero de ceros ingresados es: "+X);
    }
    
}
