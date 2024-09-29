import java.util.Scanner;

public class Ejercicio21 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int num = 1;
        int res = 0;
       while (num != 0){

            System.out.println("introduzca un numero introduzca 0 para finalizar");
            num = sc.nextInt();
            res += num;

       }

       System.out.println("el resultado es "+ res);
       
    }
}