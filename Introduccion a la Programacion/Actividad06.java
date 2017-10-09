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
public class Actividad06 {
    public static void main(String[] args) {
        /*
        *Mayor, menor e intermedio
        *de 3 numeros definidos por teclado
        */
        
        Scanner T = new Scanner(System.in); 
        int a,b,c;
        
        System.out.println("Ingresa el valor de A");
        a = T.nextInt();
        System.out.println("Ingresa el valor de B");
        b = T.nextInt();
        System.out.println("Ingresa el valor de C");
        c = T.nextInt();
        
        /*Comparacion mayor*/
        if(a > b && a > c){
            System.out.println("El mayor es A con "+a);
        }else if(b > a && b > c){
            System.out.println("El mayor es B con "+b);
        }else{
            System.out.println("El mayor es C con "+c);
        }
        
        /*Comparacion intermedio*/
        if(a> b && a<c || a<b && a>c){
            System.out.println("El intermedio es A "+a);
        }else if(b > a && b<c || b<a && b>c){
            System.out.println("El intermedio es B "+b);
        }else{
           System.out.println("El intermedio es C "+c);

        }
        
        /*Comparacion menor*/
        if(a < b && a < c){
            System.out.println("El menor es A con"+a);
        }else if(b < a && b < c){
            System.out.println("El menor es B con"+b);
        }else{
            System.out.println("El menor es C con"+c);
        }
        
    }
}
