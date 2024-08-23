/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package circulo;

import java.util.Scanner;
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;

/**
 *
 * @author emili
 */
public class Circulo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        DecimalFormatSymbols simbolos = new DecimalFormatSymbols();
        simbolos.setDecimalSeparator('.');
        DecimalFormat formateador = new DecimalFormat("####.###",simbolos);
        
        //Declaracion de variables
        Scanner leer=new Scanner(System.in);
        double radio,area,perimetro;
        
        //Datos de entrada
        System.out.print("Ingrese el radio del circulo: ");
        radio = leer.nextDouble();
        
        //Proceso
        area = radio * radio * Math.PI;
        perimetro = 2 * Math.PI * radio;
        
        //Datos de salida
        System.out.println("El area del circulo es de: "+formateador.format(area));
        System.out.println("El perimetro del circulo es de: "+formateador.format(perimetro));
    }
    
}
