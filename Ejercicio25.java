import java.util.*;

public class Ejercicio25 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Ingresa el número de filas : ");
        int filas = scanner.nextInt();
        
        for (int i = 1; i <= filas; i++) {

                 for (int j = 1; j <= i; j++) {

                             System.out.print("*");
            }

            System.out.println();
        }
        
        scanner.close();
    }
}