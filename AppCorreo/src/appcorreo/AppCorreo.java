package appcorreo;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class AppCorreo {
    
    
    public static void main(String[] args) throws FileNotFoundException, IOException {
        char arr[] = null;
        char c;
        int vl;
        
        

        String linea;
        FileReader leerArchivo;
        leerArchivo = new FileReader("C:/Users/MUKE/Desktop/JJ.txt");
        BufferedReader br = new BufferedReader(leerArchivo);
        
        while ((linea = br.readLine()) != null) {
            System.out.println(linea);
            arr = linea.toCharArray();
        }  
  
        System.out.println("Numero de caracteres: " + arr.length);
        br.close();
        
      String pepe = String.valueOf(arr);
      System.out.println("muke " + pepe);
      
      
        String[] muke = pepe.split("\\s+");
        for (int i = 0; i < muke.length; i++) {
            System.out.println(muke[i]);            
        }
                   
        String regex = "^[_A-Za-z0-9-\\+]+(\\.[_A-Za-z0-9-]+)*@"
                        + "[A-Za-z0-9-]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$";
		Pattern patron = Pattern.compile(regex);

		for (String texto : muke) {
			Matcher emparejador = patron.matcher(texto);
			boolean esCoincidente = emparejador.find();

			if (esCoincidente) {
				System.out.println("Correo reconocido: " + texto);
			}
		}
    }
    
}



