/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
//importando lobreria para ingreso de datos por teclado
import java.util.Scanner;

/**
 *
 * @author HugoLuna
 */
public class Actividad01 {

    /**
     * @param args the command line arguments
     */
    
    /*
    *
    *1.1.1.1.	Actividad Suma,  resta, división y multiplicación de dos
    * variables con datos definidos y por teclado.
    *
    */
    public static void main(String[] args) {
        // TODO code application logic here
        //inicializando teclado
        Scanner Teclado = new Scanner(System.in);
        
        //declarando variables
        int a,b, c;
        
        System.out.println("Ingresa el valor para A: ");
        a  = Teclado.nextInt();
        System.out.println("Ingresa el valor para B: ");
        b  = Teclado.nextInt();
        
        /* Suma de dos variables*/
        c = a+b;
        System.out.println("La suma de "+a+" + "+b+" es igual a "+c);
        
        /* Resta de dos variables*/
        c = a-b;
        System.out.println("La resta de "+a+" - "+b+" es igual a "+c);
        
        /* Suma de dos variables*/
        c = a*b;
        System.out.println("La multiplicación de "+a+" * "+b+" es igual a "+c);
        
        /* Division de dos variables*/
        c = a/b;
        System.out.println("La división de "+a+" / "+b+" es igual a "+c);
        
        
        
    }
    
}
