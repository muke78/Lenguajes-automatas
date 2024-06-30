package tablapersonas;

public class Tabla {

    private int id;
    private String nom;
    private String app;
    private String apm;
    private int edad;
    private double est;
    private boolean CaSiNo;

    public Tabla() {
        id = edad = 0;
        est = 0.0;
        nom = app = apm = "";

    }

    public Tabla(int id, String nom, String app, String apm, int edad, double est, boolean CaSiNo) {
        this.id = id;
        this.nom = nom;
        this.app = app;
        this.apm = apm;
        this.edad = edad;
        this.est = est;
        this.CaSiNo = CaSiNo;
    }
    
    public void imp(){
        System.out.printf("%3d %-15s %-15s %-15s %3d %5.2f %7s", id, nom,app,apm,edad,est,CaSiNo);
        System.out.println("");
    }
    
  
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getApp() {
        return app;
    }

    public void setApp(String app) {
        this.app = app;
    }

    public String getApm() {
        return apm;
    }

    public void setApm(String apm) {
        this.apm = apm;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public double getEst() {
        return est;
    }

    public void setEst(double est) {
        this.est = est;
    }

    public boolean isCaSiNo() {
        return CaSiNo;
    }

    public void setCaSiNo(boolean CaSiNo) {
        this.CaSiNo = CaSiNo;
    }

}
