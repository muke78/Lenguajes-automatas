package automataprueba;

public class Mul {

    private char c;
    private String palabra;
    private char palXcar[];
    private int edo;
    private int q;

    public Mul() {
        c = ' ';
        palabra = "";
        edo = 0;
        q = 0;
    }

    public void q0() {
        c = getPalXcar()[edo];
        if (c == '0' || c == '1') {
            q = 1;
            System.out.println("q" + q + " : " + c);
        }
    }

    public void q1() {
        c = getPalXcar()[edo];
        if (c == '0' || c == '1') {
            q = 2;
            System.out.println("q" + q + " : " + c);
        }
    }

    public void q2() {
        c = getPalXcar()[edo];
        if (c == '0' || c == '1') {
            q = 3;
            System.out.println("q" + q + " : " + c);
        }
    }

    public void q3() {
        c = getPalXcar()[edo];
        if (c == '0' || c == '1') {
            q = 1;
            System.out.println("q" + q + " : " + c);
        }
    }

    public void trans() {
        for (int i = 0; i < palXcar.length; i++) {
            switch (q) {
                case 0:
                    q0();
                    break;
                case 1:
                    q1();
                    break;
                case 2:
                    q2();
                    break;
                case 3:
                    q3();
                    break;
            }
            edo++;
        }
    }

    public String getPalabra() {
        return palabra;
    }

    public void setPalabra(String palabra) {
        this.palabra = palabra;
        palXcar = palabra.toCharArray();
    }

    public char[] getPalXcar() {
        return palXcar;
    }

    public String acept() {
        if (q == 3) {
            return "Estado aceptado";
        } else {
            return "Estado no aceptado";
        }
    }
}
