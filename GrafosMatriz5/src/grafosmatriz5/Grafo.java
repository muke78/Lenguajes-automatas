package grafosmatriz5;

import java.util.Scanner;

public class Grafo {

    private int in;
    private int conex, pos, pos2;
    private int nodo[][];
    private String letra[];
    Scanner kb = new Scanner(System.in);

    public Grafo() {
        in = conex = pos = pos2 = 0;
    }

    public void setIn(int in) {
        this.in = in;
    }

    public void setConex(int conex) {
        this.conex = conex;
    }

    public void matEtiOri() {
        nodo = new int[in][in];
        letra = new String[in + 1];
        for (int f = 1; f < letra.length; f++) {
            letra[0] = " ";
            System.out.print("Etiqueta " + "[" + f + "]: ");
            letra[f] = kb.next();
        }
        System.out.println("Matriz Original: ");
        for (int f = 0; f < letra.length; f++) {
            System.out.printf("[%1s]", letra[f]);
        }

        System.out.println("");

        for (int f = 0; f < nodo.length; f++) {
            System.out.printf("[%1s]", letra[f + 1]);
            for (int c = 0; c < nodo.length; c++) {
                System.out.printf("[%1d]", nodo[f][c]);
            }
            System.out.println("");
        }
    }

    public void Conexiones() {
        for (int j = 0; j < conex; j++) {
            String fi, co;
            System.out.println("Relacion " + (j + 1));
            System.out.print("Posicion x: ");
            fi = kb.next();
            System.out.print("Posicion y: ");
            co = kb.next();

            for (int i = 0; i < letra.length; i++) {
                if (letra[i].equals(fi)) {
                    pos = i - 1;
                }
                if (letra[i].equals(co)) {
                    pos2 = i - 1;
                }

            }
            nodo[pos][pos2] = 1;

        }
    }

    public void impMatriAdya() {
        System.out.println("Matriz Adyacente: ");
        for (int f = 0; f < letra.length; f++) {
            System.out.printf("[%1s]", letra[f]);
        }

        System.out.println("");

        for (int f = 0; f < nodo.length; f++) {
            System.out.printf("[%1s]", letra[f + 1]);
            for (int c = 0; c < nodo.length; c++) {
                System.out.printf("[%1d]", nodo[f][c]);
            }
            System.out.println("");
        }
    }
}
