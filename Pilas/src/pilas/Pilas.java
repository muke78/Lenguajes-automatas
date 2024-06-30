package pilas;

import java.util.Stack;

public class Pilas {

    public static void main(String[] args) {
        Stack<String> colores = new Stack();
        colores.push("Rojo");
        colores.push("Verde");
        colores.push("Azul");
        colores.push("Amarillo");
        colores.push("Morado");
        System.out.println(colores);
        int c = colores.size();
        String aux;
        for (int i = 0; i < c; i++) {
            System.out.println("Se saco el color: " + colores.peek());
            colores.pop();
            System.out.println(colores);

        }
        System.out.println(colores.isEmpty());
    }

}
