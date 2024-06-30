package appestrcontrol;

public class SecTriangulo {

    private double bas;
    private double alt;
    private double areTri;

    public SecTriangulo() {
        bas = alt = areTri = 0;
    }

    public void setBas(double bas) {
        this.bas = bas;
    }

    public void setAlt(double alt) {
        this.alt = alt;
    }

    public void calArea() {
        areTri = (bas * alt) / 2;
    }

    public double getAreTri() {
        return areTri;
    }

}
