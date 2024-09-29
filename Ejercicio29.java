import java.util.Scanner;

public class Ejercicio29 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduce el numero de filas"); 
        int filas = scanner.nextInt();
        System.out.println("Introduce numero de columnas");
        int columnas = scanner.nextInt();

        int[][] matriz1 = new int[filas][columnas];
        int[][] matriz2 = new int[filas][columnas];
        int[][] resultado = new int[filas][columnas];


                System.out.println("Introduce los valores de la primera matriz:");
                for (int i = 0; i < filas; i++) {
                    for (int j = 0; j < columnas; j++) {
                        System.out.print(" matriz 1 : [" + i + "][" + j + "]: ");
                        matriz1[i][j] = scanner.nextInt();
                    }
                }
        
                System.out.println("Introduce los valores de la segunda matriz:");
                for (int i = 0; i < filas; i++) {
                    for (int j = 0; j < columnas; j++) {
                        System.out.print(" matriz 2 : [" + i + "][" + j + "]: ");
                        matriz2[i][j] = scanner.nextInt();
                    }
                }

                System.out.println("Calculando el resultado...");
                for (int i = 0; i < filas; i++) {
                    for (int j = 0; j < columnas; j++) {
                        resultado[i][j] = matriz1[i][j] + matriz2[i][j];
                    }
                }
        
                System.out.println("La suma de las matrices es : ");
                for (int i = 0; i < filas; i++) {
                    for (int j = 0; j < columnas; j++) {
                        System.out.print(resultado[i][j] + " ");
                    }
                    System.out.println();
                }
        
                scanner.close();
            }

}