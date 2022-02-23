/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clientsocket;

import java.io.*;
import java.net.*;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author pogliani.mattia
 */
public class ClientSocket {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        try {
            Socket clientSocket = new Socket("10.1.33.200", 5000);
            PrintWriter out = new PrintWriter(clientSocket.getOutputStream()
                                                                    , true);
            BufferedReader in = new BufferedReader(new InputStreamReader
                                               (clientSocket.getInputStream()));
            Scanner tastiera = new Scanner(System.in);
            boolean fine = false;
            String messaggio = null;
            
            // SCRITTURA DATI SU FILE
            // creo un oggetto FileWriter... metodo base per scrivere
            FileWriter fileout = new FileWriter("Javasocket.txt");
            // che incapsulo in un BufferedWriter... riduzione di accessi al file
            BufferedWriter filebufwriter = new BufferedWriter(fileout);
            // che incapsulo in un PrintWriter... metodo base per scivere
            PrintWriter printout = new PrintWriter(filebufwriter);
        
            printout.println("inserire user:");
            printout.close();
            printout.println("inserire password:");
            printout.close();
            
            // LETTURA DATI SU FILE
            // incapsula in BufferedReader un file aperto in lettura 
            BufferedReader filebufreader = new BufferedReader
                           (new FileReader("Javasocket.txt")); 

            String nextStr;
            nextStr = filebufreader.readLine();     // legge una riga del file 
            while (nextStr != null){
                System.out.println(nextStr);        // visualizza la riga 
                nextStr = filebufreader.readLine(); // legge la prossima riga 
            } 
            filebufreader.close();  // chiude il file 
            
            
        }catch (IOExeption ex){
                    Logger.getLogger(ClientSocket.class.getName()).log(Level.SEVERE
                                                                    , null, ex);
               
              
            }   
    }
}