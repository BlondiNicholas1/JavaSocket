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
            

            // creo un oggetto FileWriter... metodo base per scrivere
            FileWriter fileout = new FileWriter("Javasocket.txt");
            // che incapsulo in un BufferedWriter... riduzione di accessi al file
            BufferedWriter filebuf = new BufferedWriter(fileout);
            // che incapsulo in un PrintWriter... metodo base per scivere
            PrintWriter printout = new PrintWriter(filebuf);
        
            printout.println("Scrivo nel file copyprintwrite.txt:");

        
           
            
            
            
        }catch (IOExeption ex){
                    Logger.getLogger(ClientSocket.class.getName()).log(Level.SEVERE
                                                                    , null, ex);
                    
            }
        
    }

}