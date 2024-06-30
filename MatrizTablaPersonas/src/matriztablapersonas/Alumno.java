package matriztablapersonas;

import java.util.Scanner;

public class Alumno {

    Scanner kb = new Scanner(System.in);
    private Materia materias[];
    private int id;
    private String nom;
    private String app;
    private String apm;
    private int edad;
    private double est;
    private boolean edo;
    private int mat;

    public Alumno(int id, String nom, String app, String apm, int edad, double est, boolean edo, int mat) {
        this.id = id;
        this.nom = nom;
        this.app = app;
        this.apm = apm;
        this.edad = edad;
        this.est = est;
        this.edo = edo;
        this.mat = mat;
        materias = new Materia[mat];
    }

   
    
   public int getId() {
        return id;
    }

    public String getNom() {
        return nom;
    }

    public String getApp() {
        return app;
    }

    public String getApm() {
        return apm;
    }

    public int getEdad() {
        return edad;
    }

    public double getEst() {
        return est;
    }

    public boolean isEdo() {
        return edo;
    }
    
    public void impAlum(){
         System.out.printf("%2d %-15s %-15s %-15s %3d %5.2f %-6s\n", id, nom, app, apm, edad, est, edo);
    }

   public void setMatpar() {
        String nom;
        int sum;
        int aux[];
        for (int i = 0; i < mat; i++) {
            aux = new int[3];
            sum = 0;
            System.out.println("Dame el nombre de la Materia" + (i + 1));
            nom = kb.next();
            for (int j = 0; j < 3; j++) {
                System.out.println("Dame el parcial " + (j + 1));
                aux[j] = kb.nextInt();
                sum += aux[j];
            }
            matPar(nom, aux, (sum/3), i);

        }
    }

    public void matPar(String nom, int[] par, int pro, int pos) {
        materias[pos] = new Materia();
        materias[pos].setNombre(nom);
        materias[pos].setPar(par);
        materias[pos].setProm(pro);
    }

    public void impDatos() {
        System.out.printf("%2d %-15s %-15s %-15s %3d %5.2f %-6s\n", id, nom, app, apm, edad, est, edo);
        for (int i = 0; i < mat; i++) {
            System.out.printf("%-20s ", materias[i].getNombre());
            for (int j = 0; j < 3; j++) {
                System.out.printf("%3d ", materias[i].getPar()[j]);
            }
        }
    }

}
