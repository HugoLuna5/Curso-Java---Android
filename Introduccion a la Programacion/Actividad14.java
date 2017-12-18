/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cursointrojava;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/**
 *
 * @author HugoLuna
 */
public class Actividad14 {
    public static void main(String[] args) {
         String urlfile = "doc.txt";
         int n = 0;
      
        
        
        try {
            BufferedReader bf1 = new BufferedReader(new FileReader(urlfile));
            String linea = "";
           
            while ((linea = bf1.readLine()) != null) {
                System.out.println(linea);
                n++;
            }

            
            bf1.close();
        } catch (FileNotFoundException e) {
            // Qué hacer si no se encuentra el fichero
            System.out.println("No se encuentra el archivo");
        } catch (IOException e) {
            // Qué hacer si hay un error en la lectura del fichero
            System.out.println("No se puede leer el archivo");
        }
        
    }
}
