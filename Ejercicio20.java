import java.util.Scanner;

public class Ejercicio20 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int num;
            System.out.println("introduzca un numero");
            num = sc.nextInt();

        if(num % 2 == 0 && num > 0) {

            System.out.println("el numero es par y positivo");

        }else if( num % 3 == 0 || num < 0) {

            System.out.println("el numero es divisible por 3 o negativo");

        }

    }
}