package applistasarreglos;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class AppListasArreglos {

    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        String va;
        int pro;
        List<String>[] varios = new ArrayList[4];
        System.out.println("==========[TENDEDERO LISTA]========");
        for (int i = 0; i < 4; i++) {
            System.out.println("¿Cuantos elementos en la posicion [" + (i) + "]?");
            pro = kb.nextInt();
            varios[i] = new ArrayList();
            for (int j = 0; j < pro; j++) {
                System.out.println("Introduce el valor [" + (j + 1) + "]");
                va = kb.next();
                varios[i].add(va);
            }
        }
        for (int j = 0; j < 4; j++) {
            Iterator<String> lista = varios[j].iterator();
            System.out.print("[" + j + "]");
            while (lista.hasNext()) {
                System.out.print(" ------> " + lista.next());
            }
            System.out.println("");
        }
    }
}
