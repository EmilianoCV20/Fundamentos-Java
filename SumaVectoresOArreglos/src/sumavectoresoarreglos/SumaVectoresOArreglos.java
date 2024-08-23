/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sumavectoresoarreglos;

import java.util.Random;

/**
 *
 * @author emili
 */
public class SumaVectoresOArreglos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Random num = new Random();
        int []VectorA = new int[5];
        int []VectorB = new int[5];
        int []Suma    = new int[5];
        int Mayor=0,Menor=10;
        
        //LLenado vector A y B
        for (int i = 0; i < 5; i++) 
        {
            VectorA[i]= num.nextInt(11);
            VectorB[i]= num.nextInt(11);
        }
        //Mostrar Vector A y B
        for (int i = 0; i < 5; i++) 
        {
            System.out.println("A["+(i+1)+"]= "+VectorA[i]+", B["+(i+1)+"]="+VectorB[i]);
        }
        //Suma Vector A y B
        for (int i = 0; i < 5; i++) 
        {
            Suma[i]=VectorA[i]+VectorB[i];
        }
        System.out.println("La suma de los vectores es de: ");
        for (int i = 0; i < 5; i++) 
        {
            System.out.println(Suma[i]);
            if(Mayor < Suma[i])
            {
                Mayor = Suma[i];
            }
            if(Menor > Suma[i])
            {
                Menor = Suma[i];
            }
        }
        System.out.println("El numero Mayor es: "+Mayor);
        System.out.println("El numero Menor es: "+Menor);
    }
    
}
