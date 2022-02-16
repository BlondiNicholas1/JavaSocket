package ServerSocket;
import java.net.*;
import java.io.*;

public class Server {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
          ServerSocket serverSocket = new ServerSocket(5000);
        Socket clientSocket = serverSocket.accept();
        out = new PrintWriter(clientSocket.getOutputStream(), true);
        in = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()));
        String greeting = in.readLine();
            if ("hello server".equals(greeting)) {
                out.println("hello client");
            }
            else {
                out.println("unrecognised greeting");
            }
        in.close();
        out.close();
        clientSocket.close();
        serverSocket.close();
    }
    }catch (IOExeption ex){
        logger.getLogger(Server.class.getName()).log(Level.SEVERE, null, ex);
}
    
}