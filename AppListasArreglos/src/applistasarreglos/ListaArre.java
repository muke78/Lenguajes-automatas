package applistasarreglos;

public class ListaArre {

    private int id;
    private String nom;
    private String app;
    private String apm;
    private int edad;
    private double est;
    private char sexo;

    public ListaArre() {
        est = edad = id = 0;
        nom = app = apm = "";
        sexo = ' ';
    }
    
    public void ListaArre(int id, String nom, String app, String apm, int edad, double est, char sexo) {
        this.id = id;
        this.nom = nom;
        this.app = app;
        this.apm = apm;
        this.edad = edad;
        this.est = est;
        this.sexo = sexo;
        

    }

    public void impDatos() {
        System.out.printf("%2d %-15s %-15s %-15s %3d %5.2f %c\n", id, nom, app, apm, edad, est, sexo);

    }

}
