public class Ejercicio3 {
    public static void main(String[] args) {
        int a = 2, b = 6;

        System.out.println("Valores ahora : a = " + a + ", b = " + b);

        a = a + b;
        b = a - b;
        a = a - b;

        System.out.println("Valores despues del cambio : a = " + a + ", b = " + b);
    }
    
}