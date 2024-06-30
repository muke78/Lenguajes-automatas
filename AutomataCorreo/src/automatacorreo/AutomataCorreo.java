package automatacorreo;

import java.util.Scanner;

public class AutomataCorreo {

    public static void main(String[] args) {
        Correo c = new Correo();
        Scanner kb = new Scanner(System.in);
        System.out.println("Dame el correo: ");
        c.setPalabra(kb.next());
        System.out.println("q0 : Inicio");
        c.trans();

//        String s = "muke";
//        char c[] = s.toCharArray();
//        int vl;
//
//        for (int i = 0; i < c.length; i++) {
//            vl = c[i];
//
//            System.out.println(c[i] + " <---> " + vl);
    }

}

//Alt + 64 @
//Alt + 46 .
//Alt + 95 _
//Alt + 48 hasta 57 0-9
//Alt + 65 hasta 90 A-Z
//Alt + 97 hasta 122 a-z
