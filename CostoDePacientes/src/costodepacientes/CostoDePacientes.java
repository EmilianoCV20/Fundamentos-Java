/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package costodepacientes;

import java.util.Scanner;

/**
 *
 * @author emili
 */
public class CostoDePacientes {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        //Variables
        Scanner leer = new Scanner(System.in);
        int Dias,TipoEnf,Edad;
        double Costo = 0,CostoT;
        
        //Datos Entrada
        System.out.print("Escriba la edad del paciente: ");
        Edad = leer.nextInt();
        System.out.print("Escriba los dias que se quedo el paciente: ");
        Dias = leer.nextInt();
        System.out.print("Escriba el tipo de enfermedad del paciente(1 al 4): ");
        TipoEnf = leer.nextInt();
        
        //Proceso Y Datos Salida
        switch(TipoEnf)
        {
            case 1: Costo = 25*1;
            break;
            case 2: Costo = 16*1;
            break;
            case 3: Costo = 20*1;
            break;
            case 4: Costo = 32*1;
            break;
            default: System.out.println("ERROR; introdusca un numero del 1 al 4 porfavor"); System.exit(0);
            break;
        }
        if((22 >= Edad)&&(Edad >= 14))
        {
            CostoT = (Costo * Dias)* 1.10;
            System.out.println("El Costo del paciente es de: "+CostoT+"$");
        }
        else
        {
            CostoT = Costo * Dias;
            System.out.println("El Costo del paciente es de: "+CostoT+"$");
        }
    }
    
}
