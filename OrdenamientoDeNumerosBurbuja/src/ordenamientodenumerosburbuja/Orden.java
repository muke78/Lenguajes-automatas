package ordenamientodenumerosburbuja;

public class Orden {

    private int mayor;
    private int menor;

    public Orden() {
        mayor = menor = 0;
    }

    public int[] burbuja(int arreglo[]) {
        for (int i = 2; i < arreglo.length; i++) {
            for (int j = 0; j < arreglo.length - i; j++) {
                if (arreglo[j] > arreglo[j + 1]) {
                    int tmp = arreglo[j + 1];
                    arreglo[j + 1] = arreglo[j];
                    arreglo[j] = tmp;
                }
            }
        }

        return arreglo;
    }

    public void imp(int vec[]) {
        int vc;
        for (vc = 0; vc < vec.length; vc++) {
            System.out.println(vec[vc]);
        }
    }

    public void numeroMayMen(int vec[]) {
        int vc;
        mayor = menor = vec[0];
        for (vc = 0; vc < vec.length; vc++) {
            if (vec[vc] > mayor) {
                mayor = vec[vc];
            }
            if (vec[vc] < menor) {
                menor = vec[vc];
            }
        }
    }

    public int getMayor() {
        return mayor;
    }

    public int getMenor() {
        return menor;
    }

}
