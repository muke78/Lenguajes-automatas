package applistas;

import java.util.ArrayList;
import java.util.List;

public class AppListas {

    public static void main(String[] args) {
        List<Alumno> alumnos = new ArrayList();

        Alumno a = new Alumno();
        a.setAlumno(1, "Erick", "GOnzalez", "Rivera", 20, 1.67, 'M');
        Alumno a1 = new Alumno();
        a1.setAlumno(2, "Ana", "Luis", "Valle", 20, 1.67, 'F');

        alumnos.add(a);
        alumnos.add(a1);
        alumnos.remove(1);
        for (int i = 0; i < alumnos.size(); i++) {
            alumnos.get(i).impDatos();
        }

    }

}
