import java.util.Scanner;

public class Ejercicio26 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Introduce el número de filas de la primera matriz: ");

        int filas1 = sc.nextInt();

        System.out.print("Introduce el número de columnas de la primera matriz (y filas de la segunda): ");

        int columnas1 = sc.nextInt();

        System.out.print("Introduce el número de columnas de la segunda matriz: ");

        int columnas2 = sc.nextInt();

        int[][] matriz1 = new int[filas1][columnas1];
        int[][] matriz2 = new int[columnas1][columnas2];
        int[][] prod = new int[filas1][columnas2];

        System.out.println("Introduce los elementos de la primera matriz:");
        for (int i = 0; i < filas1; i++) {
            for (int j = 0; j < columnas1; j++) {
                matriz1[i][j] = sc.nextInt();
            }
        }

        System.out.println("Introduce los elementos de la segunda matriz:");
        for (int i = 0; i < columnas1; i++) {
            for (int j = 0; j < columnas2; j++) {
                matriz2[i][j] = sc.nextInt();
            }
        }

        for (int i = 0; i < filas1; i++) {
            for (int j = 0; j < columnas2; j++) {
                for (int k = 0; k < columnas1; k++) {
                    prod[i][j] += matriz1[i][k] * matriz2[k][j];
                }
            }
        }

        System.out.println("El producto de las matrices es : ");
        for (int i = 0; i < filas1; i++) {

                for (int j = 0; j < columnas2; j++) {
                    System.out.print(prod[i][j] + " ");
            }
                    System.out.println();
        
                }

        scanner.close();
    }
}