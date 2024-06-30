package appanimalesconsonido;

import java.io.IOException;
import java.util.Scanner;

public class AppAnimalesConSonido {

    public static void main(String[] args) throws IOException {
        Scanner kb = new Scanner(System.in);
        Sonidos s = new Sonidos();
        System.out.println("¡¡¡¡¡¡¡¡¡¡Se recomienda bajar el volumen!!!!!!!!!!!");
        System.out.print("Elige una de estas opciones: ");
        System.out.println("1-. Aguila\n2-. Cerdo\n3-. Gallina\n4-. Gallo\n5-. Gato\n6-. Lobo\n7-. Mono\n8-. Ave\n9.- Perro\n10-. Vaca");
        System.out.println("Ingresa un animal: ");
        s.setAni(kb.next());
        s.eleAni();

    }

}
