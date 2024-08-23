/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package categoriatrabajador;

import java.util.Scanner;

/**
 *
 * @author emili
 */
public class CategoriaTrabajador {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        //Variables
        Scanner leer = new Scanner(System.in);
        int categoria;
        double sueldo;
        //Datos Entrada
        System.out.print("Ingrese la categoria del trabajador: ");
        categoria = leer.nextInt();
        System.out.print("Ingrese el sueldo del trabajador: ");
        sueldo = leer.nextDouble();
        
        //Proceso y Salida
        switch(categoria)
        {
            case 1: sueldo = sueldo * 1.15;
            break;
            case 2: sueldo = sueldo * 1.10;
            break;
            case 3: sueldo = sueldo * 1.08;
            break;
            case 4: sueldo = sueldo * 1.07;
            break; 
        }
        System.out.println("El nuevo sueldo del trabajador es de: "+sueldo+"$");
    }
    
}
