package cursointrojava;

/**
 *
 * @author HugoLuna
 */
public class Actividad04_Colores {
    
    
    public static void main(String[] args) {
    String rojo = "\033[31m";
    String verde = "\033[32m";
    String naranja = "\033[33m";
    String azul = "\033[34m";
    String morado = "\033[35m";
    String azul_cielo = "\033[36m";
    String blanco = "\033[37m";
    
    
    System.out.println(naranja + "lima" + verde + " verde");
    System.out.println(naranja + "lima" + rojo + " rojo");
    System.out.println(morado + "morado" + azul + " azul");
    System.out.println(azul_cielo+"azul cielo"+blanco + " blanco");
    }
}
