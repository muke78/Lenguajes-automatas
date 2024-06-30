package automatacorreo;

public class Correo {

    private char c;
    private String palabra;
    private char palXcar[];
    private int edo;
    private int q;
    private int vl;

    public Correo() {
        c = ' ';
        palabra = " ";
        edo = 0;
        q = 0;
    }
    
    public void q0() {
        c = getPalXcar()[edo];
        vl = c;
        if ((vl >= 65 && vl <= 90) || (vl >= 97 && vl <= 122) || (vl == 95)) {
            q = 1;
            System.out.println("q" + q + " : " + c + " <---> " + vl);

        }
    }

    public void q1() {
        c = getPalXcar()[edo];
        vl = c;
        if (vl == 64) {
            q = 2;
            System.out.println("q" + q + " : " + c + " <---> " + vl);

        }
        if ((vl >= 65 && vl <= 90) || (vl >= 97 && vl <= 122) || (vl >= 48 && vl <= 57) || (vl == 95)) {
            q = 1;
            System.out.println("q" + q + " : " + c + " <---> " + vl);

        }
    }

    public void q2() {
        c = getPalXcar()[edo];
        vl = c;
        if ((vl >= 65 && vl <= 90) || (vl >= 97 && vl <= 122)) {
            q = 3;
            System.out.println("q" + q + " : " + c + " <---> " + vl);

        }
    }

    public void q3() {
        c = getPalXcar()[edo];
        vl = c;
        if (vl == 46) {
            q = 4;
            System.out.println("q" + q + " : " + c + " <---> " + vl);

        }
        if ((vl >= 65 && vl <= 90) || (vl >= 97 && vl <= 122) || (vl >= 48 && vl <= 57)) {
            q = 3;
            System.out.println("q" + q + " : " + c + " <---> " + vl);

        }
    }

    public void q4() {
        c = getPalXcar()[edo];
        vl = c;
        if ((vl >= 65 && vl <= 90) || (vl >= 97 && vl <= 122)) {
            q = 5;
            System.out.println("q" + q + " : " + c + " <---> " + vl);

        }
    }

    public void q5() {
        c = getPalXcar()[edo];
        vl = c;
        if (vl == 46) {
            q = 6;
            System.out.println("q" + q + " : " + c + " <---> " + vl);

        }
        if ((vl >= 65 && vl <= 90) || (vl >= 97 && vl <= 122)) {
            q = 5;
            System.out.println("q" + q + " : " + c + " <---> " + vl);

        }
    }

    public void q6() {
        c = getPalXcar()[edo];
        vl = c;
        if ((vl >= 65 && vl <= 90) || (vl >= 97 && vl <= 122)) {
            q = 7;
            System.out.println("q" + q + " : " + c + " <---> " + vl);

        }
    }

    public void q7() {
        c = getPalXcar()[edo];
        vl = c;
        if ((vl >= 65 && vl <= 90) || (vl >= 97 && vl <= 122)) {
            q = 7;
            System.out.println("q" + q + " : " + c + " <---> " + vl);

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
                case 4:
                    q4();
                    break;
                case 5:
                    q5();
                    break;
                case 6:
                    q6();
                    break;
                case 7:
                    q7();
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

}
