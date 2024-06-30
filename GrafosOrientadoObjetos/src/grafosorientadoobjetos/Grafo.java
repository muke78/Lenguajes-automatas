package grafosorientadoobjetos;

import java.util.*;

public class Grafo {

    private Nodos nodo[];
    private int matAdya[][];
    private List<Nodos> listAdy[];
    private int numNodos;
    private int i;
    private boolean no;
    private int e;
    private String t;

    public Grafo(int numNodos, String t) {
        this.t = t;
        this.numNodos = numNodos;
        nodo = new Nodos[numNodos];
        matAdya = new int[numNodos][numNodos];
        listAdy = new ArrayList[numNodos];
        this.creaLista(numNodos);
        i = 0;
        e = 0;
    }

    public String getT() {
        return t;
    }

    public void creaLista(int e) {
        for (int j = 0; j < e; j++) {
            listAdy[j] = new ArrayList();
        }
    }

    public int getE() {
        return e;
    }

    public void nvoNodo(String nom) {
        Nodos aux = new Nodos(nom);
        aux.setNumNod(i);
        nodo[i] = aux;
        i++;
    }

    public void impNodos() {
        for (int j = 0; j < numNodos; j++) {
            System.out.println(nodo[j].toString());
        }
    }

    public void nvoArco(String a, String b) throws Exception {
        if (!this.isValNodo(a) && !this.isValNodo(b)) {
            e = 1;
            throw new Exception("\u001B[31mNo existen los nodos [" + a + "] y [" + b + "]\u001B[30m");
        }
        if (!this.isValNodo(a)) {
            e = 2;
            throw new Exception("\u001B[31mNo existe el nodo [" + a + "] \u001B[30m");
        }
        if (!this.isValNodo(b)) {
            e = 3;
            throw new Exception("\u001B[31mNo existe el nodo [" + b + "]\u001B[30m");
        }
        if (t.toUpperCase().equals("MATRIZ")) {
            matriz(a, b);
        } else {
            lista(a, b);
        }
    }

    private void matriz(String a, String b) throws Exception {
        int org, des;
        org = numNodos(a);
        des = numNodos(b);

        if (!(matAdya[org][des] == 0)) {
            throw new Exception("Ya existe esa relacion " + a + " y " + b);
        }
        matAdya[org][des] = 1;

    }

    private void lista(String a, String b) throws Exception {
        int pos, posB;
        pos = numNodos(a);
        posB = numNodos(b);
        Nodos aux = new Nodos(b);
        aux.setNumNod(posB);
        if ((this.isValLis(a, b))) {
            throw new Exception("Ya existe esa relacion " + a + " y " + b);
        }
        listAdy[pos].add(aux);
        i++;
    }

    public boolean isValLis(String a, String b) {
        int pos;
        boolean aux = false;
        pos = numNodos(a);
        for (int i = 0; i < listAdy[pos].size(); i++) {
            if (listAdy[pos].get(i).getNom().equals(b)) {
                aux = true;
            }
        }
        return aux;
    }

    public boolean isValNodo(String x) {
        boolean aux = false;
        for (int j = 0; j < numNodos; j++) {
            if (nodo[j].getNom().equals(x)) {
                aux = true;
            }
        }
        if (aux == false) {
            System.out.println("N o  e x i s t e  e l  n o d o: " + x + "");
        }
        return aux;
    }

    public int numNodos(String nom) {
        int aux = 0;
        for (int j = 0; j < numNodos; j++) {
            if (nodo[j].getNom().equals(nom)) {
                aux = nodo[j].getNumNod();
            }
        }
        return aux;
    }

    public void impMatriAdya() {
        for (int f = 0; f < numNodos; f++) {
            for (int c = 0; c < numNodos; c++) {
                System.out.printf("[%2d]", matAdya[f][c]);
            }
            System.out.println("");
        }
    }

    public void impLisAdy() {
        for (int e = 0; e < listAdy.length; e++) {
            System.out.print("[ " + nodo[e].getNom() + " ]-");
            for (int i = 0; i < listAdy[e].size(); i++) {
                System.out.print(listAdy[e].get(i).impNodo()
                );
            }
            System.out.println("");
        }
    }
}
