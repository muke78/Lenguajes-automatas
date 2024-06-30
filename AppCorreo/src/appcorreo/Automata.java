package appcorreo;

public class Automata {
    char bin[];
    int cont = 0;
    String cadena = "";
    
    public void cadena(String pos) {
        bin = pos.toCharArray();
        System.out.println("El correo es: " + bin.length);
    }
}
