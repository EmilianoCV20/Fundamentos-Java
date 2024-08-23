/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pagotrabajadores;

import java.util.Scanner;

/**
 *
 * @author emili
 */
public class PagoTrabajadores {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        //Variables
        Scanner leer = new Scanner(System.in);
        int HorTrab,HorExt,Categ;
        double Sueldo,SueldoExt,SueldoTot,SueldoN;
        
        //Datos Entrada
        System.out.print("Ingrese el sueldo del empleado: ");
        Sueldo = leer.nextDouble();
        System.out.print("Ingrese las horas trbabajadas del empleado: ");
        HorTrab = leer.nextInt();
        System.out.print("Ingrese la categoria del empleado(1 a 4): ");
        Categ = leer.nextInt();
        
        //Proceso Y Datos Salida
        if((HorTrab > 30)&&(Categ == 4))
        {
            SueldoN = Sueldo * 30;
            HorExt = HorTrab - 30;
            SueldoExt = HorExt * 70;
            SueldoTot = SueldoN + SueldoExt;  
            System.out.println("El pago del empleado es de: "+ SueldoTot+"$");
        }
        else
        {
            if(HorTrab > 30)
            {
                SueldoN = Sueldo * 30;
                System.out.println("El pago del empleado es de: "+SueldoN+"$");
            }
            else
            {
                SueldoN = Sueldo * HorTrab;
                System.out.println("El pago del empleado es de: "+SueldoN+"$");
            }
        }
    }
    
}
