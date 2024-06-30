package appnumeroperfecto;

import java.util.Scanner;

public class AppNumeroPerfecto {

    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        Perfecto p = new Perfecto();
        System.out.println("Ingrese un numero: ");
        p.setNum(kb.nextInt());
        p.calPerf();
    }

}
