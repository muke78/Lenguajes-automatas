package arreglosbidimensionalesjava;

public class ArreglosBidimensionalesJava {

    public static void main(String[] args) {

        int c1[][] = new int[][]{{1, 2, 3}, {4, 8, 9}};

        for (int f = 0; f < 2; f++) {
            for (int c = 0; c < 3; c++) {
                System.out.print(c1[f][c]);

            }
            System.out.println("");
        }
    }
}