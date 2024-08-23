/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ordenvaloresabc;

import java.util.Scanner;

/**
 *
 * @author emili
 */
public class OrdenValoresABC {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        //Variables
        Scanner leer=new Scanner(System.in);
        int A,B,C;
        
        //Datos entrada
        System.out.println("AVISO: LOS NUMEROS NO PUEDEN SER IGUALES");
        System.out.print("Escriba El valor del digito A: ");
        A = leer.nextInt();
        System.out.print("Escriba El valor del digito B: ");
        B = leer.nextInt();
        System.out.print("Escriba El valor del digito C: ");
        C = leer.nextInt();
        
        //Proceso y datos salida
        if(A > B)
        {
            if(A > C)
            {
                if(B > C)
                {
                    System.out.println("El orden de los numeros es de A,B,C: "+A+","+B+","+C);
                }
                else
                {
                    System.out.println("El orden de los numeros es de A,C,B: "+A+","+C+","+B);
                }
            }
            else
            {
                System.out.println("El orden de los numeros es de C,A,B: "+C+","+A+","+B);  
            }
        }
        else
        {
            if(B > C)
            {
                if(A > C)
                {
                    System.out.println("El orden de los numeros es de B,A,C: "+B+","+A+","+C);
                }
                else
                {
                    System.out.println("El orden de los numeros es de B,C,A: "+B+","+C+","+A);
                }
            }
            else
            {
                System.out.println("El orden de los numeros es de C,B,A: "+C+","+B+","+A); 
            }
        }
    }
    
}
