import java.util.Scanner;

public class Ejercicio32 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String palabra;
        int contador = 0;

        System.out.println(" Introduzca una palabra : ");
        palabra = sc.next();
        palabra = palabra.toLowerCase();

        for (int i = 0; i < palabra.length(); i++) {
            char letras = palabra.charAt(i);

            if(letras == 'a' || letras == 'e' || letras == 'i' || letras == 'o' || letras == 'u'){
                contador++;
            }
        }

        System.out.println(" El numero de vocales en tu palabra es : "+ contador);
    }
}