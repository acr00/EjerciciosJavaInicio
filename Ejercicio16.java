import java.util.Scanner;

public class Ejercicio16 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int ano;
        System.out.println("introduzca un ano para comprobar si es bisiesto: ");
        ano = sc.nextInt();

        if((ano % 4 == 0 && ano % 100 != 0) || (ano % 400 == 0)){

            System.out.println(" el ano es bisiesto");

        }else{

            System.out.println("el ano no es bisiesto ");

        }
        
    }
}