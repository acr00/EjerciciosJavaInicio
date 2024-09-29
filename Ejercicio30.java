public class Ejercicio30 {
    public static void main(String[] args) {

        int [][] matriz = {

            {1,2,3},
            {4,5,6},
            {7,8,9}

        };

        int filas = matriz.length;
        int col = matriz[0].length;
        int [][] trans = new int [filas][col];

        for (int i = 0; i < filas; i++) {

                for (int j = 0; j < col; j++) {

                     trans [j][i] = matriz [i][j];

            }

        }

        System.out.println("matriz transpuesta: ");

        for (int i = 0; i < col; i++) {
            for (int j = 0; j < filas; j++) {
                System.out.println(trans[i][j] + " ");

            }

            System.out.println();
            
        }
    }
}