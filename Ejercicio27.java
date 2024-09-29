import java.util.ArrayList;
import java.util.Scanner;

public class Ejercicio27{

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        
        /*

        int [] numeros = {12,20,34,56,23,87};

        int mayor = 0;

        for(int i = 0; i < numeros.length; i++){

            if(numeros[i] > mayor){
                mayor = numeros[i];

            }

        }

        System.out.println("el numero mayor es: "+mayor);
        
        */

        ArrayList<Integer> numeros = new ArrayList<>();

        int numero;
        int mayor = 0;

         for(int i = 0; i < 5; i++){

            System.out.println(" Introduce un numero : ");
            numero = sc.nextInt();
            numeros.add(numero);

        }

        for (int i = 1; i < numeros.size(); i++) {

            if (numeros.get(i) > mayor) {
                mayor = numeros.get(i);

            }
        }
        
        System.out.println("El numero mayor es : "+mayor); 

    }
}