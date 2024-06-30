package tablapersonas;

public class TablaPersonas {

    public static void main(String[] args) {
        Tabla t[] = new Tabla[5];
        t[0] = new Tabla(55, "Erick", "Gonzalez", "Rivera", 20, 1.67, false);
        t[1] = new Tabla(55, "Ana Jazmin", "Luis", "Valle", 20, 1.61, false);
        t[2] = new Tabla(55, "Alexa", "Alvarado", "Gomez", 22, 1.58, false);
        t[3] = new Tabla(55, "Abigail", "Benito", "Neri", 20, 1.72, false);
        t[4] = new Tabla(55, "Danisa", "Villareal", "Vazquez", 20, 1.63, false);
        
        for (int vc = 0; vc < 5; vc++) {
            t[vc].imp();
        }
        
    }

}
