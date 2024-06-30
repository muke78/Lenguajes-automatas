package arreglosnumeromayormenor;

public class ArreglosNumeroMayorMenor {

    public static void main(String[] args) {

        int x[] = new int[20];
        
        for (int i = 0; i < 20; i++) {
            x[i] = (int) (Math.random() * 100) + 1;
        }

        for (int i = 0; i < 20; i++) {
            System.out.print(" " + x[i]);
        }
         int mayor, menor;
        mayor = menor = x[0];
          for (int i = 0; i < x.length; i++) {
            if(x[i] > mayor) {
                mayor = x[i];
            }
            if(x[i]<menor) {
                menor =x[i];
            }
        }
          
        System.out.println("\nEl mayor valor es: "+mayor);
        System.out.println("El menor valor es: "+menor);
    }

}
