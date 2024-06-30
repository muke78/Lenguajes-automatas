package matriztablapersonas;

public class Materia {

    private String nombre;
    private int par[];
    private int prom;

    public Materia() {
        nombre = "";
        par = new int[3];
        prom = 0;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public int[] getPar() {
        return par;
    }

    public void setPar(int[] par) {
        this.par = par;
    }

    public int getProm() {
        return prom;
    }

    public void setProm(int prom) {
        this.prom = prom;
    }

    public void calProm() {
        prom = (par[0] + par[1] + par[2]) / 3;
    }

    public void impDatos() {
        System.out.printf("%-20s", nombre);
        for (int i = 0; i < 3; i++) {
            System.out.printf("%3d", par[i]);
        }
        System.out.printf("%3d \n", prom);
    }

}
