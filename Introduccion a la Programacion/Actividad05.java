package cursointrojava;

import java.util.Scanner;

/**
 *
 * @author HugoLuna
 */
public class Actividad05 {
    
    
    /*
    *Promedio de un alumno con 6 calificaciones
    *Con datos por teclado
    */    
    public static void main(String[] args) {
        
        //Scanner 
        Scanner T = new Scanner(System.in);
        
        double administracion,calculo,programacion,investigacion,etica,matematicasDis, promedio;
        
        System.out.println("Ingresa la calificacion de Administracion");
        administracion =  T.nextDouble();
        System.out.println("Ingresa la calificacion de Calculo");
        calculo =  T.nextDouble();
        System.out.println("Ingresa la calificacion de Programación");
        programacion =  T.nextDouble();
        System.out.println("Ingresa la calificacion de Ética");
        etica =  T.nextDouble();
        System.out.println("Ingresa la calificacion de Matematicas D.");
        matematicasDis =  T.nextDouble();
        System.out.println("Ingresa la calificacion de F. de Investigación");
        investigacion =  T.nextDouble();
        
        
        promedio = (administracion+calculo+programacion+investigacion+etica+matematicasDis)/6;
        
        
        /*Validación si esta aprobado o no*/
        
        if(promedio < 7){
            System.out.println("Reprobado con un promedio de "+promedio);
        }else{
            System.out.println("Aprobado con un promedio de "+promedio);
        }
    }
}
