package appporcentajecalif;

import java.util.Scanner;

public class AppPorcentajeCalif {

    public static void main(String[] args) {
        Promedio pr[] = new Promedio[3];
        CalExaFIn fo = new CalExaFIn();
        Scanner kb = new Scanner(System.in);
        int aux[] = new int[3];
        for (int pa = 0; pa < 3; pa++) {
            pr[pa] = new Promedio();
            System.out.println("Dame el parcial No " + (pa + 1));
            aux[pa] = kb.nextInt();
            pr[pa].setCalPar(aux);

        }
        for (int m = 0; m < 1; m++) {
            pr[m].calProcen();
            pr[m].impPar();
        }

        System.out.println("Dame la calificacion del examen: ");
        fo.setCalExam(kb.nextInt());

        System.out.println("Dame la calificacion del trabajo final: ");
        fo.setCalFin(kb.nextInt());

        fo.calExam();
        fo.impDatos();

    }
}
