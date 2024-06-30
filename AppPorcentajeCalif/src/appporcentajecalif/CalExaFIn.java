package appporcentajecalif;

public class CalExaFIn {

    private int calExam;
    private int calFin;
    private int resuExa;
    private int resuFin;

    public CalExaFIn() {

        calExam = calFin = 0;
    }

    public void setCalExam(int calExam) {
        this.calExam = calExam;
    }

    public void setCalFin(int calFin) {
        this.calFin = calFin;
    }

    public int getCalExam() {
        return calExam;
    }

    public int getCalFin() {
        return calFin;
    }

    public void calExam() {
        resuExa = (30 * calExam) / 10;
        resuFin = (15 * calFin) / 10;
    }

    public void impDatos() {
        System.out.print("El porcentaje del examen: " + resuExa + "%\n");
        System.out.print("El porcentaje es del trabajo final es: " + resuFin + "%\n");
    }

}
