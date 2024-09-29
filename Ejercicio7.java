import java.util.Scanner;

public class Ejercicio5 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Introduce un número entero: ");
        int entero = scanner.nextInt();

        System.out.print("Introduce un segundo número entero: ");
        int entero2 = scanner.nextInt();

        System.out.print("Introduce un tercer número entero: ");
        int entero3 = scanner.nextInt();

        System.out.println("Número introducido en 1a posicion : " + entero );
        System.out.println("Número introducido en 2a posicion: " + entero2 );
        System.out.println("Número introducido en 3a posicion: " + entero2 );

        int operacion = entero + entero2 * entero3;

        System.out.println("La operación es : "+entero+" + "+entero2+" * "+entero3+" = " + operacion );

        scanner.close();
    }
}