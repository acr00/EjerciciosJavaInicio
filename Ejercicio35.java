import java.util.ArrayList;
import java.util.Scanner;

public class Ejercicio35 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> lista = new ArrayList<>();
        

        System.out.println(" Introduce números enteros...(introduce 'stop' para terminar): ");
        while (true) {

            String entrada = sc.nextLine();
            if (entrada.equalsIgnoreCase("fin")) {

                break;
            }
            try {

                int numero = Integer.parseInt(entrada);
                listaEnteros.add(numero);

            } catch (NumberFormatException e) {

                System.out.println(" Entrada no válida. Introduce un número entero. ");

            }
        }
        
        System.out.println(" Lista de enteros : " + listaEnteros);

        int suma = 0;
        
        for (int numero : listaEnteros) {

            suma += numero;

        }

        System.out.println(" La suma de los enteros es: " + suma);

        
        scanner.close();

    }

}