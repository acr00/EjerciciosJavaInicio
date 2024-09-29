import java.util.Scanner;

public class Ejercicio15 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int num;
        System.out.println("introduzca un numero para verificar si es par o impar: ");
        num = sc.nextInt();

        if(num % 2 == 0){

            System.out.println("el numero es par ");

        }else{

            System.out.println("el numero es impar ");

        }
    }
}