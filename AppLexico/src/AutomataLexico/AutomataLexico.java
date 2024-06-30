package AutomataLexico;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.JFileChooser;

public class AutomataLexico {

    private char arr[];
    private char c;
    private String arrp[];
    private int edo;
    private int pal;
    private int num;
    private int cor;
    private int ope;
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

        System.out.println("Numero de caracteres: " + arr.length);
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
        if (vl == 32 || vl == 46 || vl == 64) {
            System.out.println("");
            pal = 0;
        }
        if ((vl >= 65 && vl <= 90) || (vl >= 97 && vl <= 122)) {
            System.out.print(c);
            pal = 1;
        }

    }

    public void co0() {
        String arr2 = String.valueOf(arr);
        String[] cadena = arr2.split("\\s+");
        for (int i = 0; i < cadena.length; i++) {

        }
        String regex = "^[_A-Za-z0-9-\\+]+(\\.[_A-Za-z0-9-]+)*@"
                + "[A-Za-z0-9-]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$";
        Pattern patron = Pattern.compile(regex);
        for (String texto : cadena) {
            Matcher empar = patron.matcher(texto);
            boolean esCoincidente = empar.find();
            if (esCoincidente) {
                System.out.println(texto);
            }
        }
        cor = 1;
    }

    public void co1() {
        System.out.println("");
        cor = 0;
    }

    public void nu0() {
        c = arr[edo];
        vl = c;
        char c1 = arr[edo + 1];
        int vl2 = c1;
        if ((vl >= 48 && vl <= 57) || (vl == 43) || (vl == 45)) {
            if ((vl >= 48 && vl <= 57)) {
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
        if ((vl == 32) || (vl == 42) || (vl == 43) || (vl == 45) || (vl == 47)) {
            System.out.println("");
            num = 0;
        }
        if ((vl >= 48 && vl <= 57)) {
            System.out.print(c);
            num = 1;
        }
        if (vl == 46) {

            char c1 = arr[edo + 1];
            int v2 = c1;
            if ((v2 >= 48 && v2 <= 57)) {
                System.out.print(c);
                num = 1;
            } else {
                num = 1;
            }
        }
    }

    public void sim0() {
        c = arr[edo];
        vl = c;
        if ((vl >= 33 && vl <= 41) || (vl == 44) || (vl == 46) || (vl == 47)
                || (vl >= 58 && vl <= 64)) {
            System.out.print(cont + ".- ");
            cont++;
            System.out.print(c + "\n");
            ope = 0;
        }
        if (vl == 32) {
            ope = 0;
        }
    }

    public void op0() {
        c = arr[edo];
        vl = c;
        if ((vl == 43) || (vl == 45) || (vl == 47) || (vl == 42)) {
            System.out.print(cont + ".- ");
            cont++;
            System.out.print(c + "\n");
            ope = 0;
        }
        if (vl == 32) {
            ope = 0;
        }
    }

    public void trans() {
        System.out.println("\nPALABRAS");
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
        System.out.println("\nNUMEROS");
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
        cont = 1;
        edo = 0;
        System.out.println("\n\nCORREOS");
        for (int i = 0; i < arr.length; i++) {
            switch (cor) {
                case 0:
                    co0();
                    break;
            }
            edo++;
        }
        cont = 1;
        edo = 0;
        System.out.println("\n\nSIMBOLOS");
        for (int i = 0; i < arr.length; i++) {
            switch (ope) {
                case 0:
                    sim0();
                    break;
            }
            edo++;
        }
        cont = 1;
        edo = 0;
        System.out.println("\nOPERADORES");
        for (int i = 0; i < arr.length; i++) {
            switch (ope) {
                case 0:
                    op0();
                    break;
            }
            edo++;
        }
        System.out.println("");
    }

    public static void main(String[] args) throws IOException {
        AutomataLexico myLeer = new AutomataLexico();
        myLeer.leer("../AppLexico/src/JJ.txt");
        myLeer.trans();
    }
}
