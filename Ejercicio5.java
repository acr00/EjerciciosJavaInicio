import java.util.Scanner;

public class Ejercicio5 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Introduce un número entero: ");
        int entero = scanner.nextInt();

        System.out.print("Introduce un número decimal: ");
        double decimal = scanner.nextDouble();
        scanner.nextLine(); //Limpiamos el buffer

        System.out.print("Introduce una cadena de texto: ");
        String cadena = scanner.nextLine();

        System.out.println("Número entero: " + entero );
        System.out.println("Número decimal: " + decimal );
        System.out.println("Cadena de texto: " + cadena );

        scanner.close();
    }
}