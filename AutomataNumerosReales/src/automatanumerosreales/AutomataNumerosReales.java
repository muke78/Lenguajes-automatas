package automatanumerosreales;

import java.util.Scanner;

public class AutomataNumerosReales {

    public static void main(String[] args) {
        Reales r = new Reales();
        Scanner kb = new Scanner(System.in);
        System.out.println("Dame la cadena: ");
        r.setPalabra(kb.next());
        System.out.println("q0 : Inicio");
        r.trans();
    }

}
