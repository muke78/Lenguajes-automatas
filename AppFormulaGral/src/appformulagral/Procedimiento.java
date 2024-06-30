package appformulagral;

public class Procedimiento {

    private double a, b, c, x0, x1, num;
    static String s = null;

    public Procedimiento() {

    }

    public void setA(double a) {
        this.a = a;
    }

    public void setB(double b) {
        this.b = b;
    }

    public void setC(double c) {
        this.c = c;
    }

    public void setX0(double x0) {
        this.x0 = x0;
    }

    public void setX1(double x1) {
        this.x1 = x1;
    }

    public void calEcua() {
         num = (b * b) - (4 * a * c);
        if (num > 0) {
            x0 = (-b + Math.sqrt(num)) / (2 * a);
            x1 = (-b - Math.sqrt(num)) / (2 * a);
            System.out.println("La ecuacion tiene dos soluciones");
            System.out.println("x1: " + x0);
            System.out.println("x2: " + x1);
        } else {
            if (num == 0) {
                x0 = (-b) / 2 * a;
                calOpci(x0);
            } else {
                System.out.println("La ecuacion no tiene solucion");
            }
        }
        
    }

    public void calOpci(double x0) {
        System.out.println("La ecuacion tiene dos soluciones");
        System.out.println("La ecuacion tiene una solucion");
        System.out.println("x1: " + x0);
    }

}
