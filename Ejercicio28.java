import java.util.Arrays;

public class Ejercicio28 {
    public static void main(String[] args) {

        int [] numeros = {1,2,3,4,5,6,7,8};

        System.out.println("Array original: "+Arrays.toString(numeros));

        int longitud = numeros.length;

        for (int i = 0; i < longitud / 2; i++) {

            int temp = numeros[i];
            numeros[i] = numeros[longitud - i - 1];
            numeros[longitud - i - 1] = temp;

        }

        System.out.println("array invertido: "+Arrays.toString(numeros));
        
    }
}