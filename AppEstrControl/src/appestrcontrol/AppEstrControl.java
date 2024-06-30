package appestrcontrol;

public class AppEstrControl {

    public static void main(String[] args) {
        SecTriangulo sc = new SecTriangulo();
        sc.setBas(0.5);
        sc.setAlt(1);
        sc.calArea();
        System.out.println("El area es: " + sc.getAreTri());
    }

}
