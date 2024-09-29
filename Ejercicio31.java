import java.util.Scanner;

public class Ejercicio31 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);



        System.out.print("Introduce un palíndromo (Un palindromo es una palabra que se lee igual de un lado que de otro): ");
        String pali = scanner.nextLine();

        if (esPalindromo(pali)) {

            System.out.println("El texto introducido : es un palíndromo.");

        } else {

            System.out.println("El texto introducido : no es un palíndromo.");

        }

        scanner.close();


    }

    public static boolean esPalindromo(String pali) {
    
        String cadenaLimpia = pali.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();

        String cadenaInvertida = new StringBuilder(cadenaLimpia).reverse().toString();

        return cadenaLimpia.equals(cadenaInvertida);

    }
    
}