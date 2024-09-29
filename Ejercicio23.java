import java.util.*;

public class Ejercicio23 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int num;
        System.out.println("introduzca un numero: ");
        num = sc.nextInt();

        for (int i = 0; i < 11; i++){

            System.out.println(num + " x "+ i +" = "+ (num * i));

        }
    }
}