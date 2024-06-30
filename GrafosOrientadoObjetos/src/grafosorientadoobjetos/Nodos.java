package grafosorientadoobjetos;

public class Nodos {

    private String nom;
    private int numNodo;

    public Nodos(String nom) {
        this.nom = nom;
        numNodo = -1;
    }

    public String getNom() {
        return nom;
    }

    public int getNumNod() {
        return numNodo;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public void setNumNod(int numN) {
        this.numNodo = numN;
    }

    @Override
    public String toString() {
        return "Nodo [" + "Nombre: " + nom + ", Numero: " + numNodo + ']';
    }

    public String impNodo() {
        return "--[-> " + nom + "}[" + numNodo + "]";
    }

    public boolean isIgual(Nodos n) {
        boolean aux = false;
        if (this.nom.equals(n.getNom())) {
            aux = true;
        }
        return aux;
    }

}
