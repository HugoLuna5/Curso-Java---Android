/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cursointrojava;

import java.util.Scanner;

/**
 *
 * @author HugoLuna
 */
public class Actividad10 {
    
    
    /*
    Suma de 3 arreglos 
    
    */
    public static void main(String[] args) {
        Scanner T = new Scanner(System.in);
         int Arreglo1[] = new int[10];
         int Arreglo2[] = new int[10];
         int Arreglo3[] = new int[10];
         
         for(int i=0; i<10;i++){
             System.out.println("Ingresa el valor "+(i+1));
             Arreglo1[i] = T.nextInt(); 
         }
         //Arreglo 2
         for(int i=0; i<10;i++){
             System.out.println("Ingresa el valor "+(i+1));
             Arreglo2[i] = T.nextInt(); 
         }
         
         
         for(int x=0;x<10;x++){
             Arreglo3[x] = Arreglo1[x] + Arreglo2[x];
             
         }
         
         for(int i=0; i<10; i++){
         
             System.out.println("Suma de "+Arreglo1[i]+" + "+Arreglo2[i]+" = "+Arreglo3[i]);
         }
    }
}
