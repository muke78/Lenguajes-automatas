package proyectoautomatas;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;
import java.util.StringTokenizer;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ProyectoAutomatas {

    private char arr[];
    private char c;
    private String palabra;
    private char palXcar[];
    private int edo;
    private int pal;
    private int num;
    private int cor;
    private int vl;
    private int cont = 1;

    public void leer(String archivo) throws FileNotFoundException, IOException {
        String linea;
        FileReader file = new FileReader(archivo);
        BufferedReader br = new BufferedReader(file);
        while ((linea = br.readLine()) != null) {
            System.out.println(linea);
            arr = linea.toCharArray();
        }
        System.out.println(arr.length);
        br.close();

    }

    public void pa0() {
        c = arr[edo];
        vl = c;
        if ((vl >= 65 && vl <= 90) || (vl >= 97 && vl <= 122)) {
            System.out.print(cont + ".- ");
            cont++;
            System.out.print(c);
            pal = 1;
        }
    }

    public void pa1() {
        c = arr[edo];
        vl = c;
        if (vl == 32) {
            System.out.println("");
            pal = 0;
        }
        if ((vl >= 65 && vl <= 90) || (vl >= 97 && vl <= 122)) {
            System.out.print(c);
            pal = 1;
        }

    }

    public void nu0() {
        c = arr[edo];
        vl = c;
        char c1 = arr[edo + 1];
        int vl2 = c1;
        char c2 = arr[edo + 1];
        int vl3 = c1;
        if ((vl >= 48 && vl <= 57) || (vl == 43) || (vl == 45)) {
            if ((vl >= 48 && vl <= 57)) {
                if ((vl2 >= 48 && vl2 <= 57)) {
                    
                }
                System.out.print(cont + ".- ");
                cont++;
                System.out.print(c);
                num = 1;
            }
            if ((vl == 43) || (vl == 45)) {
                if ((vl2 >= 48 && vl2 <= 57)) {
                    System.out.print(cont + ".- ");
                    cont++;
                    System.out.print(c);
                    num = 1;
                } else {
                    num = 0;
                }
            }
        }
    }

    public void nu1() {
        c = arr[edo];
        vl = c;
        if (vl == 32) {
            System.out.println("");
            num = 0;
        }
        if ((vl >= 48 && vl <= 57) || (vl == 46)) {
            System.out.print(c);
            num = 1;
        }

    }

    public void co0() {
        c = arr[edo];
        vl = c;
        char c1 = arr[edo + 1];
        int vl2 = c1;
        if (vl2 == 32) {

            if ((vl >= 65 && vl <= 90) || (vl >= 97 && vl <= 122) || (vl == 95)) {
                cor = 1;
                System.out.print(c);
            }
        }
    }

    public void co1() {
        c = arr[edo];
        vl = c;
        if (vl == 64) {
            cor = 2;
            System.out.print(c);
        }
        if ((vl >= 65 && vl <= 90) || (vl >= 97 && vl <= 122) || (vl >= 48 && vl <= 57) || (vl == 95)) {
            cor = 1;
            System.out.print(c);
        }
    }

    public void co2() {
        c = arr[edo];
        vl = c;
        if ((vl >= 65 && vl <= 90) || (vl >= 97 && vl <= 122)) {
            cor = 3;
            System.out.print(c);
        }
    }

//    public void co3() {
//        c = arr[edo];
//        vl = c;
//        if (vl == 46) {
//            cor = 4;
//            System.out.print(c);
//        }
//        if ((vl >= 65 && vl <= 90) || (vl >= 97 && vl <= 122) || (vl >= 48 && vl <= 57)) {
//            cor = 3;
//            System.out.print(c);
//        }
//    }
//
//    public void co4() {
//        c = arr[edo];
//        vl = c;
//        if ((vl >= 65 && vl <= 90) || (vl >= 97 && vl <= 122)) {
//            cor = 5;
//            System.out.print(c);
//        }
//    }
//
//    public void co5() {
//        c = arr[edo];
//        vl = c;
//        if (vl == 46) {
//            cor = 6;
//            System.out.print(c);
//        }
//        if ((vl >= 65 && vl <= 90) || (vl >= 97 && vl <= 122)) {
//            cor = 5;
//            System.out.print(c);
//        }
//    }
//
//    public void co6() {
//        c = arr[edo];
//        vl = c;
//        if ((vl >= 65 && vl <= 90) || (vl >= 97 && vl <= 122)) {
//            cor = 7;
//            System.out.print(c);
//        }
//    }
//
//    public void co7() {
//        c = arr[edo];
//        vl = c;
//        if ((vl >= 65 && vl <= 90) || (vl >= 97 && vl <= 122)) {
//            cor = 7;
//            System.out.print(c);
//        }
//    }
    public void trans() {
        System.out.println("PALABRAS");
        for (int i = 0; i < arr.length; i++) {
            switch (pal) {
                case 0:
                    pa0();
                    break;
                case 1:
                    pa1();
                    break;
            }
            edo++;
        }
        cont = 1;
        edo = 0;
        System.out.println("");
        System.out.println("NUMEROS");
        for (int i = 0; i < arr.length; i++) {
            switch (num) {
                case 0:
                    nu0();
                    break;
                case 1:
                    nu1();
                    break;
            }
            edo++;
        }
        System.out.println("");
        cont = 1;
        edo = 0;
        System.out.println("");
        System.out.println("CORREOS");
        for (int i = 0; i < arr.length; i++) {
            switch (cor) {
                case 0:
                    co0();
                    break;
                case 1:
                    co1();
                    break;
                case 2:
                    co2();
                    break;
//                case 3:
//                    co3();
//                    break;
//                case 4:
//                    co4();
//                    break;
//                case 5:
//                    co5();
//                    break;
//                case 6:
//                    co6();
//                    break;
//                case 7:
//                    co7();
//                    break;
            }
            edo++;
        }
        System.out.println("");
    }

    public static void main(String[] args) throws IOException {
        ProyectoAutomatas myLeer = new ProyectoAutomatas();
        myLeer.leer("C:/Users/MUKE/Desktop/prueba.txt");
        myLeer.trans();

    }
}
//Alt + 64 @
//Alt + 46 .
//Alt + 43 +
//Alt + 45 -
//Alt + 95 _
//Alt + 48 hasta 57 0-9
//Alt + 65 hasta 90 A-Z
//Alt + 97 hasta 122 a-z

