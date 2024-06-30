package appporcentajecalif;

public class Promedio {

    private int calPar[];
    private int resuCal;
    private int resuPar;

    public Promedio() {
        calPar = new int[3];
        resuCal = 0;

    }

    public void setCalPar(int[] calPar) {
        this.calPar = calPar;
    }

    public void calProcen() {
        resuCal = (calPar[0] + calPar[1] + calPar[2]) / 3;
        resuPar = (55 * resuCal) / 10;
    }

    public int[] getCalPar() {
        return calPar;
    }

    public void impPar() {
        for (int i = 0; i < 3; i++) {
            System.out.printf("%3d", calPar[i]);
        }
        System.out.println("");
        System.out.print("El promedio de las calificaiones es: " + resuCal);
        System.out.println("");
        System.out.print("El porcentaje de los parciales: " + resuPar + "%\n");
    }
}
