/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vectores;

import java.util.Random;

/**
 *
 * @author emili
 */
public class Vectores {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Random num = new Random();
        int []Fundamentos = new int[20];
        int []Etica   = new int[20];
        int []Promedio    = new int[20];
        double PromFund,PromEtica;
        int SumaFund=0, SumaEtica=0;
        
        //LLenado vector A y B
        for (int i = 0; i < 20; i++) 
        {
            Fundamentos[i]= num.nextInt(41)+60;
            Etica[i]= num.nextInt(21)+80;
        }
        
        //Promedio Alumnos
        for (int i = 0; i < 20; i++) 
        {
            Promedio[i]=(Fundamentos[i]+Etica[i])/2;
        }
        //Mostrar Vector A y B  
        System.out.println("Las calificaciones de los alumnos son: ");
        System.out.println("Alumno\t Fundamentos\t\t Etica\tPromedio");
        
        for (int i = 0; i < 20; i++) 
        {
            System.out.println("["+(i+1)+"]\t\t"+Fundamentos[i]+",\t\t"+Etica[i]+",\t\t"+Promedio[i]);
        }
        //Promedio grupal
        for (int i = 0; i < 20; i++) 
        {
            SumaFund=SumaFund + Fundamentos[i];
            SumaEtica= SumaEtica + Etica[i];
        }
        PromFund = SumaFund / 20;
        PromEtica = SumaEtica/ 20;
        System.out.println("El promedio Grupal de Fundamentos es de: "+PromFund);
        System.out.println("El promedio grupal de Etica es de "+ PromEtica);
    }
    
}
