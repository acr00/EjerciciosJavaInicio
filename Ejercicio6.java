import java.util.Scanner;

public class Ejercicio5 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Introduce un número entero: ");
        int entero = scanner.nextInt();

        System.out.print("Introduce un segundo número entero: ");
        int entero2 = scanner.nextInt();

        System.out.println("Número introducido en 1a posicion : " + entero );
        System.out.println("Número introducido en 2a posicion: " + entero2 );

        int suma = entero + entero2;

        System.out.println("La suma de estos 2 numeros es : " + suma );

        scanner.close();
    }
}