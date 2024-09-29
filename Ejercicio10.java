import javax.swing.JOptionPane;

public class Ejercicio10 {
    public static void main(String[] args) {
        int numero = Integer.parseInt(JOptionPane.showInputDialog("intruduzca un numero: "));
        int numero2 = Integer.parseInt(JOptionPane.showInputDialog("intruduzca un segundo nombre: "));
        int calculadora = Integer.parseInt(JOptionPane.showInputDialog("que operacion desea realizar : 1.suma 2.resta 3.multiplicacion 4.division"));
        int resultado;
            switch (calc) {
                case 1:
                     resultado = numero + numero2;
                    JOptionPane.showMessageDialog(null,"el resultado es "+resultado);
                    break;
                case 2:
                resultado = numero - numero2;
                    JOptionPane.showMessageDialog(null,"el resultado es :"+resultado);
                    break;
                case 3:
                resultado = numero * numero2;
                    JOptionPane.showMessageDialog(null,"el resultado es "+resultado);
                    break;  
                case 4:
                resultado = numero / numero2;
                    JOptionPane.showMessageDialog(null,"el resultado es "+resultado);
                    break;      
            
                default:
                    break;
            }
     }

}