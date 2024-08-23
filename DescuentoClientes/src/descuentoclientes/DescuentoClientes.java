/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package descuentoclientes;

import java.util.Scanner;

/**
 *
 * @author emili
 */
public class DescuentoClientes {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        //Variables
        Scanner leer = new Scanner(System.in);
        double Total, Desc, Totaldesc;
        
        //Datos Entrada
        System.out.print("Escriba el total de la compra del cliente: ");
        Total = leer.nextDouble();
        
        //Proceso y Datos Salida
        if(Total >= 15000)
        {
            System.out.println("Se aplica un 25% de descuento");
            Desc = 0.75;
        }
        else
        {
            if((14999 > Total)&&(Total > 7000))
            {
                System.out.println("Se aplica un 18% de descuento");
                Desc = 0.82;
            }
            else
            {
                if((6999 > Total)&&(Total > 1000))
                {
                    System.out.println("Se aplica un 11% de descuento");
                    Desc = 0.89;
                }
                else
                {
                    if((999 > Total)&&(Total > 500))
                    {
                        System.out.println("Se aplica un 5% de descuento");
                        Desc = 0.95;
                    }
                    else
                    {
                        System.out.println("No hay descuento");
                        Desc = 1;
                    }
                }
            }
        }
        Totaldesc = Total * Desc;
        System.out.println("El total de la compra es de: "+Totaldesc+"$");
    }
}
