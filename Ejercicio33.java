import java.util.Scanner;

public class Ejercicio33 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print(" Introduce una cadena de texto que contenga solo números: ");
        String cadena = scanner.nextLine();
        
        if (cadena.matches("\\d+")) {

            int numero = Integer.parseInt(cadena);

            System.out.println("El resultado es : " + (numero + 10));

        } else {

            System.out.println( " Error: La cadena introducida no contiene solo números. ");
        }
        
        scanner.close();
    }
}