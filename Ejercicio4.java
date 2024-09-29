public class Ejercicio4 {
    public static void main(String[] args) {
        int a = 5;
        int b = 10;

        System.out.println("Antes : a = " + a + ", b = " + b);

        // Intercambio usando XOR
        a = a ^ b;
        b = a ^ b;
        a = a ^ b;

        System.out.println("Después : a = " + a + ", b = " + b);
    }
}