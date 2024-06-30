package appifnumeroigualmayor;

import java.util.Scanner;

public class AppIfNumeroIgualMayor {

    public static void main(String[] args) {
        calNumeros cn = new calNumeros();
        Scanner kb = new Scanner(System.in);
        System.out.println("Dame un numero: ");
        cn.setNum1(kb.nextInt());
        System.out.println("Dame el segundo numero: ");
        cn.setNum2(kb.nextInt());
        cn.calNumeros();
        
    }
}
