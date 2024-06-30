package appifnumeroigualmayor;

public class calNumeros {

    private int num1;
    private int num2;
    private int resu;

    public calNumeros() {
        num1 = num2 = resu = 0;

    }

    public int getNum1() {
        return num1;
    }

    public void setNum1(int num1) {
        this.num1 = num1;
    }

    public int getNum2() {
        return num2;
    }

    public void setNum2(int num2) {
        this.num2 = num2;
    }

    public int getResu() {
        return resu;
    }

    public void calNumeros() {
        if (num1 > num2) {
            resu = num1;
            imDat();
        } 
        if (num2 > num1) {
            resu = num2;
            imDat();
        }
        if (num1 == num2) {
            igual();
        }
       
    }

    public void imDat() {
        System.out.println("El numero mayor es: " + resu);
    }

    public void igual() {
        System.out.println("Los numeros son iguales");
    }

}
