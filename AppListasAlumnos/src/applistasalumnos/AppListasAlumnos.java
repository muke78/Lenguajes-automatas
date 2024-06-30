package applistasalumnos;
import java.util.ArrayList;  import java.util.Iterator;
import java.util.List;       import java.util.Scanner;

public class AppListasAlumnos {

    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        String var;
        int regi = 0;
        System.out.println("Cuantos registros quieres?");
        regi = kb.nextInt();
        if (regi == 0) {
            System.out.println("[NO SE REALIZO NINGUN REGISTRO]");
        } else {
            List<Object>[] alumnos = new ArrayList[regi];
            System.out.println("====[REGISTRO ALUMNOS]====");
            for (int i = 0; i < regi; i++) {
                System.out.println("Registro: [" + (i + 1) + "]");
                alumnos[i] = new ArrayList();
                for (int j = 0; j < 8; j++) {
                    System.out.println("Introduzca el dato [" + (j + 1) + "]");
                    var = kb.next();
                    alumnos[i].add(var);
                }
            }
            for (int j = 0; j < regi; j++) {
                Iterator<Object> lista = alumnos[j].iterator();
                System.out.print("[" + j + "]");
                while (lista.hasNext()) {
                    System.out.print("--->" + lista.next());
                }
                System.out.println("");
            }
            System.out.println("[OK]");
        }
    }

}