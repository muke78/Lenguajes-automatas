package applistasalumnosclase;

public class Alumnos {

    private int id;
    private String nom;
    private String app;
    private String apm;
    private int eda;
    private double esta;
    private char sex;

    public Alumnos() {
        esta = eda = id = 0;
        nom = app = apm = "";
        sex = ' ';
    }

    public void SetAlumnos(int id, String nom, String app, String apm, int eda, double esta, char sex) {
        this.id = id;
        this.nom = nom;
        this.app = app;
        this.apm = apm;
        this.eda = eda;
        this.esta = esta;

        this.sex = sex;
    }

    public void impAlum() {
        System.out.printf("%2d %-8s %-6s %-6s %3d %5.2f %-6s -->", id, nom, app, apm, eda, esta, sex);

    }

}
