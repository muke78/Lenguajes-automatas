package matriztablapersonas;

import java.util.Scanner;

public class MatrizTablaPersonas {

    public static void main(String[] args) {
        Alumno a[] = new Alumno[1];
        Materia ma[] = new Materia[3];
        int aux[];
        Scanner kb = new Scanner(System.in);
        for (int i = 0; i < 1; i++) {
            a[i] = new Alumno((i + 1), "Erick", "Gonzalez", "Rivera", 20, 1.67, true, 3);
        }
        for (int m = 0; m < 3; m++) {
            aux = new int[3];
            System.out.println("Materia No " + (m + 1));
            ma[m] = new Materia();
            ma[m].setNombre(kb.next());
            for (int p = 0; p < 3; p++) {
                System.out.println("Dame el parcial No " + (p + 1));
                aux[p] = kb.nextInt();
            }
            ma[m].setPar(aux);
            ma[m].calProm();

        }
        for (int m = 0; m < 3; m++) {
            ma[m].impDatos();
        }
        for (int i = 0; i < 1; i++) {
            a[i].impAlum();
        }

    }
}
