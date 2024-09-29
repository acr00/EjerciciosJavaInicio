import java.util.Scanner;

public class ejercicio18 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int dia;
        System.out.println("introduzca un numero del 1 al 7");
        dia = sc.nextInt();

        switch (dia) {

            case 1:
                System.out.println("hoy es lunes");
                break;
            case 2:
                System.out.println("hoy es martes");
                break;
            case 3:
                System.out.println("hoy es miercoles");
                break;
            case 4:
                System.out.println("hoy es jueves");
                break;
            case 5:
                System.out.println("hoy es viernes");
                break;
            case 6:
                System.out.println("hoy es sabado");
                break;
            case 7:
                System.out.println("hoy es domingo");
                break;

        }
        
    }
}