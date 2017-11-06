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
public class Actividad11 {

    /**
   * Crear un metodo que compruebe si un número ingresado
   * por teclado entero positivo es primo o no.
   * Un número es primo cuando únicamente es divisible entre
   * él mismo y la unidad.
   * Imprimir si es primo o no.
   */
    public static void main(String[] args) {
        
        Scanner T = new Scanner(System.in);
       /*Declaración de variables*/
        int x ;
        boolean retorno;
        /*Crear objeto*/
        Actividad11 obj =  new Actividad11();
        
        /*Pedir valor*/
        System.out.println("Ingresa un valor");
        x = T.nextInt();
        
        /*Guardar valor retornado y mandar el paramatro al metodo*/
         retorno = obj.esPrimo(x);
       
         //Compobar el valor de retorno
       if(retorno){//true ==  es primo
           System.out.println("El valor "+x+" es primo");
       }else{//false == no es primo
           System.out.println("El valor "+x+"  no es primo");
       }
        
        
    }
    //Metodo para la funcion
    public static boolean esPrimo(int x) {
        //Ciclo para recorrer y un if para hacer la comparación
            for (int i = 2; i < x; i++) { 
             if ((x % i) == 0) {
                 return false; 
                }
            }
            
            if(x == 1 || x == 0){
            return false;
            }
            return true; 
    
    }
}
