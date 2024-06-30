package automataprueba;

import java.util.Scanner;

public class AutomataMultiplo3 {

    public static void main(String[] args) {
        Mul m = new Mul();
        Scanner kb = new Scanner(System.in);
        System.out.println("Dame la cadena: ");
        m.setPalabra(kb.next());
        m.trans();
        System.out.println(m.acept());
    }
}
