package automatanumerosnaturales;

import java.util.Scanner;

public class AutomataNumerosNaturales {

    public static void main(String[] args) {
        Natural n = new Natural();
        Scanner kb = new Scanner(System.in);
        System.out.println("Dame la cadena: ");
        n.setPalabra(kb.next());
        System.out.println("q0 : Inicio");
        n.trans();
    }
}
