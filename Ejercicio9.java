import javax.swing.JOptionPane;

public class Ejercicio9 {
    public static void main(String[] args) {
        
        String nombre = JOptionPane.showInputDialog("Introduce tu nombre:");

        
        JOptionPane.showMessageDialog(null, "Hola, " + nombre );
    }
}
