/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cursointrojava;


/**
 *
 * @author HugoLuna
 */
public class Actividad01 {
    
    public static void main(String[] args) {
        
        /*Usar double para obtener un mejor resultado en la division*/
        //declarando variables
        int a= 10,b= 20, res;
        
        
        /*Impresion de valores por consola*/
        
        System.out.println("Variable de tipo entero a = "+a+"\n Variable de tipo entero b ="+b);
        
        
        /* Suma de dos variables*/
        res = a+b;
        System.out.println("La suma de "+a+" + "+b+" es igual a "+res);
        
        /* Resta de dos variables*/
        res = a-b;
        System.out.println("La resta de "+a+" - "+b+" es igual a "+res);
        
        /* Suma de dos variables*/
        res = a*b;
        System.out.println("La multiplicación de "+a+" * "+b+" es igual a "+res);
        
        /* Division de dos variables*/
        res = a/b;
        System.out.println("La división de "+a+" / "+b+" es igual a "+res);
        
    }
}
