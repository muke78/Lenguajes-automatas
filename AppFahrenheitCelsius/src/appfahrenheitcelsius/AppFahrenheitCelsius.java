package appfahrenheitcelsius;

import java.util.Scanner;

public class AppFahrenheitCelsius {

    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        Conversion c = new Conversion();
        System.out.println("Dame los Fahrenheit: ");
        c.setFahr(kb.nextDouble());
        c.conTemp();
        System.out.println("El resultado en Celsius es: " + c.getResu() + "°C");
    }

}
