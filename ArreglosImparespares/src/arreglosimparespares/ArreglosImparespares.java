package arreglosimparespares;

public class ArreglosImparespares {

    public static void main(String[] args) {
        // TODO code application logic here

        int x[] = new int[22];
        int y[] = new int[22];
        int z[] = new int[22];
        int p =0;
        int im =0;
        int pares = 0, impares = 0;
        for (int i = 0; i < 22; i++) {
            x[i] = (int) (Math.random() * 10) + 1;
        }
        System.out.println("Vector Principal:");
        for (int i = 0; i < 22; i++) {
            System.out.printf("[%2d]", x[i]);

            if (x[i] % 2 == 0) {
                pares++;

            } else {
                impares++;

            }
        }
        System.out.println("\n");
        System.out.println("Pares");
        for (int i = 0; i < 22; i++) {
            if (x[i] % 2 == 0) {
               
                 y[p] = x[i];
                 p++;
            }else{
                 z[im] = x[i];
                 im++;
            }
        }
        
        for (int i = 0; i < pares; i++) {
            System.out.print(y[i] + " ");
        }
        for (int i = 0; i < impares; i++) {
             System.out.print (z[i] + " ");
        }
        System.out.println("\nCantidad de numeros pares: " + pares);
        System.out.println("Cantidad de numeros impares: " + impares);
    }

}
