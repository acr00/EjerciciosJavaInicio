import java.util.Random;

public class Ejercicio13 {
    public static void main(String[] args) {
        Random aleatorio = new Random();
        
        int dado1 = aleatorio.nextInt(6) + 1;
        int dado2 = aleatorio.nextInt(6) + 1; 
        
        System.out.println("Tirada del dado 1: " + dado1);
        System.out.println("Tirada del dado 2: " + dado2);
    }
}