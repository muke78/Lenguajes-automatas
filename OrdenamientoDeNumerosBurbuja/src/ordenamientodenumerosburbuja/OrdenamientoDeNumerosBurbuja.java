package ordenamientodenumerosburbuja;

public class OrdenamientoDeNumerosBurbuja {

    public static void main(String[] args) {
        Orden o = new Orden();
        int vc;
        int arre[] = {46, 4241, 124, 375, 7372, 95, 15, 38, 545, 727, 688, 18260};
        o.numeroMayMen(arre);
        System.out.println("Menor: " + o.getMenor());
        System.out.println("Mayor: " + o.getMayor());
        o.imp(o.burbuja(arre));
         
    }

}
