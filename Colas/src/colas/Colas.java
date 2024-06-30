package colas;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;

public class Colas {

    public static void main(String[] args) {
        Queue<String> colores = new LinkedList();
        colores.add("Rojo");
        colores.add("Verde");
        colores.add("Azul");
        colores.add("Amarillo");
        colores.add("Morado");
        System.out.println(colores.poll());
        Iterator<String> it = colores.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }
        System.out.println("");
        System.out.println(colores);
        System.out.println("Hay una cantidad de colores de: " + colores.size());
        int c = colores.size();
        for (int i = 0; i < c; i++) {
            colores.peek();
            colores.poll();
            System.out.println(colores);
        }
        System.out.println("La cola esta vacia: " + colores.isEmpty());
    }

}
