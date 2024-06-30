package appfahrenheitcelsius;

public class Conversion {

    private double Fahr;
    private double resu;

    public Conversion() {
        Fahr = resu = 0.0;
    }

    public void setFahr(double Fahr) {
        this.Fahr = Fahr;
    }

    public void conTemp() {
        resu += (Fahr - 32) * 5 / 9;
    }

    public double getResu() {
        return resu;
    }

}
