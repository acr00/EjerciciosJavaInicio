import java.util.*;

public class Ejercicio24 {

    public static void main(String[] args) {

		Scanner sc = new Scanner( System.in );

		double factorial;
		 int num;

		 System.out.print("Introduce un número: ");

		 num=teclado.nextInt();
		 factorial=1; 

		 for (int i=num;i>0;i--)

		 {

		 factorial=factorial*i;

		 }
		 System.out.println("El factorial de " + num + " es: " + factorial);
         
    }
}