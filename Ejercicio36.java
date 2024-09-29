import java.util.ArrayList;
import java.util.HashSet;

public class Ejercicio36 {
    public static void main(String[] args) {

        ArrayList<String> lista = new ArrayList<>();

        lista.add("edificio");
        lista.add("carta");
        lista.add("espada");
        lista.add("Pokemon");
        lista.add("carta");
        

        System.out.println("Lista original: " + lista);
        

        HashSet<String> conjunto = new HashSet<>(lista);
        

        ArrayList<String> listaSinDuplicados = new ArrayList<>(conjunto);
        

        System.out.println("Lista sin duplicados: " + listaSinDuplicados);
    }
}