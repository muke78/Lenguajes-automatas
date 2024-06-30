package pilasalumnos;

import java.util.Iterator;
import java.util.Stack;
import pilasalumnos.Alumnos;

public class PilasAlumnos {

    public static void main(String[] args) {
        Stack<Alumnos> alumnos = new Stack();
        Alumnos a = new Alumnos();
        a.SetAlumnos(1, "Erick", "Gonzalez", "Rivera", 20, 1.67, 'M');
        Alumnos a1 = new Alumnos();
        a1.SetAlumnos(2, "Ana", "Luis", "Valle", 20, 1.56, 'F');
        Alumnos a2 = new Alumnos();
        a2.SetAlumnos(3, "Sayra", "Alvarado", "Flores", 20, 1.54, 'F');

        alumnos.add(a);
        alumnos.add(a1);
        alumnos.add(a2);
//        alumnos.pop();

        Iterator<Alumnos> ia = alumnos.iterator();
        while (ia.hasNext()) {
            ia.next().impDat();
            System.out.println("");
        }
        System.out.println("");
    }

}
