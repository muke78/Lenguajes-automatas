package colasalumnos;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class ColasAlumnos {

    public static void main(String[] args) {
        Queue<Alumnos> alumnos = new LinkedList();
        Alumnos a = new Alumnos();
        a.SetAlumnos(1, "Daires", "Gonzalez", "Rivera", 12, 1.45, 'F');
        Alumnos a1 = new Alumnos();
        a1.SetAlumnos(2, "Danisa", "Villareal", "Vazquez", 20, 1.56, 'F');
        Alumnos a2 = new Alumnos();
        a2.SetAlumnos(3, "Gerardo", "Martinez", "Alcantaro", 36, 1.72, 'M');

        alumnos.add(a);
        alumnos.add(a1);
        alumnos.add(a2);
//      alumnos.poll();

        Iterator<Alumnos> ia = alumnos.iterator();
        while (ia.hasNext()) {
            ia.next().impDat();
            System.out.println("");
        }
        System.out.println("");
    }

}
