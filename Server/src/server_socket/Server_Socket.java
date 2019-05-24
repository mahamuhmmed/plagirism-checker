
package server_socket;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author wifi
 */
public class Server_Socket {

  
    public static void main(String[] args) {
        try {
            ServerSocket server = new ServerSocket(9090);
            while (true) {
                Socket socket = server.accept();
                ClientThread thread = new ClientThread(socket);
                thread.start();
            }
        } catch (IOException ex) {
            Logger.getLogger(Server_Socket.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
