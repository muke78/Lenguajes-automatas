package appformulagral;

import java.util.*;

public class AppFormulaGral {

    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        Procedimiento p = new Procedimiento();
        System.out.println("Dame el dato A: ");
        p.setA(kb.nextDouble());
        System.out.println("Dame el dato B: ");
        p.setB(kb.nextDouble());
        System.out.println("Dame el dato C: ");
        p.setC(kb.nextDouble());
        p.calEcua();
        
        

    }

}
