package applistasalumnosclase;

import java.util.ArrayList;
import java.util.List;

public class AppListasAlumnosClase {

    public static void main(String[] args) {
        List<Alumnos> alumnos = new ArrayList();
        Alumnos a = new Alumnos();
        a.SetAlumnos(1, "Erick", "Gonzalez", "Rivera", 20, 1.67, 'M');
        Alumnos a1 = new Alumnos();
        a1.SetAlumnos(2, "Ana", "Luis", "Valle", 20, 1.56, 'F');
        Alumnos a2 = new Alumnos();
        a2.SetAlumnos(3, "Abigail", "Neri", "Cortez", 20, 1.72, 'F');

        int grupos[] = {501, 502, 503, 504};
        List<Alumnos>[] grupo = new ArrayList[4];

        grupo[0] = new ArrayList();
        grupo[0].add(a);
        grupo[0].add(a1);
        grupo[0].add(a2);

        grupo[1] = new ArrayList();
        grupo[1].add(a2);
        grupo[1].add(a1);

        grupo[2] = new ArrayList();
        grupo[2].add(a2);

        grupo[3] = new ArrayList();
        grupo[3].add(a);
        grupo[3].add(a1);

        for (int j = 0; j < 4; j++) {
            System.out.println("[" + grupos[j] + "]");
            for (int i = 0; i < grupo[j].size(); i++) {
                grupo[0].get(i).impAlum();
            }
            System.out.println("");
        }
        System.out.println("");

    }

}
