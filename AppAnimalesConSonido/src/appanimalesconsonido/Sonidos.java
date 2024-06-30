package appanimalesconsonido;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import sun.audio.AudioPlayer;
import sun.audio.AudioStream;

public class Sonidos {

    private String ani;
    private String audio;
    private String audio2;
    private String audio3;
    private String audio4;
    private String audio5;
    private String audio6;
    private String audio7;
    private String audio8;
    private String audio9;
    private String audio10;

    public Sonidos() {
        ani = "";
    }

    public String getAni() {
        return ani;
    }

    public void setAni(String ani) {
        this.ani = ani;
    }

    public void eleAni() throws FileNotFoundException, IOException {
        switch (ani) {
            case "aguila":
            case "Aguila":
            case "AGUILA":
                System.out.println("Kakakkakakakooooooo");
                audio = "C:/Users/M U K E/Documents/PROGRAMACION/LENGUAJES AUTOMATAS/"
                        + "AppAnimalesConSonido/src/Sonidos/aguila02.wav";
                InputStream in = new FileInputStream(audio);
                AudioStream sonido = new AudioStream(in);
                AudioPlayer.player.start(sonido);
                break;
            case "cerdo":
            case "Cerdo":
            case "CERDO":
                System.out.println("OINÑ OINÑ");
                audio2 = "C:/Users/M U K E/Documents/PROGRAMACION/LENGUAJES AUTOMATAS/"
                        + "AppAnimalesConSonido/src/Sonidos/cerdo.wav";
                InputStream ina = new FileInputStream(audio2);
                AudioStream sonido2 = new AudioStream(ina);
                AudioPlayer.player.start(sonido2);
                break;
            case "gallina":
            case "Gallina":
            case "GALLINA":
                System.out.println("PIO PIO");
                audio3 = "C:/Users/M U K E/Documents/PROGRAMACION/LENGUAJES AUTOMATAS/"
                        + "AppAnimalesConSonido/src/Sonidos/gallinas.wav";
                InputStream ine = new FileInputStream(audio3);
                AudioStream sonido3 = new AudioStream(ine);
                AudioPlayer.player.start(sonido3);
                break;
            case "gato":
            case "Gato":
            case "GATO":
                System.out.println("MIAUUUUUU");
                audio4 = "C:/Users/M U K E/Documents/PROGRAMACION/LENGUAJES AUTOMATAS/"
                        + "AppAnimalesConSonido/src/Sonidos/gato.wav";
                InputStream ini = new FileInputStream(audio4);
                AudioStream sonido4 = new AudioStream(ini);
                AudioPlayer.player.start(sonido4);
                break;
            case "lobo":
            case "Lobo":
            case "LOBO":
                System.out.println("AAAAUUUUUUUUUUUUUUU");
                audio5 = "C:/Users/M U K E/Documents/PROGRAMACION/LENGUAJES AUTOMATAS/"
                        + "AppAnimalesConSonido/src/Sonidos/lobo.wav";
                InputStream ino = new FileInputStream(audio5);
                AudioStream sonido5 = new AudioStream(ino);
                AudioPlayer.player.start(sonido5);
                break;
            case "mono":
            case "Mono":
            case "MONO":
                System.out.println("AHHH HIII UHHHH AHHHHH");
                audio6 = "C:/Users/M U K E/Documents/PROGRAMACION/LENGUAJES AUTOMATAS/"
                        + "AppAnimalesConSonido/src/Sonidos/mono.wav";
                InputStream inu = new FileInputStream(audio6);
                AudioStream sonido6 = new AudioStream(inu);
                AudioPlayer.player.start(sonido6);
                break;
            case "pajaro":
            case "Pajaro":
            case "PAJARO":
            case "ave":
            case "Ave":
            case "AVE":
                System.out.println("FUIIII FUI FUI FUIIII");
                audio7 = "C:/Users/M U K E/Documents/PROGRAMACION/LENGUAJES AUTOMATAS/"
                        + "AppAnimalesConSonido/src/Sonidos/pajarito.wav";
                InputStream inua = new FileInputStream(audio7);
                AudioStream sonido7 = new AudioStream(inua);
                AudioPlayer.player.start(sonido7);
                break;
            case "perro":
            case "Perro":
            case "PERRO":
                System.out.println("GUUAAAAA GUUAAAAAAAAAOOO GUAAAAAO");
                audio8 = "C:/Users/M U K E/Documents/PROGRAMACION/LENGUAJES AUTOMATAS/"
                        + "AppAnimalesConSonido/src/Sonidos/perro.wav";
                InputStream inue = new FileInputStream(audio8);
                AudioStream sonido8 = new AudioStream(inue);
                AudioPlayer.player.start(sonido8);
                break;
            case "vaca":
            case "Vaca":
            case "VACA":
                System.out.println("MUUUUUUUUUUUUUUUU MUUUUUUUU");
                audio9 = "C:/Users/M U K E/Documents/PROGRAMACION/LENGUAJES AUTOMATAS/"
                        + "AppAnimalesConSonido/src/Sonidos/vaca01.wav";
                InputStream inui = new FileInputStream(audio9);
                AudioStream sonido9 = new AudioStream(inui);
                AudioPlayer.player.start(sonido9);
                break;
            case "gallo":
            case "Gallo":
            case "GALLO":
                System.out.println("KIKIRIRIRIRIRIRRKI KI");
                audio10 = "C:/Users/M U K E/Documents/PROGRAMACION/LENGUAJES AUTOMATAS/"
                        + "AppAnimalesConSonido/src/Sonidos/gallo.wav";
                InputStream inuo = new FileInputStream(audio10);
                AudioStream sonido10 = new AudioStream(inuo);
                AudioPlayer.player.start(sonido10);
                break;
            default:
                System.out.println("Animal no encontrado");
        }
    }
}
