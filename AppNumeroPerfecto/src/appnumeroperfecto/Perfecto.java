package appnumeroperfecto;

public class Perfecto {

    private int num;
    private int resu;

    public Perfecto() {

    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public int getResu() {
        return resu;
    }

    public void calPerf() {
        for (int i = num / 2; i >= 1; i--) {
            if (num % i == 0) {
                resu += i;
            }

        }
        if (num == resu) {
            perfecto();
        } else {
            imperfecto();
        }

    }

    public void perfecto() {
        System.out.println("El numero es perfecto: ");
    }

    public void imperfecto() {
        System.out.println("El numero no es perfecto: ");
    }

}
