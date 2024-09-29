import javax.swing.JOptionPane;

public class Ejercicio17 {

    public static void main(String[] args) {

        int num = Integer.parseInt(JOptionPane.showInputDialog("intruduzca un numero: "));

        int num2 = Integer.parseInt(JOptionPane.showInputDialog("intruduzca un segundo nombre: "));

        int calc = Integer.parseInt(JOptionPane.showInputDialog("que operacion desea realizar : 1.suma 2.resta 3.multiplicacion 4.division "));

        int resul;

            switch (calc) {

                case 1:
                     resul = num + num2;
                    JOptionPane.showMessageDialog(null,"el resultado es : "+resul);
                    break;
                case 2:
                    resul = num - num2;
                    JOptionPane.showMessageDialog(null,"el resultado es : "+resul);
                    break;
                case 3:
                    resul = num * num2;
                    JOptionPane.showMessageDialog(null,"el resultado es : "+resul);
                    break;  
                case 4:
                    resul = num / num2;
                    JOptionPane.showMessageDialog(null,"el resultado es : "+resul);
                    break;      
            
                default:
                    break;

            }
     }

}