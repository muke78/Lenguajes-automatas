package grafosmatriz5;

import java.util.Scanner;

public class GrafosMatriz5 {

    public static void main(String[] args) {
        Grafo g = new Grafo();
        Scanner kb = new Scanner(System.in);
        System.out.println("Dame el No de nodos:");
        g.setIn(kb.nextInt());
        g.matEtiOri();
        System.out.println("Cuantas conexiones son: ");
        g.setConex(kb.nextInt());
        g.Conexiones();
        g.impMatriAdya();

    }

}
