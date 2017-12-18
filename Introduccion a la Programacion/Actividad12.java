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
public class Actividad12 {

    /**
     *
     * Crear un progama que realice la suma, resta, división y la multiplicacion
     * de 2 arreglos bidimensionales, segun el usuario lo pida. Para esto
     * deberas usar la estructura switch. Ejemplo: int Arreglo[][] = new
     * Arreglo[][];
     *
     */
    public static void main(String[] args) {
        Scanner T = new Scanner(System.in);
        int OP = 0;
        int numFilas, numColumnas;
        try {

            System.out.println("Ingresa el tamaño en filas para los arreglos");
            numFilas = T.nextInt();
            System.out.println("Ingresa el tamaño en columnas para los arreglos");
            numColumnas = T.nextInt();

            int Arreglo1[][] = new int[numFilas][numColumnas];
            int Arreglo2[][] = new int[numFilas][numColumnas];
            int Arreglo3[][] = new int[numFilas][numColumnas];
            System.out.println("Ingresa la operación a realizar");
            OP = T.nextInt();

            for (int i = 0; i < numFilas; i++) {
                for (int j = 0; j < numColumnas; j++) {
                    switch (OP) {
                        case 1://suma 
                               Arreglo3[i][j] = Arreglo1[i][j] + Arreglo2[i][j];
                            break;
                        case 2://resta
                            Arreglo3[i][j] = Arreglo1[i][j] - Arreglo2[i][j];
                            break;
                        case 3://división
                            Arreglo3[i][j] =  Arreglo1[i][j] / Arreglo2[i][j];
                            break;
                        case 4://multiplicación
                            Arreglo3[i][j] = Arreglo1[i][j] * Arreglo2[i][j];
                            break;

                    }
                }
            }
            

            for (int i = 0; i < numFilas; i++) {
                for (int j = 0; j < numColumnas; j++) {
                  switch (OP) {
                        case 1://suma 
                            System.out.println("El resultado de la suma de "+ Arreglo1[i][j]+" + "+ Arreglo2[i][j]+" es "+ Arreglo3[i][j]);
                            break;
                        case 2://resta
                            System.out.println("El resultado de la resta de "+ Arreglo1[i][j]+" - "+ Arreglo2[i][j]+" es "+ Arreglo3[i][j]);
                            break;
                        case 3://división
                            System.out.println("El resultado de la diviión de "+ Arreglo1[i][j]+" / "+ Arreglo2[i][j]+" es "+ Arreglo3[i][j]);

                            break;
                        case 4://multiplicación
                            System.out.println("El resultado de la multiplicación de "+ Arreglo1[i][j]+" * "+ Arreglo2[i][j]+" es "+ Arreglo3[i][j]);
                            break;

                    }  
                    
                }
            }
            
            
        } catch (Exception e) {

        }

    }

}
