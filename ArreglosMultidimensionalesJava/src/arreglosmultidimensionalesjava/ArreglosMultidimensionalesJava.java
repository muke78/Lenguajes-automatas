package arreglosmultidimensionalesjava;

public class ArreglosMultidimensionalesJava {

    public static void main(String[] args) {

        final int d[][][] = {{{1, 2, 3}, {4, 5, 6}, {7, 8, 9}},
        {{10, 11, 12}, {13, 14, 15}, {16, 17, 18}}};

        int car, fil, col;
        for (car = 0; car < 2; car++) {
            System.out.println("Cara: " + car);

            for (fil = 0; fil < 3; fil++) {
                for (col = 0; col < 3; col++) {
                    System.out.print(d[car][fil][col]);
                }
                System.out.println("");

            }

        }

    }

}
