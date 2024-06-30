package matrizsumarestamultiplicaciondivision;

public class MatrizSumaRestaMultiplicacionDivision {

    public static void main(String[] args) {
        MatrizObjetos mo = new MatrizObjetos(4);
        mo.opeXMatriz(0, 2, 0, 2, 'p',2);
        mo.opeXMatriz(0, 2, 2, 4, 'r',0);
        mo.opeXMatriz(2, 4, 0, 2, '/',10);
        mo.opeXMatriz(2, 4, 2, 4, '-',10);
        
        System.out.println("");
        mo.impMatrizOpe();
    }

}
