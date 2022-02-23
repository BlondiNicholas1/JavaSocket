import java.io.*;
import jdk.internal.util.xml.impl.Input;

public class Test {
    public static void main(String[] args) {
        System.out.print("Javasocket (senza suffisso): ");
        String nome;
        nome = Input.readLine();
        try {
            
            // apre il file in scrittura
            FileWriter fileout = new FileWriter(nome + ".txt");
            String str;
            do {
                System.out.print("Scrivi una stringa (vuota per terminare): ");
                // legge una stringa da tastiera
                str = Input.readLine();
                
                // il ciclo scrive ogni carattere delle stringa nel file
                for (int i = 0; i < str.length(); i++)
                    fileout.write(str.charAt(i));
                fileout.write('\n');
                
            } while (str.length() > 0);
            
            fileout.close(); // chiude il file
            
        } catch (IOException e) {
            System.out.println(e);
        } 
        System.out.println("\nBye bye!");
    }
} 
    
    
