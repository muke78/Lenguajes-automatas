package grafosorientadoobjetos;

import java.util.*;

public class GrafosOrientadoObjetos {

    public static void main(String[] args) {
        int nv = 0;
        String a = "", b = "";
        boolean ban = true, ban2 = true;
        Scanner kb = new Scanner(System.in);
        System.out.println("Dame numero de Nodos: ");
        int nn = kb.nextInt();
        System.out.println("Que desea una LISTA o MATRIZ");
        Grafo g = new Grafo(nn, kb.next());
        for (int i = 0; i < nn; i++) {
            System.out.println("Dame el nombre del Nodo: " + (i + 1));
            g.nvoNodo(kb.next());
        }
        g.impNodos();
        System.out.println("\n¿Cuantas relaciones tiene el grafo? ");
        nv = kb.nextInt();
        for (int i = 0; i < nv; i++) {
            if (ban) {
                System.out.print("Origen: [" + (i + 1) + "]");
                a = kb.next();
            }
            if (ban2) {
                System.out.print("Destino: [" + (i + 1) + "]");
                b = kb.next();
            }
            try {
                g.nvoArco(a, b);
                ban = ban2 = true;
                System.out.println("");
            } catch (Exception ex) {
                System.out.println(ex.getMessage());
                switch (g.getE()) {
                    case 1:
                        ban = ban2 = true;
                        break;
                    case 2:
                        ban = true;
                        if (g.isValNodo(b)) {
                            ban2 = false;
                        }
                        break;
                    case 3:
                        ban = false;
                        ban2 = true;
                        break;
                }
                i--;
            }
        }
        if (g.getT().toUpperCase().equals("LISTA")) {
            g.impLisAdy();
        } else {
            g.impMatriAdya();
        }
    }

}
