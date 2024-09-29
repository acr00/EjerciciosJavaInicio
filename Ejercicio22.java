import java.util.Random;
import java.util.Scanner;

public class Ejercicio22 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int usuarionNum = 0;
        Random randomNum = new Random();

        while (usuarionNum != randomNum){
            
            System.out.println("adivina el numero");
            usuarionNum = sc.nextInt();

        }

        System.out.println(randomNum);

    }
}