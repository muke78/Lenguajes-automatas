package matrizsumarestamultiplicaciondivision;

public class MatrizObjetos {

    private int matrizOri[][];
    private int matrizOpe[][];
    private int tam;
    private char ope;
    private int v2;

    public MatrizObjetos(int tam) {
        this.tam = tam;
        this.matrizOri = new int[tam][tam];
        this.matrizOpe = new int[tam * 2][tam];
        llenaMatriz();
        impMatrizOrg();
    }

    public void llenaMatriz() {
        for (int f = 0; f < tam; f++) {
            for (int c = 0; c < tam; c++) {
                matrizOri[f][c] = (int) (Math.random() * 100) + 1;
            }

        }
    }

    public void impMatrizOrg() {
        for (int f = 0; f < tam; f++) {
            for (int c = 0; c < tam; c++) {
                System.out.printf("%3d ", matrizOri[f][c]);
            }
            System.out.println("");

        }
    }

    public void impMatrizOpe() {
        for (int f = 0; f < tam * 2; f++) {
            for (int c = 0; c < tam; c++) {
                System.out.printf("%4d ", matrizOpe[f][c]);
            }
            System.out.println("");

        }
    }

    public void opeXMatriz(int fi, int ff, int ci, int cf, char ope, int v2) {
        this.ope = ope;
        this.v2 = v2;
        int fp = fi * 2, fn = fp + 1;
        for (int f = fi; f < ff; f++) {
            for (int c = ci; c < cf; c++) {
                matrizOpe[fp][c] = matrizOri[f][c];
                matrizOpe[fn][c] = selOpeRes(matrizOri[f][c], v2);

            }//Columnas
            fp += 2;
            fn += 2;
        }//For filas
    }

    public int selOpeRes(int v1, int v2) {
        int res = 0;
        switch (ope) {
            case '+':
                res = v1 + v2;
                break;
            case '-':
                res = v1 - v2;
                break;
            case '*':
                res = v1 * v2;
                break;
            case '/':
                res = v1 / v2;
                break;
            case 'p':
                res = (int) Math.pow(v1, v2);
                break;
            case 'r':
                res = (int) Math.sqrt(v1);
                break;

            default:
                throw new AssertionError();
        }

        return res;

    }
}
